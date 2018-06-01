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
<title>exam09</title>
</head>
<body>
	<h1>JSTL - c:forEach : csv</h1>
<pre>
- 반복문 기능을 하는 자바 코드를 만든다. 
&lt;c:forEach itmes="배열 | java.util.Collection|java.util.Enumeration|java.util.Map|csv문자열"
            var="목록에서 꺼낸 항목을 가리키는 이름"
            begin="시작인덱스" 
            end="끝인덱스"
            step="증가량">콘텐트&lt;/c:forEach>
- 목록에서 꺼낸 값은 pageContext 보관소에 저장된다.
- step의 기본 값은 1이다            
</pre>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h2>csv반복하기</h2>
<c:set var="names" value="홍길동,임꺽정,유관순,윤봉길"/>
<c:forEach items="${names}" var="name">
${pageScope.name}
</c:forEach>


</body>
</html>