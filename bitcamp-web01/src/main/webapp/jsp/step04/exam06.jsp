<%@page import="jsp.Team"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam05</title>
</head>
<body>
<h1>EL : 기타 빌트인 객체</h1>
<pre>
- 저장소 외에 기타 내장 객체가 있다 . 
JSP 객체          ==> EL 객체 표기법
pageContext ==> $ { pageContext }
application ==> $ { pageContext.servletContext }
session     ==> $ { pageContext.session }
request     ==> $ { pageContxt.request }
request.getParameter("파라미터명") ==> $ { param.파라미터명 }
request.getParameterValues("파라미터명") ==> $ { paramValues.파라미터명 }
request.getHeader("헤더명") ==> $ { header.헤더명 }
request.getHeaderValues("헤더명) ==> $ { headerValues.헤더명 }
request.getCookies()[인덱스] ==> $ { cookie.쿠키명 }
request.getInitParameter("파라미터명") ==> $ { initParam.파라미터명 }
</pre>

<%
Member member1 = new Member();
member1.setId("user01");
member1.setEmail("user01@test.com");
member1.setPassword("1111");

Member member2 = new Member();
member2.setId("user02");
member2.setEmail("user02@test.com");
member2.setPassword("1111");

Team team = new Team();
team.setName("팀1");
team.setDescription("웹개발");
team.setMembers(new Member[]{member1, member2});

pageContext.setAttribute("team", team);
%>
${pageContext.getAttribute("team").getName()}<br>
${pageScope.team.name} <br>
${team.name}<br>

</body>
</html>







