<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
        <c:when test="${sessionScope.userid==null}">
                <h2><a href="<c:url value='/member/signupForm'/>">회원 가입 화면</a></h2>
                <h2><a href="<c:url value='/member/loginForm'/>">로그인</a></h2>
        </c:when>
        <c:otherwise>
                ${sessionScope.userid} 님 반갑습니다!<br>
                <h2><a href="<c:url value='/member/logout'/>">로그아웃</a></h2>
        </c:otherwise>
</c:choose>
</body>
</html> 