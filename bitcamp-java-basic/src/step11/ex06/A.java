package step11.ex06;

public class A {
    int v1;

    A() {
        System.out.println("A()생성자");
    }
}


//클래스의 수퍼 클래스를 지정하지 않는다면
//자동으로 java.lang.Object 클래스가 수퍼 클래스로 지정된다

//자바의 모든 클래스의 수퍼 클래스는 오브젝트 클래스당

//모든 클래스에는 extends Object가 숨어있는 것
