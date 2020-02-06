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

    <c:if test="${num1 < num2}">
        num1은 num2보다 작다<br>
    </c:if>
    <c:if test="${num1 > num2}">
        num1은 num2보다 크다<br>
    </c:if>
    <c:if test="${name1 == name2}">
        name1과 name2는 같은 문자다.<br>
    </c:if>
    <c:if test="${name1 != name2}">
        name1과 name2는 같지 않다.<br>
    </c:if>
</body>
</html>