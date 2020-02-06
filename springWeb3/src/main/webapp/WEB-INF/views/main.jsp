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

    <h2><a href="/web3/sessionTest1">세션 생성</a></h2>
    <h2><a href="/web3/sessionTest2">서버에서 세션값 확인</a></h2>
    <h2><a href="/web3/sessionTest3">세션 값 삭제(username)</a></h2>
    <h2><a href="/web3/sessionTest4">세션 전체 삭제</a></h2>
    
    <c:if test="${sessionScope.username!=null}">
    <h2>세션값 확인</h2>
    <h2>username : ${sessionScope.username}</h2>
<!--     username이라는 key값을 갖는 sessionScope저장영역 -->
    <h2>vo.a : ${sessionScope.vo.a}</h2>
    <h2>vo.b : ${sessionScope.vo.b}</h2>
    </c:if>
    
    
    <h2><a href="/web3/cookieTest1">서버로 부터 쿠키 받기</a></h2>
    <h2><a href="/web3/cookieTest2">서버로 쿠키 보내기</a></h2>
    
    <h2>쿠키 값 확인</h2>
    <h2>username : ${cookie.username.value}</h2>
    <h2>userid : ${cookie.userid.value}</h2>
</body>
</html>