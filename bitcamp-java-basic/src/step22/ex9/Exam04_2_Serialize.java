// Java I/O API 사용하기 - Serialize의 대상 클래스가 변경된 경우
package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam04_2_Serialize {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test9_5.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);

        Score s = (Score) in.readObject();
        //주의 !!
        //deserialize를 통해 인스턴스가 생성될 때는 생성자가 호출되지 않는다
        in.close();
        //transient 변수의 값은 출력되지 않았기 때문에 읽을 수 없다
        System.out.println(s);
        //transient 값은 인스턴스를 준비한 후 별도의 메소드를 통해 다시 계산해야 한다
        s.compute();
        System.out.println(s);
        //데이터 왜곡을 방지하기 위함
        //다른 인스턴스 변수의 값으로 계산한 결과는 읽을 때 다시 계산하도록 하라
        
    }

}










