//논리연산자 : && , ||, ! , ^(XOR)
package step04;

public class Exam03_1{
    public static void main(String[] args){
      //AND 연산자
      //두개의 논리 값이 모두 true일때 결과가 true가 된다
      System.out.println(true&&true);
      System.out.println(true&&false);
      System.out.println(false&&true);
      System.out.println(false&&false);

      System.out.println("======================");
      //OR연산자
    // 두 개의 논리 값 중 하나라도 true이면 결과는 true

    System.out.println(true||true);
    System.out.println(true||false);
    System.out.println(false||true);
    System.out.println(false||false);
    System.out.println("======================");

    //not 연산자
    //true -> false false->true 
    System.out.println(!true);
    System.out.println(!false);
    
    System.out.println("======================");
     //exclusive or 연산자
     //배타적 비교 연산자라 부른다
    //둘의 값이 다를 때 true이다
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);
      //값이 다를 때 작업을 수행하고 싶을 때 사용 
    }
}