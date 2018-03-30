//Encapsulation
package step11.ex13;

import java.util.Calendar;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_3 extends C{
    public static void main(String[] args) {

//        java.util.Calendar객체 만들기
//        생성자가 protected로 되어 있다
//        의미?
//        보통 개발자가 클래스를 만들 때는 자신만의 패키지에 넣어서 만든다
//        java.util 패키지를 자신의 클래스를 두기 위해 사용하지는 않을 것이다
//        따라서 calendar 생성자가 protected로 되어 있다는 것은 
//        개발자가 직접 생성자를 호출하지 말라는 뜻이다
//        물론 Calendar를 만든 자신들은 나중에 Calendar의 서브 클래스를 만들 때
//        이 생성자를 직접 사용하겠다는 의도로 생성자를 protected 했음을 알 수 있다
//        
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal1 == cal2);
        
//        getInstance 의 리턴 값을 확인해 보면 다르다는 것을 알 수 있다
//        즉 getInstance()메소드는 singleton 기능을 수행하는 메소드가 아니라 
//        복잡한 Calendar 객체를 대신 생성해주는 Factory method로서 역할을 수행한다
        
//        생성자를 protected로 감추고 getInstance()를 public으로 공개하였다
//        캡슐화를 응용한 예이다
    }
}
