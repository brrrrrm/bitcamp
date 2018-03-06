//문자변수 - UTF-16(유니코드) 코드 값 저장
package step02;

public class Exam06_2{
    public static void main(String[] args){
        char c1, c2,c3;
        c1 = 0x0041; //A의 유니코드 코드값 (16진수)
        c2 = 65; //10진수
        c3=0b0100_0001; //A의 유니코드 코드값 (2진수)
        //println은 변수의 타입에 따라 출력을 달리한다

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //다음 변수에 문자 코드를 저장하여 출력하라
        char c4;
        c4 = '헐'; //양쪽에 작은 따옴표 사용 - 유니코드 값 알 수 있음 - 자바가
                    //따라서 다음과 같은 코드가 된다
                    //c4=54736;
        System.out.println(c4);
    }
   }
