<%@page import="jsp.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>exam04</title>
</head>
<body>
<h1>JSTL - c:set 2</h1>
<pre>
- 객체의 프로퍼티 값을 설정하기
&lt;c:set target="객체주소" property="프로퍼티명" value="저장할값" />
- 객체 주소를 주려면 EL표기법을 사용 
</pre>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
Member member = new Member();
pageContext.setAttribute("member", member);
%>

설정전<br><br>
id: ${member.id}<br>
email : ${member.email}<br>
password : ${member.password}<br>
<hr>

설정후<br><br>
<c:set target="${member}" property = "id" value="user01"/>
<c:set target="${member}" property = "email" value="user01@test.com"/>
<c:set target="${member}" property = "password" value="1111"/>


id: ${member.id}<br>
email : ${member.email}<br>
password : ${member.password}<br>

</body>
</html>