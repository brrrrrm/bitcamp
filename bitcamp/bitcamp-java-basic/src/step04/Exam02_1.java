//관계연산자 
package step04;

public class Exam02_1{
    public static void main(String[] args){
       //비교의 결과는 true or false
       //boolean 값이다
       int a = 10;
       int b = 20;
       boolean r1 = a < b;
       //int r2 = a < b; 실행불가

       System.out.println(a < b);
       System.out.println(a <= b); //이상, 이하 부등호 다른 모양은 없음
       System.out.println(a > b);
       System.out.println(a >= b);
       System.out.println(a == b);
       System.out.println(a != b);
        
       
    }
}