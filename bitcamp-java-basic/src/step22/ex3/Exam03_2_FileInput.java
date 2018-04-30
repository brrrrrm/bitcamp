// 데이터 읽기 - long 값 읽기 
package step22.ex3;

import java.io.FileInputStream;

public class Exam03_2_FileInput {

    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        // Exam03_1을 실행하여 출력한 데이터를 read()로 읽는다. 
        // => 파일에서 8바이트를 읽어 8바이트 long 변수에 저장하라!
        // => 읽은 바이트를 비트이동 연산자를 값을 이동 시킨 후 변수에 저장해야 한다.
        // => 파일에 들어 있는 값 예: 00016bcc41e90000
        long value = (long)in.read() << 56;   
        value += (long)in.read() << 48;
        value += (long)in.read() << 40;
        value += (long)in.read() << 32;
        value += (long)in.read() << 24;
        value += (long)in.read() << 16;
        value += (long)in.read() << 8;     
        value += (long)in.read();            
        
        
        in.close();
        
        System.out.printf("%x\n", value);
    }
}






