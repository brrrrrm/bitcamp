// HashMap vs Hashtable
package step12.ex6;

import java.util.HashMap;
import java.util.Hashtable;

public class Exam03_1 {
    public static void main(String[] args) {

        
//        동기화를 지원하지 않는다 
//        멀티스레드가 동시에 사용할 때 문제가 발생할 수 있다
//        그러나 속도가 빠르다
        HashMap map = new HashMap();
      //null을 키, 값으로 사용할 수 있다
        map.put(null,  "Hong Gildong"); 
        map.put("s01", null);
        
        Hashtable table = new Hashtable();
        //table.put(null, "Hong Gildong"); //key가 null이 될 수 없다
//        table.put("s02", null); //value가 null이 될 수 없다
        
    }
}

