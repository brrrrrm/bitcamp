//논리변수 - 유효한 값 범위
package step02;

public class Exam07_1{
    public static void main(String []args){
     //0~65535까지의 UTF-16값을 저장하는 2바이트 메모리
        boolean b1,b2;
        b1 = true; //실제 메모리에는 1저장
        b2 = false; //실제 메모리에는 0저장

        System.out.println(b1);
        System.out.println(b2);

        //직접 정수 값을 저장하려해서는 안된다
        // b1 = 1; 컴파일 오류 ! (C언어와 다름)
    }
}