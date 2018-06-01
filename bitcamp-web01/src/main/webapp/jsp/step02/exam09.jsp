<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="exam09_error.jsp"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error</title>
</head>
<body>
<h1>오류 처리 JSP</h1>
<pre>

</pre>
<%
//이 페이지에서 일부러 예외를 발생시켜 보자!
//error 라는 파라미터가 있다면 예외를 발생시켜 exam09_error.jsp를 실행하게 한다
if (request.getParameter("error")!= null) {
    throw new Exception("예외 발생");
 
}
%>
</body>
</html>

