//Wrapper 클래스 - auto-boxing/auto-unboxing

package step10;

public class Exam02_2 {
    public static void main(String[] args) {
        int i1 = 100;
        
        Integer obj1 = new Integer(i1);
        
        Integer obj2 = new Integer(200);
        int i2 = obj2.intValue();
        
//        auto boxing auto-unboxing
        
//        내부적으로 new Integer(i1)로 변환
        Integer obj3 = i1; //auto boxing
//        int 값으로 자동으로 Integer 랩퍼 객체를 만든다
//        즉 int 값이 obj3에 저장되는 것이 아니라 내부적으로 Integer객체가 생성되는 것
//        객체 안에 포장한다고 해서 오토박싱이라 한다
        
//        auto-unboxing
//        Integer 객체에서 값을 꺼내 리턴한다
//        이렇게 객체 안에 든 값을 자동으로 꺼내주는 것을 오토언박싱이라 함
        
        Integer obj4 = new Integer(300);
        int i3 = obj4; //내부적으로 obj4.intValue()로 바뀐다
//        obj4에 든 주소가 i3에 저장되는 것이 아니라
//        obj4 인스턴스에 든 값을 꺼내 i3에 저장하는 것 
        
        
        
        
    }
}
