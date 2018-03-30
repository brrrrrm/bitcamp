//Wrapper 클래스 

package step10;

public class Exam02_1 {
    public static void main(String[] args) {
//        자바는 primitive data type의 value를 다룰 때 
//        기본 연산자 외에 좀더 다양한 방법으로 다루기 위해 
//        primitive type에 대응하는 Class를 제공한다
        Byte b = new Byte((byte)100);
        Short s = new Short((short)20000);
        Integer i = new Integer(3000000);
        Long l = new Long(60000000000L);
        Float f = new Float(3.14f);
        Double d = new Double(3.14159);
        Boolean bool = new Boolean(true);
        Character c = new Character((char)0x41);
        
//        이렇게 primitive data type에 대응하여 만든 클래스를
//        Primitive data를 포장한다고 하여 wrapper라고 부른다
//        primitive data type의 값을 객체에 담아 전달하고 싶다면
//        언제든 wrapper클래스의 인스턴스를 만들면 된다
        
    }
}
