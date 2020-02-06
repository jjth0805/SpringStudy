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

    <h2><a href="/web4/set">JSTL(set) url 사용안한 절대경로</a></h2>
    <h2><a href="<c:url value='/set'/>">JSTL(set) url사용한 절대경로</a></h2>
<!--     절대경로 url사용하기  -->
<!--     이름이 변경되어도 유동적으로 사용가능 -->
    <h2><a href="/web4/if">JSTL(if)</a></h2>
    <h2><a href="/web4/choose">JSTL(choose)</a></h2>
    <h2><a href="/web4/foreach">JSTL(foreach)</a></h2>
    <h2><a href="/web4/fmt">JSTL(fmt)</a></h2>
</body>
</html>