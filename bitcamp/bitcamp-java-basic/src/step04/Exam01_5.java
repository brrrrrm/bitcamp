//암시적 형변환
package step04;

public class Exam01_5{
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.5F;
        double d = 6.6;
        char c = 7;

        //byte + byte = int;
        //byte r1 = b + b; int 로 암시적 형변환 수행
        
        //short + short = int;
        //연산 전에 short가 int 로 암시적 형변환됨 
        //short r2 = s + s;

        //byte + short = int;
        //int로 암시적 형변환 수행
        //short r3 = b + s;

        //byte + int = int
        //byte가 int로 암시적 형변환
        int r4 = b + i;

        //short + int = int
        int r5 = s + i ;
        
        //int + long = long
        //
        int r6 = i+ l;

        //long + float = float
        //long 이 float으로 암시적 형변환 후 연산 수행
        long r7 = l + f;

        //int + float = float 
        //정수 타입의 값과 부동소수점 타입의 값을 연산하면 
        //정수 타입의 값이 암시적 형변을 통해 부동소수점으로 바뀐다
        int r8 = i + f;

        //float + double = double
        float r9 = f + d ;

        //byte + short + int + long + float + double = double!
        long r10 = b + s + i + l + f + d;

        //float + int + long = float
        long r11 = f + i + l;
        //고정형 타입 바인딩 - static type binding 
        
        //변수 "자체"는 한번 타입이 결정되면 절대 바뀌지 않음 

        boolean b1= true;
        //int r12 = b1 + i;
        //컴파일 오류. 산술 연산자는 정수 타입과 부동소수점 타입에 대해서만
        //실행가능
                        
    }
}


