// Java I/O API 사용하기 - serialize와 transient
package step22.ex9;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam04_1_Serialize_Transient {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test9_4.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufOut);
        
        Score s = new Score();
        s.name = "Hong";
        s.kor = 99;
        s.eng = 80;
        s.math = 92;
        
        out.writeObject(s);
        out.close();
        
    }

}

// 용어 정리!
// Serialize   : 객체 ===> 바이트 배열   (marshalling 이라고도 부른다.)
// Deserialize : 바이트 배열 ===> 객체   (unmarshalling 이라고도 부른다.)
// 









