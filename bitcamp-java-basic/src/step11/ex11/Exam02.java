// what if there's no overriding grammar? 
package step11.ex11;

public class Exam02 {
    public static void main(String[] args) {
        A2 obj1 = new A2();
        obj1.name = "홍길동";
        obj1.age = 20;
        
        obj1.print2();
        
//      그런데 A의 print()는 이름만 출력...
//       이 메소드를 변경해야 하는데
//        기존의 A 클래스를 손대지 않고 바꿀 수는 없나
//
//        Overriding
//        유사하거나 같은 기능을 수행하는 메소드를 다른 이름으로 재정의 하지 않기 위함

    }
}
