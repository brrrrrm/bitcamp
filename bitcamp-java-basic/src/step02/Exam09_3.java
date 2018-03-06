// 배열 레퍼런스와 배열 인스턴스
package step02;
    public class Exam09_3{
        public static void main(String[] args){
            //레퍼런스 변수
            //메모리의 주소를 담는 변수
            int[] arr1;

            //new 명령은 메모리를 확보하는 명령
            arr1= new int[5];
            arr1[0]= 100; //=> arr1에 저장된 주소로 찾아가서 0번째 항목에 값을 넣어라
            arr1[1]= 200; //=> arr2에 저장된 주소로 찾아가 1번째 항목에 값을 넣어라
            System.out.println(arr1[0]);
            System.out.println(arr1[1]);
            //한번이라도 값을 넣지 않은 상태에서 메모리의 값을 사용하려 하면 컴파일 오류
            int a;
            //System.out.println(a);

            //하지만 new 명령으로 확보된 메모리는 
            //종류에 관계 없이
            //자동으로 0값으로 초기화 
            //따라서 값을 넣지 않고 바로 사용할 수 있다
            System.out.println(arr1[1]);
            System.out.println(arr1[2]);
            System.out.println(arr1[4]);
            
        }
    }