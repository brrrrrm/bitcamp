//Encapsulation
package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_2 extends C{

    public static void main(String[] args) {
//        Car c1 = new Car(); 컴파일 오류
//        생성자가 private 이기 때문에 다른 클래스에서 호출할 수 없다
//        따라서 인스턴스를 생성할 수 없다 
        
//        private 으로 생성하는 이유
//        개발자가 직접 인스턴스를 생성하면 너무 복잡해서
//        다른 메소드를 통해 인스턴스를 생성하라는 의미다
          Car c2 = Car.create("Tico");
          System.out.printf("%s %s %d %d\n", c2.model, c2.maker, c2.cc, c2.valve);
        
    }
}
