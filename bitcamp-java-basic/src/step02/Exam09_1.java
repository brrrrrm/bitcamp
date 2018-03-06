//배열 선언과 사용- 같은 종류의 메모리를 쉽게 만드는 방법
package step02;

public class Exam09_1{
    public static void main(String []args){
        //배열 사용 전
        int i1,i2,i3,i4,i5;
        //배열 선언
        int[] arr1 = new int[5];
        int arr2[] = new int[5];
        //배열 메모리에 접근 
        arr1[0]=100;
        arr1[1]=200;
        arr1[2]=300;
        arr1[3]=400;
        arr1[4]=500;
        //유효하지 않은 인덱스를 지정한다면, 
        arr1[5]=600; //컴파일은 가능하나 실행이 불가
    }
}