//부동소수점 변수 - 단정도와 배정도
package step02;

public class Exam05_2{
    public static void main(String []args){
        float f;
        double d;
        //부동소수점 리터럴 값 뒤에 f F를 붙이면 
        //4 바이트 크기의 부동소수점 값을 의미한다
        // 4바이트 크기의 부동소수점 범위를 넘어가기 때문에 
        // 변수(메모리)에 값을 넣기 전에 
        // 이미 리터럴 값이 4byte크기로 변환되며 유효자릿수 밖의 값은 소실된다
        // 따라서 d 변수에 저장된 값은 변환된(소실된) 값이다
        f = 9876.98769876f;
        d = 9876.98769876f;
        System.out.println(f);
        System.out.println(d);

        //정수의 경우 리터럴을 표현할 때에 
        //크기를 넘어서면 컴파일 오류가 발생하지만
        //부동소수점은 컴파일 오류 대신 값이 유실된다

        //double 값을 float 메모리에 저장 => 컴파일 오류
        f = 9876.98769876;
        //double 메모리에 리터럴 값을 넣을 때는 
        //8byte 부동소수점 리터럴을 넣어라(뒤에 f쓸 필요 없다)
        d = 9876.98769876;
        System.out.println(f);
        System.out.println(d);

    }
}