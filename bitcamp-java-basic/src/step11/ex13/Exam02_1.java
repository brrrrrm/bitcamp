//Encapsulation
package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_1 extends C{

    public static void main(String[] args) {
        A obj1 = new A();
//        obj1.privateVar = 100; 접근 불가
//        오직 클래스 내에서만 사용가능
        obj1.defualtVar = 100;
//        본 클래스는 A 클래스와 같은 패키지 소속
        obj1.protectedVar = 100;
//        비록 자식 클래스는 아니지만 같은 패키지에 소속
        obj1.publicVar = 100;
        
        B obj2 = new B();
        
        obj2.publicVar = 100;
//        obj2.protectedVar = 100; 
        
        C obj3 = new C();
        
//        obj3.privateVar = 100;
//        obj3.defaultVar = 100;
//        obj3.protectedVar = 100;  sub class인데 접근 불가!!!!! 자신의 인스턴스 변수가 아니다
        obj3.publicVar = 100;
        
        Exam02_1 obj4 = new Exam02_1();
//        obj4.privateVar = 100; 접근 불가, C class에서만 접근 가능
//        obj4.defaultVar = 100; 접근 불가, C class와 같은 패키지가 아니다
        obj4.protectedVar = 100; //Exam02_1은 C의 sub class 이며 C로부터 상속받아 만든 자기 변수이다 
        
     
    }
    
}

//private 그 클래스 내부에서만 접근 가능
//default private + same package
//protected default + 자식 클래스에서 자신이 만든 변수일 경우 접근 가능
//public 모든 클래스

// 실무 
// 인스턴스 변수는 보통 private으로 접근을 제한한다
// getter setter 는 public 으로 접근을 모두에게 공개한다
// 일반 메소드도 퍼블릭으로 접근을 모두에게 공개한다
// 그 클래스 내부에서만 사용되는 메소드는 private 으로 접근을 제한한다
// 자식 클래스의 접근을 허용할 필요가 있을 경우에만 protected로 만든다
// 다른 개발자가 사용한 클래스 모음을 만들 때 
// 그 모음집 내에서만 사용될 변수나 메소드인 경우 default 로 접근을 제한한다
// 즉 라이브러리를 만드는 개발자일 경우 default를 사용하는 경우가 있다

// 