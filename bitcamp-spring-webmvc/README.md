# 버전별 주제  
## src02 - 멀티 프론트 컨트롤러 설정
- URL에 따라 여러 개의 프론트 컨트롤러를 설정

## src01 - 프론트 컨트롤러 설정

- XML 기반으로 프론트 컨트롤러 설정하기
- 작업 
 - web.xml 생성
 - DispatcherServlet 가져오기
 - /WEB-INF/dispatcher-servlet.xml 생성
 - /index.html 생성
- 학습
 - DispatcherServlet은 프론트 컨트롤러 역할을 수행
 - DispatcherServlet은 내부적으로 IoC 컨테이너를 보유하고 있다 
 - 그래서 IoC 컨테이너의 설정 파일이 필요하다
 - DispatcherServlet은 다음 규칙에 따라 만든 IoC 컨테이너의 설정 파일을 자동으로 찾는다
   /WEB-INF/서블릿별명-servlet.xml
