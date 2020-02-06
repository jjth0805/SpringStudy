<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--     model.addAttribute("num1","111"); 밑에 코어태그에 set형식에 있는 내용과 동일함-->
    <c:set var="num1" value="111" scope="request"/>
    <c:set var="num2" value="222" scope="request"/>
    ${requestScope.num1}<br>
    ${requestScope.num2}<br>
<!--     저장영역 설정 -->
</body>
</html>