//generic 사용전
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_3 {
    public static void main(String[] args) {
//      generic
//        다루는 타입을 제한할 수 있다
//        지정된 타입 외에 다른 타입은 저장할 수 없다
//        방법 
//        클래스명 옆에 다루고자하는 타입의 이름을 지정한다
//        클래스명<타입명>
        
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("Hong Gildong", 20));
        
//        제네릭을 지정하면 메소드의 타입이 자동으로 캐스팅된다
        Member member = list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
        
//        만약 제네릭이 없다면 
//        값을 꺼낼 때마다 형변환을 하거나
//        값의 종류별로 ArrayList를 만들어야한다
        
//        제네릭 문법이 존재하므로
//        한 개의 클래스로 여러 타입의 객체를 형변환없이 다룰 수 있다
    }
}
