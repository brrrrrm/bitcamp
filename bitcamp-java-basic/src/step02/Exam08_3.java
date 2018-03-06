//형변환 - 정수 변수와 부동 소수점 변수
package step02;

public class Exam08_3{
    public static void main(String[] args){
        byte b = 100;
        short s = 100;
        int i = 98765678;
        long l = 98765678;
        char c = 100;

        float f;
        double d;
        
        //정수 변수의 값을 부동소수점 변수에 저장할 때 
        //저장이 불가능하므로 내부적으로 자동으로 형변환이 이뤄짐

        //정수 변수를 부동소수점 변수에 저장할 떄 값이 잘릴 수 있음
        f = b; //byte => float (1-4)
        System.out.println(f);
        f = s; //short => float (2-4)
        System.out.println(f);
        f = c; //char => byte (2-4)
        System.out.println(f);
        f = i; //int => float (4-4) 
               //가수부 크기(23비트)를 넘는 정수는 잘린다 - 유효자릿수를 넘는 정수는 잘린다
        System.out.println(f);
        f = l; //long => float(8-4)
                //가수부 크기(23비트)를 넘는 정수는 잘린다
        System.out.println(f);
        
        d = i; //int => double (4-8) //double의 가수부는 53비트
                //int(32비트)그대로 저장가능
        System.out.println(d);
        d = l; //long => double (8-8)
        //long값을 double에 저장할 때, 53비트 메모리를 저장하면 값이 잘린다
        //컴파일 에러는 발생하지 않는다
        l=182345345645675678L; //53비트가 넘는 정수
        System.out.println(d);    
   }
}

