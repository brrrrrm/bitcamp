//문자변수 - UTF-16(유니코드) 코드 
package step02;

public class Exam06_3{
    public static void main(String[] args){
        int a =0xac00;
        System.out.println(a); //a는 int 이기 때문에 그냥 10진수 정수 값을 출력한다
        //println()에게 정수 값을 문자코드라고 알려주면 문자를 출력
        System.out.println((char)a);

        for (int i = 0; i<100;i++){
             System.out.println((char)('가'+i));
            //10자 출력하고 줄바꿈한다. 
             if((i%10)==0){
                 //주어진 수를 문자코드라고 알려준다
                System.out.println();   
            }
        }
    }
   }


