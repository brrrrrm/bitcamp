// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생성자 활용을 익혀보자 
package step09;

import java.io.UnsupportedEncodingException;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
//생성자를 호출하여 문자열 인스턴스를 초기화시킨다
        String s1 = new String("Hello");
        String s2 = new String("Hello");
//        s1과 s2는 다른 인스턴스이다
//        증명
        if(s1 == s2) { //s1에 저장되어 있는 주소값과 s2의 주소값을 비교한다
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
//        다른 생성자를 사용하여 String instance를 초기화시키기
        char[] chars = new char[] {'H','e','l','l','o'};
        String s3 = new String(chars);
        System.out.printf("%s %s %s\n", s1, s2, s3);
        
        //byte배열로 스트링만들기
//        가각똘똥 문자를 EUC-KR 코드 값으로 바이트 배열을 만든다
        byte[] bytes = {(byte)0xb0, (byte)0xa1, (byte)0xb0, 
                (byte)0xa2, (byte)0xb6, (byte)0xca, (byte)0xb6, (byte)0xcb};
//        EUC-KR 코드 값이 들어 있는 바이트 배열을 가지고 스트링 인스턴스를 초기화시킨다
//        UTF-16 배열에 저장한다
        String s4 = new String(bytes);
        System.out.println(s4);
//        출력이 깨지는 이유?
//        EUC-KR코드 값이 든 바이트 배열이 제대로 유니코드 배열로 저장되지 않았다
//        이 생성자는 바이트 배열에 들어있는 값이 ISO8859-1라고 간주한다
//        해결책?
//        string 클래스의 생성자 중 바이트 배열과 인코딩 정보를 함께 받는 생성자를 호출한다
//        즉 bytes 배열에 EUC-KR 의 코드 값이 들어있다고 알려준다
//        그러면 자바 버추얼 머신은 바이트 배열에 들어있는 값을 제대로 바꾼다
        
        String s5 = new String(bytes, "EUC-KR");
        System.out.println(s5);
    }
}

