<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <a href = "send1?a=테스트&b=111">a태그로 데이터전송(GET)</a>
<!-- 여러개의 데이터는 &로연결한다 다만 띄어쓰기 금지 -->
<!-- a태그는 get방식으로밖에 전송이 안됨 -->
	<h2>form 태그로 전송(GET)</h2>
	<form action="send2" method="get">
	    a <input type="text" name="a"><br>
	    b <input type="text" name="b"><br>
	    <input type="submit" value="전송">
	</form>
	<h2>form 태그로 전송(GET / VO)</h2>
    <form action="send3" method="get">
        a <input type="text" name="a"><br>
        b <input type="text" name="b"><br>
        <input type="submit" value="전송">
    </form>
        <h2>form 태그로 전송(POST / VO)</h2>
    <form action="send4" method="post">
        a <input type="text" name="a"><br>
        b <input type="text" name="b"><br>
        <input type="submit" value="전송">
    </form>
    <h2>form 태그로 전송(POST)</h2>
    <form action="send5" method="post">
        a <input type="text" name="a"><br>
        b <input type="text" name="b"><br>
        <input type="submit" value="전송">
    </form>
    <a href = "send6?a=테스트&b=111">a태그로 데이터전송(GET)</a>
</body>
</html>