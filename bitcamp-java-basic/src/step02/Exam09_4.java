// 배열 레퍼런스와 배열 인스턴스의 관계
// 가비지와 가비지컬렉터
package step02;
    public class Exam09_4{
        public static void main(String[] args){
            int[] arr1;
            arr1 = new int[]{100, 200, 300};

            System.out.println(arr1[0]);
            System.out.println(arr1[1]);
            System.out.println(arr1[2]);
            
            //새로운 배열을 확보하여 arr1레퍼런스에 그 주소를 저장
            //arr1 변수에는 새 배열의 주소가 저장된다
            //그러면 이전 배열의 주소는 잃어버린다
            //주소를 잃어버린 배열은 사용할 수 없다 
            //이렇게 사용할 수 없는 메모리(인스턴스)를 garbage라 부른다
            //garbage는 개발자가 임의로 제거할 수 없다

            arr1 = new int[]{10,20, 30, 40, 50};
            System.out.println(arr1[0]);
            System.out.println(arr1[1]);
            System.out.println(arr1[2]);

            
        }
    }