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

    <c:choose>
        <c:when test="${num1 > num2}">
            num1은 num2보다 크다
        </c:when>
        <c:when test="${num1 < num2}">
            num1은 num2보다 작다
        </c:when>
        <c:otherwise>
            num1과 num2는 같다
        </c:otherwise>
    </c:choose>

</body>
</html>