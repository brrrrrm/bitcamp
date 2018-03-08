package step04;

public class Exam01_4{
    public static void main(String[] args){
        int i=5;
        int j=2;
        float k = i/j;
        

        //해결책!
        //변수에 든 값을 다른 타입으로 바꿔라
        //type casting 형변환 
     
        k=(float)i/(float)j; 

        System.out.println(k);
        
        //int int의 연산 결과는 int이다
        //다른 타입이 될 수 없다 
        int x = Integer.MAX_VALUE; //0x7fffffff
        int y = Integer.MAX_VALUE;  //0x7fffffff
        int r1 = x + y; //0x7fffffff+0x7ffffffff = 0xfffffffe =-2
        int r2 = x + y; //0x7fffffff+0x7ffffffff = 0xfffffffe =-2
        System.out.println(r1); //int + int = int
        System.out.println(r2);
    
        // int와 int의 연산결과는 피연산자와 같은 4bte int가 된다
        //그래서 8바이트 long 변수에 저장하기 전에 
        //이미 그 결과는 int값으로 -2가 되기 때문에 long 변수에 저장될 때는 
        //long변수의 값이 -2가 된다

        float f1 = 987.6543f;
        float f2 = 1.111111f;
        float r3 = f1 + f2;
        double r4 = f1 + f2;
        System.out.println(r3); //988.7654; (float + flaot = float) 
            //뒤의 11은 크기를 넘어서 잘린다
            
        System.out.println(r4); //988.765380859375;
        // 왜?
        //float 값을 double 변수에 저장할 때 값의 왜곡이 발생한다 
        //IEEE 754의 이진수 변환 문제 때문

        double d1 = 987.6543;
        double d2 = 1.111111;
        double d3 = d1 + d2;
        double d4 = d1 + d2;

        System.out.println(d3);
        System.out.println(d4);
    
    }

}

//int 끼리 연산하면 결과도 int
//즉 연산 결과는 피연산자의 타입과 같다
//type casting 
//-변수나 리터럴의 다른 타입의 값으로 바꾸는 것
//원래 변수의 타입을 바꾸는 것이 아님
//내부적으로 변수에 들어 있는 값을 꺼내
//지정된 타입의 임시 메모리를 만들어 저장

//최소연산단위는 int
//byte, short 등은 자동으로 int로 바뀌어서 연산됨 (암시적 형변환)
//
//결론!
//1)자바의 최소 연산단위는 int이다
//따라서 int보다 작은 크기의 메모리 값을 다룰 때는 
//내부적으로 int로 자동 형변환을 수행한 다음에 연산한다
//내부적으로 자동으로 형변환 되는 것을 암시적 형변환
//implicit type conversion이라 함
//byte + bytet = int
//short + short = int
//byte + short = int

//2)연산결과는 항상 피연산자의 타입과 같다
//int + int = int
//long + long = long
//float + float = float
//double + double = double

//3)다른 타입과 연산을 수행할 때에는 
//내부적으로 같은 타입으로 맞춘 다음 연산을 수행한다
//Exam01_5.java참고