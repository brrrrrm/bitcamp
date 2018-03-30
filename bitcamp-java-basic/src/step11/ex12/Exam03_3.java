//오버라이딩 - 응용 예

package step11.ex12;

public class Exam03_3 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.endsWith(s2));
//        String class 에서 equals()  를 오버라이딩했ㅅ기 때문에 true 가 나오는 것
//        원래  equals 는 주소를 비교
        
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        //sb1.equals sb2의 리턴값은 false 
//       StringBuffer 는 오버라이딩 하지 않앗으 ㅁ
//         object의 equal 는 인스턴스가 같은지를 비교한다
    }
}

