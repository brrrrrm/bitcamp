//generic 응용
package step13.ex1;

import java.util.HashMap;

public class Exam01_4 {
    public static void main(String[] args) {
        //제네릭 정보가 필요한 클래스를 사용할 때는 
        //어떤 클래스를 다룰 것인지 타입 이름을 알려주어야한다
        //그런데 다음 코드처럼 key 값으로 어떤 클래스를 사용할 것이고 
        //value값으로 어떤 클래스를 사용할 것인지 알려주지 않으면
        //컴파일러가 경고를 띄우지만 실행에 문제는 없다
        //Object타입으로 지정하더라도 클래스 이름을 명시하는 것이 좋다 
        HashMap map = new HashMap(); //Object key, Object value
        map.put("aaa", "bbb");
        map.put(new Integer(100), new Member("Hgil", 20));
        
        //정보를 아무것도 넘기지 않는 것보다 아래처럼 쓰는 것이 낫다 
        //개발자에게 어떤 타입의 key와 어떤 타입의 value를 저장할 것인지 
//        다른 개발자에게 명확히 알려주는 효과가 있기 때문에 다음을 권장
        HashMap<Object, Object> map2 = new HashMap();
        map2.put("aaa", "string");
        map2.put("aaa", "bbb");
        map2.put(new Integer(100), new Member("Hgil", 20));

        HashMap<String, Member> map3 = new HashMap();
//        map3.put("aaa", "string");
//        map3.put("aaa", "bbb");
        map3.put("aaa", new Member("Hgil", 20));
        
        //제네릭을 지정하면  값을 꺼낼 때 형변환할 필요가 없다
        Member m = map3.get("aaa");
        

    }
}
