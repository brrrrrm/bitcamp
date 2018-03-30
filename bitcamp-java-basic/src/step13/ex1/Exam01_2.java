//generic 사용전
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_2 {
    public static void main(String[] args) {
//      generic
//        다루는 타입을 제한할 수 있다
//        지정된 타입 외에 다른 타입은 저장할 수 없다
//        방법 
//        클래스명 옆에 다루고자하는 타입의 이름을 지정한다
//        클래스명<타입명>
        
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("Hong Gildong", 20));
//        지정한 타입이 아닌 경우에는 컴파일 오류가 발생한다
//        컬렉션에 잘못된 값이 들어갈 상황을 차단할 수 있다
//        list.add(new String ("Hello"));
//        list.add(new Integer(100));
//        list.add(new HashSet());
        
//        레퍼런스에 제네릭 정보가 있다면 new 뒤에서는 생략 가능
        ArrayList<Member> list2 = new ArrayList();
        
        ArrayList<Member> list3;
        list3 = new ArrayList();
        
        //반대는 불가
        
       
    }
}
