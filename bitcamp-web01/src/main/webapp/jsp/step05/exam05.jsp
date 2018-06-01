<%@page import="jsp.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>exam05</title>
</head>
<body>
<h1>JSTL - c:remove</h1>
<pre>
- 저장소에 저장된 객체 제거하기
    &lt;c:remove var="변수명" scope="page|request|session|application"/>
</pre>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
Member member = new Member();
member.setId("user01");
member.setEmail("1111");
member.setPassword("1111");
pageContext.setAttribute("member", member);
%>

제거 전<br><br>
id: ${member.id}<br>
email : ${member.email}<br>
password : ${member.password}<br>
<hr>

제거 후<br><br>
<c:remove var="member" scope="request"/>

id: ${member.id}<br>
email : ${member.email}<br>
password : ${member.password}<br>

</body>
</html>