//논리연산자 : && vs &    
package step04;

public class Exam03_3{
    public static void main(String[] args){
      boolean a = false;
      boolean b = false;
      boolean r = a && (b = true);  //앞에 이미 false 이기 때문에 
                                    //괄호 안 연산 수행하지 않음 
                                    //실행하지 않아서 원래 값인 false
                                    //효율 연산 수행
      System.out.printf("a = %b, b = %b, r = %b\n", a, b, r);
      
      a = false;
      b = false;
      r = a & (b = true); //여기서는 그래도 실행함
                          //앞의 값으로 결론을 알아도 끝까지 실행
      System.out.printf("a = %b, b = %b, r = %b\n", a, b, r);
      
    }
}
/*
&& 
앞의 피연산자로 결과를 알 수 있다면 뒤의 명령은 실행하지 않는다

&
앞의 피연산자로 결과를 알 수 있을지라도 
뒤의 명령까지 그대로 실행한다
*/