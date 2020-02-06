<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[회원 가입]</title>
<script>
    function formCheck() {
         var custidDoc = document.getElementById("custid");
         var custpwd1Doc = document.getElementById("custpwd1");
         var custpwd2Doc = document.getElementById("custpwd2");

         if (custidDoc.value.length < 5) {
              alert("ID는 5글자 이상 입력해주세요.");
              return false;
         }

         if (custpwd1Doc.value !== custpwd2Doc.value) {
              alert("비밀번호가 일치하지 않습니다.");
              return false;
             }
         return true;
}
</script>
</head>
<body>
<h1>회원가입</h1>
<form action="join" method="post" onsubmit="return formCheck()">
    <table>
        <tr>
            <td>고객 ID</td>
            <td><input type="text" name="custid" id="custid"></td>
        </tr>
        
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="custpwd1" id="custpwd1"></td>
        </tr>
        <tr>
            <td>비밀번호 확인</td>
            <td><input type="password" id="custpwd2"></td>
        </tr>
        
    </table>
    <input type="submit" value="가입">
</form>
</body>
</html>