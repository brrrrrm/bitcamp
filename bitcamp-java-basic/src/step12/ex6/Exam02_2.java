//key/value 한쌍으로 묶어 꺼내기
package step12.ex6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import step11.ex12.Member;

public class Exam02_2 {
   
    public static void main(String[] args) {
        Member m1 = new Member("a", 20);
        Member m2 = new Member("b", 30);
        Member m3 = new Member("c", 15);
        Member m4 = new Member("d", 30);
        Member m5 = new Member("e", 25);
        
        HashMap map = new HashMap();

        map.put("s01", m1);
        map.put("s02", m2);
        map.put("s03", m3);
        map.put("s04", m4);
        map.put("s04", m3);
        
//        key/value가 한 쌍으로 묶인 객체들이 든 집합
        Set entrySet = map.entrySet();
        
        for(Object obj : entrySet) {
            //Set컬렉션에 든 객체는 원래 엔트리 객체이다
//          Entry 객체에서 키와 값을 꺼내려면 
//          원래의 타입으로 형변환 해야한다 
            Entry entry = (Entry) obj;
            System.out.printf("%s\n %s\n", entry.getKey(), entry.getValue());
        }
        
    }
}
