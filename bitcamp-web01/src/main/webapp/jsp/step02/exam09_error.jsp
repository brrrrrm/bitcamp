<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam09</title>
</head>
<body>
<h1>오류 처리 JSP</h1>
<pre>
오류를 처리할 목적으로 만든 JSP페이지는 다음과 같이 page지시 태그에 속성을 추가해야 한다

isErrorPage ="true"

이 속성이 추가되면 오류 정보를 저장하고 있는 exception라는
Throwable 타입의 빌트인 변수가 추가된다
<%-- 다른 서블릿에서 예외가 발생하여 이 페이지를 실행했다면 exception 이라는 변수에 그 예외 정보가 들어있을 것이다 --%>
<%=exception%>
</pre>
</body>
</html>

