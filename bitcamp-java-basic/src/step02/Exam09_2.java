//배열 - 초기화
package step02;

public class Exam09_2{
    public static void main(String []args){
        
        //배열 선언
        int[] arr1 = new int[5];
       // int arr1[] = new int[5];
        
        //배열 메모리를 0으로 초기화  
        arr1[0]=0;
        arr1[1]=0;
        arr1[2]=0;
        arr1[3]=0;
        arr1[4]=0;
        
        //배열 선언과 초기화를 한번에 실행
        //int arr2[] = new int[5]{0, 0, 0, 0, 0}; 
        //띄어쓰기 똑같이 하는 것이 좋음, 배열 개수 지정 오류
        int arr2[] = new int[]{0, 0, 0, 0, 0};   //배열선언과 초기화
        int arr3[] = {0, 0, 0, 0, 0};

        int[] arr4; //배열 선언 후 초기화
        arr4 = new int[]{0, 0, 0, 0, 0};

        int[] arr5; //따로 했을 때는 new 생략 불가
        arr5 = {0, 0, 0, 0, 0};
    }
}