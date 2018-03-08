//논리연산자 : || vs |  
package step04;

public class Exam03_4{
    public static void main(String[] args){
      boolean a = true;
      boolean b = false;
      boolean r = a || (b = true);  //앞에 이미 true 이기 때문에 
                                    //괄호 안 연산 수행하지 않음 
                                    //실행하지 않아서 원래 값 false
                                    //효율 연산 수행
      System.out.printf("a = %b, b = %b, r = %b\n", a, b, r);
      
      a = true;
      b = false;
      r = a | (b = true); //여기서는 그래도 실행함
                          //앞의 값으로 결론을 알아도 끝까지 실행
      System.out.printf("a = %b, b = %b, r = %b\n", a, b, r);
      
    }
}

//