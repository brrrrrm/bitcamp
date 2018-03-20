//인스턴스 메소드와 클래스 메소드의 활용 - Math 클래스
package step09;

import java.util.Date;

public class Exam02_3 {
    public static void main(String[] args) throws Exception {
//        math 클래스는 수학 관련 메소드를 모아둔 클래스이다
//        대부분의 메소드가 클래스 메소드 = 스태틱 메소드이다
        
//        절대값 계산
        System.out.println(Math.abs(-200));
        
//        
        System.out.println(Math.ceil(3.28));
        System.out.println(Math.floor(3.28));

        System.out.println(Math.ceil(-3.28));
        System.out.println(Math.floor(-3.28));
        
        System.out.println(Math.pow(2, 7));
        
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.54));
        

    }
}
