package step11.ex05;

public class Exam01 {
    public static void main(String[] args) {
        A obj1 = new A();
//        A클래스의 설계도에 따라 Heap영역에 변수를 준비한다
        obj1.v1 = 100;
        
//        B클래스의 설계도에 따라 Heap 영역에 변수를 준비한다
//        B클래스는 A 클래스도 사용한다고 선언했기 때문에
//        A클래스의 설계도에 따라 A 클래스에 선언된 인스턴스 변수도 함께 생성된다
        
        B obj2 = new B();
        obj2.v2 = 200;
        obj2.v1 = 100;
        System.out.printf("v2  = %d , v1 = %d\n", obj2.v2, obj2.v1);
        
//        B 클래스가 사용한다고 선언한 클래스를 먼저 메모리에 로딩한다
//        즉 A 클래스를 먼저 로딩한다
//        A 클래스에 선언된 대로 인스턴스 변수를 힙에 만든다
//       B 클래스에 선언된 대로 인스턴스 변수를 힙에 만든다
        
//        그래서 인스턴스를상속 받을 때는 항상 상속 받아야하는 클래스 파일이 모두 있어야한다
        
    }
}

// 용어 정리
// Inheritance
// 기존에 만든 클래스를 자신의 코드처럼 사용하는 기법
// 보통 기존 코드를 손대지 않고 새 코드를 덧붙일 때 많이 사용한다
// super class (parent class)
// 상속해주는 클래스
// sub class (child class)
// 상속받는 클래스