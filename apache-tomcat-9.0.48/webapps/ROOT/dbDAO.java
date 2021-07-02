
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbDAO{

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public dbDAO(){
        try{
            String dbURL = "jdbc:mysql://localhost:3306/feedback";
            String dbID = "root";
            String dbPassword="nvidia";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getDate(){
        String SQL = "SELECT NOW()";
        try{
            PreparedStatement pstmt = conn.preparedStatement(SQL);
            rs = pstmt.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return -1; //데이터베이스 오류
    }
    public int getNext(){ //현재 게시글을 내림차순으로 조회 후 작성될 글의 번호를 구함
        String SQL = "SELECT id from contents order by id desc";
        try{
            PreparedStatement pstmt = conn.preparedStatement(SQL);
            rs = pstmt.executeQuery();
            if(rs.next()){ //결과가 있는경우
                return rs.getInt(1) + 1;
            }
            return 1;
        } catch(Exception e){
            e.printStackTrace();
        }
        return -1; //데이터베이스 오류
    }
    public int write(String title, String userID, String content){ //현재 게시글을 내림차순으로 조회 후 작성될 글의 번호를 구함
        String SQL = "INSERT INTO BBS VALUE (?, ?, ?, ?, ?)";
        try{
            PreparedStatement pstmt = conn.preparedStatement(SQL);
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, getDate);
            pstmt.setString(4, getNext);
            pstmt.setString(5, userID);
            return pstmt.executeUpdate;
        } catch(Exception e){
            e.printStackTrace();
        }
        return -1; //데이터베이스 오류
    }

}