//String - mutable vs immutable 객체
package step10;

public class Exam01_3 {
    public static void main(String[] args) {
//        string 객체는 immutable하다
          String s1 = new String("Hello");
          
//          String 클래스에서 제공하는 어떤 메소드를 호출해도 
//          원래 데이터는 변경되지 않는다
//          새로운 객체가 생성된다 
          String s2 = s1.replace('l', 'x');
          
          System.out.printf("%s: %s\n", s1, s2);
          
          String s3 = s1.concat(", world!");
          
          System.out.printf("%s: %s\n", s1, s3);
          
//          StringBuffer는 mutable
//          원래의 문자열을 변경하고 싶을 때 사용하는 클래스이다
          StringBuffer buf = new StringBuffer("Hello");
          buf.replace(2, 4, "xx");
          System.out.println(buf);
          
//          StringBuffer를 사용할 때 주의사항
//          StringBuffer의 내용물을 비교할 때 equals를 사용할 수 없다
//          == 연산자와 같은 결과를 출력한다
          
          StringBuffer b1 = new StringBuffer("Hello");
          StringBuffer b2 = new StringBuffer("Hello");
          if(b1.equals(b2))
              System.out.println("b1 == b2");
          else
              System.out.println("b1 != b2");
          
//          해결책
//          StringBuffer에서 string을 꺼내 비교
          
          if(b1.toString().equals(b2.toString()))
              System.out.println("b1 == b2");
          else
              System.out.println("b1 != b2");
    }
}
