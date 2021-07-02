<%@ page language="java" contentType="text/html' charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dbDAO"%>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="feedback" class="db" scope="page"/>
<jsp:setProperty name="feedback" property="db"/>
<jsp:setProperty name="feedback" property="db"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
        dbDAO DAO = new dbDAO();
        int result = DAO.write();

        if(result == -1){
            PrintWriter script = response.getWriter();
            script.println("<script> alert('글쓰기에 실패했습니다'); history.back() </script>");
        
        }else {
            PrintWriter script = response.getWriter();
            script.println("<script> alert('글쓰기 성공'); location.href='feedback.jsp'</script>");
        }
        %>    
    </body>
</html>


