// 형변환 - 메모리 크기가 다른 변수의 값을 저장할 때 
package step02;

public class Exam08_2{
    public static void main(String[] args){
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;
        char c = 100;

        byte b2;
        short s2;
        int i2;
        long l2;
        char c2;

        //작은 메모리의 값을 큰 메모리에 넣을 수 있다
        s2 = b; //byte  => short (1 - 2)
        i2 = c; //char => int (2 - 4)     
        i2 = s; //short => int ( 2 - 4)
        l2 = i; // int => long (4 - 8 )


    }
}