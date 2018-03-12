//상수 변수의 값을 고정하는 방법

package step02;

public class Exam10_1 {
    public static void main(String[] args) {
        //변수 : 언제든지 값을 변경 가능
        int a;
        a = 10;
        a = 100;
        a = -300;

        //상수 : 값을 오직 한번만 저장할 수 있다
        //변수 앞에 final을 붙여라

        final int b = 100;


        b = 200;
        
        //변수와 상수를 구분하기 위해
        //상수는 보통 이름을 모두 대문자로 작성한다
        //그리고 변수를 선언하는 문장에서 바로 값을 초기화한다
        final float PI = 3.14159f;
        final float MILE = 0.621371f;
    }
}

