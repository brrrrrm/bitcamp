<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam01</title>
</head>
<body>
<h1>exam01</h1>
<pre>
구동원리
클라이언트가 exam01.jsp 요청
-->  exam01.jsp로 만든 서블릿 클래스가 있다면,
     그리고 exam01.jsp가 변경되지 않았다면 
     해당 서블릿 클래스를 실행한다
--> exam01.jsp로 만든 서블릿 클래스가 없거나 
    또는 exam01.jsp가 변경되었다면,       
        --> [jsp 엔진] 
            --> .java소스 생성  : 배치폴더(ex: tmp0()/work/...)
                --> [java 컴파일러] 
                    --> .class파일 생성
</pre>
</body>
</html>