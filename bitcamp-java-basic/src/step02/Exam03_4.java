//변수 - 변수선언과 값 저장
package step02;

public class Exam03_4{
    public static void main(String []args){
        //모든 메모리를 준비한 후 값 저장
        int a1, a2;
        a1=100;
        a2=200;
        System.out.println(a1);
        System.out.println(a2);

        //변수 선언과 동시에 값 저, 메모리 준비 후 즉시 값으로 초기화 
        int b1=100,b2=200;
        System.out.println(b1);
        System.out.println(b2);

        //여러 개의 변수를 나열할 때 모든 변수의 값을 초기화할 필요는 없다
        int c1=100, c2,c3=100, c4;
        System.out.println(c1);
        System.out.println(c2);//컴파일 오류
        System.out.println(c3);
        System.out.println(c4);//컴파일 오류
        }
}
