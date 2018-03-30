package step11.ex07;

public class A {
    int v1;
    //A클래스는 기본 생성자가 없다
//    int값을 받는 생성자만 있다
    
    A(int value) {
        this.v1 = value;
        System.out.println("A() 생성자");
    }
}

