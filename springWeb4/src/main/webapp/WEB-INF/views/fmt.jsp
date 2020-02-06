<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
<!--     2020-01-20 10:41:55 -->
<!-- 문자열 데이터 타입을 Date라는 데이터 타입으로 변환하는 부분이 parseDate -->
    <fmt:parseDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss" var="parsedDate"/>
    <fmt:formatDate value="${parsedDate}" pattern="yyyy-MM-dd"/>
    
</body>
</html>