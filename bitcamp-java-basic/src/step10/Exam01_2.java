//String - 문자열 비교
package step10;

public class Exam01_2 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        
//        인스턴스의 주소가 아닌 인스턴스의 데이터가 같은지 비교할 때는 
//        equals라는 메소드를 사용한다
        if (s1.equals(s2)) 
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");
        
        if (s1.equals(s3))
            System.out.println("s1 == s3");
        else
            System.out.println("s1 != s3");
    }
}
