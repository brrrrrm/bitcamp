package step11.ex10;

public class B extends A {
    
//    super class A 에 이미 plus()라는 이름을 가진 메소드가 여러 개있다 
//    그러나 파라미터 형식이 다른 메소드를 추가할 수 있다(오버로딩)
    static void m(int a, int b, int c ) {
        System.out.println("m(int, int, int)");
    }
}
