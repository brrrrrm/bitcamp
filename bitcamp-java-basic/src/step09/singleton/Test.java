//singleton패턴
//객체를 하나만 생성할 수 있게 하는 디자인패턴

package step09.singleton;

public class Test {
//    singleton 적용하지 않은 클래스의 인스턴스 만들기
 public static void main(String[] args) {
     Car c1 = new Car();
     Car c2 = new Car();
     Car c3 = new Car();
//    이렇게 인스턴스 생성에 제한이 없다
     System.out.println("----------");
    
     Car2 x1 = Car2.getInstace();
     Car2 x2 = Car2.getInstace();
     Car2 x3 = Car2.getInstace(); 
     if(x1 == x2) 
         System.out.println("x1 == x2");
     if (x2 == x3) 
         System.out.println("x2 == x3");
     }
 }


