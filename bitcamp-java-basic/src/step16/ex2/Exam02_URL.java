// URL(Uniform Resource Locator) - 포트번호 생략
package step16.ex2;

import java.net.URL;

public class Exam02_URL {

    public static void main(String[] args) throws Exception {
        // 웹 상에서 자원의 위치를 표현하는 방법 
        URL url = new URL("http://www.bitcamp.co.kr/a/b/hello.html");

        // URL 분석
        System.out.printf("프로토콜: %s\n", url.getProtocol());
        System.out.printf("서버주소: %s\n", url.getHost());
        System.out.printf("포트번호: %d\n", url.getPort());
        System.out.printf("자원경로: %s\n", url.getPath());
        
        // 웹브라우저에서는 포트번호를 생략하면 80번으로 간주한다.
    }

}






