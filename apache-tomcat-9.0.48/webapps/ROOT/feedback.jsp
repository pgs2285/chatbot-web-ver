<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Jisung Photofolio</title>  
        <meta charset = "utf-8">
        <!-- <meta name ="viewport" content ="width=device-width, initial-scale = 1" > -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
       
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js" integrity="sha384-LtrjvnR4Twt/qOuYxE721u19sVFLVSA4hf/rRt6PrZTmiPltdZcI7q7PXQBYTKyf" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="fadein.css">

    </head>

    <body>
        <div>
            <a class="choice2" href="index.html" style="margin-left:2%"><i class="fa fa-home fa-2x" aria-hidden="true"> </i></a>
            <a class= "choice2" href="myInfo.html" style="margin-left:8%"> <i class="fa fa-user-o" aria-hidden="true"> </i> <b> My Infomation</b></a>
            <a class= "choice2" href="whatido.html" style="margin-left:15%"><i class="fa fa-question-circle" aria-hidden="true"></i><b> What did i do?</b></a>
            <a class= "choice2" href="feedback.jsp" style="margin-left: 15%;"> <i class="fa fa-comment" aria-hidden="true"></i> <b> Feedback</b></a>
            <a class= "choice2" href="https://github.com/pgs2285" style="margin-left:15%"><i class="fa fa-github" aria-hidden="true"></i><b> My Github</b></a>            
        </div>
        <hr class="line2" style="width:200%; border:none; height:3px; background-color:black;">
        <br><br><br>
        <b style="font-size: 20px; margin-left:5%">앞서 구현한 웹사이트 방문자들이 작성 할 수 있는 피드백 혹은 방명록 입니다.</b><br>
        <b style="font-size: 20px; margin-left:5%">편하게 작성해 주셔도 됩니다.</b><br><br><br>

        <div class = "container">
            <div class = "row">
                <form method="post" action="write.jsp">
                    <table>
                        <thead style="color:white; font-size:25px">
                        </thead>
                        <tbody style="color:white; font-size:20px">
                        
                            <tr>
                                <div class="row">
                                    <td><input type = "text" class = "form-control" placeholder="제목입력" maxlength="50" name="feedbackTitle" style="font-size: 20px;"></td>
                                    <td><input type = "text" class = "form-control" placeholder="작성자 입력" maxlength="32" name="feedbackId" style="font-size: 20px; "></td>        
                                </div>    
                            </tr>
                            
                            <textarea type="text" class="form-control" placeholder="글 내용" name="feedbackContent"maxlength="2048"style="font-size: 20px;"></textarea>
                        
                        </tbody>
                    </div>
                    <br>
                    <input type="submit" class = "btn btn-primary pull-right" style="font-size:15px;" value="작성하기!"></input>
                </table>
            </form>
        </div>

        <div class = "container">
            <table class="table table-black">
                <thead style="color:white; font-size:25px">
                  <tr>
                    <th scope="col">작성일자</th>
                    <th scope="col">이름</th>
                    <th scope="col">제목</th>
                    <th scope="col">내용</th>
                  </tr>
                </thead>
                <tbody style="color:white; font-size:20px">
                  
                  <tr>
                    <th scope="row">1</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>test</td>
                  </tr>
                </tbody>
              </table>
              <br>
        </div>

    </body>
</html>