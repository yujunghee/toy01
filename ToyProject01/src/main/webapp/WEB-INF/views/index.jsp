<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${user}" var="user">
		<h2>user id = "${user.userId}"</h2>
		<h2>user name = "${user.username}"</h2>
	</c:forEach>
</body>
</html>