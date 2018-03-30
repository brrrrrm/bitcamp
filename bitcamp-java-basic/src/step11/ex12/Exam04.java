package step11.ex12;

public class Exam04 {
    public static void main(String[] args) {
        Member m1 = new Member("Hong Gildong", 20);
        
        Member m2 = new Member("Hong Gildong", 20);
//        m1과 m2는 같은 값을 갖고 있지만 인스턴스가 다르다
        System.out.println(m1 == m2);
        
//        오브젝트로부터 상속받은 해시코드는 인스턴스마다 고유의 해시값을 리턴한다
        System.out.printf("%x %x\n", m1.hashCode(), m2.hashCode());
//        오브젝트로부터 상속받은 toStirng()은 클래스명@해시값을 리턴한다
        System.out.printf("%s %s\n", m1.toString(), m2.toString());
//        오브젝트로부터 상속받은 equals()는 인스턴스 주소가 같은지 검사한다
        System.out.printf("%b\n", m1.equals(m2));
        
        System.out.println("---------------------------------------");
        
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        
        System.out.println(s1 == s2);
        
//         String class 는  오브젝트로부터 상속받은 해시코드를 오버라이딩했다
//        문자열이 같으면 같은 해시값을 리턴하게 만들었다
        System.out.printf("%x %x\n", s1.hashCode(), s2.hashCode());
//        스트링 클래스는 오브젝트로부터 상속받은 투스트링을 오버라이딩했다
//        스트링 인스턴스에 보관된 문자열을 리턴하도록 만들었다
        System.out.printf("%s %s\n", s1.toString(), s2.toString());
//        스트링 클래스는 오브젝트로부터 상속받은 이퀄스를 오버라이딩해
//        문자열이 같은지 비교하도록 만들었다
        System.out.printf("%b\n", s1.equals(s2));

    }
}
