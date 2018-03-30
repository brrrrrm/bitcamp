//generic 사용전
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_1 {
    public static void main(String[] args) {
        //어떤 타입의 데이터를 저장할지 지정하지 않으면 
//        기본적으로 오브젝트 타입의 객체를 다루는 것으로 간주한다
        //즉 오브젝트 타입이라면 어떤 클래스든 저장하고 꺼낼 수 있다
       
        ArrayList list = new ArrayList();
        list.add(new Member("Hong Gildong", 20));
        list.add(new String ("Hello"));
        list.add(new Integer(100));
        list.add(new HashSet());
        
        //값 꺼내기
//      객체의 값을 꺼낼 때는 보통 해당 클래스로 형변환한 다음에 사용해야한다 
//      왜냐면 get()을 하면 Object타입으로 리턴되기 때문
        Member member = (Member) list.get(0);
        System.out.println(member.name);
        
//        값을 꺼낼 때마다 원래 클래스로 type casting 해야해서 불편
        
    }
}
