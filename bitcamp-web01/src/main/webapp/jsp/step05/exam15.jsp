<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jsp.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>exam15</title>
</head>
<body>
	<h1>JSTL - c:formatDate </h1>
<pre>
- java.util.Date 객체를 특정 형식의 문자열로 출력하는 태그
&lt;fmt:formatDate value="날짜 객체" pattern = "출력형식" var="문자열 저장 이름" scope="저장소"/> 
</pre>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h2>오늘 날짜를 다양한 형식으로 출력</h2>
<%
pageContext.setAttribute("today", new Date());
%>
<fmt:formatDate value="${today}" pattern ="yyyy-MM-dd" var="str1" scope="page"/>

날짜 : ${str1 }<br>

바로 출력하고 싶다면 저장소에 저장하지 말라<br>
<fmt:formatDate value="${today}" pattern ="yyyy-MM-dd" /><br>
<fmt:formatDate value="${today}" pattern ="MM/dd/yyyy" /><br>
<fmt:formatDate value="${today}" pattern ="MM/dd/yy" /><br>


</body>
</html>