//관계연산자 : 부동소수점 비교
package step04;

public class Exam02_2{
    public static void main(String[] args){
        
        double d1 = 987.6543;
        double d2 = 1.111111;
        System.out.println((d1 + d2) == 988.765411);
        System.out.println(d1 + d2 );
        //결과는 false
        /*
        왜?
        부동 소수점을 연산하는 과정에서 
        IEEE754명세에 따라 작업을 수행한다
        그 과정에서 값의 왜곡이 발생할 수 있다
        cpu나 os, 언어의 문제가 아님
        IEEE754명세에 따라 부동소수점을 처리하는 모든 컴퓨터에서 발생하는 문제
        */
        
        double x = 234.765411;
        double y = 754.0;
        System.out.println(x + y);

        System.out.println((d1 + d2)==(x + y));

        double EPSILON = 0.00001; //쓰레기 값을 얼마 이하로 설정
        System.out.println(Math.abs((d1 + d2)-(x + y))<EPSILON);
        //쓰레기값이 끝에 붙음 값의 왜곡
        //왜곡된 값이 예상보다 작으면 true

    }
}