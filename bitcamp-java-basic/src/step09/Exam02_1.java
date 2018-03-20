//인스턴스 메소드와 클래스 메소드의 활용 - String 클래스
package step09;

public class Exam02_1 {
    public static void main(String[] args) throws Exception {
        String s1 = new String ("Hello");
        
//        s1 인스턴스(s1 레퍼런스가 가리키는 인스턴스)의 값을 조회하는 메소드
        //따라서 이 메소드를 호출하려면 반드시 String 인스턴스의 주소를 줘야 한다
        char c = s1.charAt(0);
        System.out.println(c);
        
        System.out.println(s1.compareTo("Helli"));
        System.out.println(s1.compareTo("Hello"));
        System.out.println(s1.compareTo("Hellu"));
        
        System.out.println(s1.contains("ll"));
        System.out.println(s1.contains("ee"));
        
//        두 문자열을 연결하여 새 문자열을 만들자
        String s2 = s1.concat(", World!");
        System.out.println(s1); //기존 인스턴스의 값은 변경하지 않고 새로 문자열 생성
        System.out.println(s2);
        
        //두 인스턴스에 든 문자열이 같은 지 비교
        System.out.println(s1.equals("aaa"));
        System.out.println(s1.equals("Hello"));
        
        //인스턴스에 들어있는 문자 코드를 바이트 배열로 만들어 리턴한다
        String s3 = new String("ABC가각");
        
//        인스턴스에 들어 있는 각 문자를 바이트 배열에 저장할 때 
//        인코딩 문자 집합을 지정하지 않으면 
//        JVM의 기본 문자 집합으로 UTF-8로 문자표를 지정하여
//        바이트 배열에 코드 값을 저장한다
        
        byte[] bytes = s3.getBytes();
        for (int i = 0; i < bytes.length ; i++) {
            System.out.printf("%x ", bytes[i]);
        }
        System.out.println();
        
//        다른 instance method를 사용하여 바이트 배열을 추출해보자
        bytes = s3.getBytes("EUC-KR");
        for (int i = 0 ; i < bytes.length ; i++) {
            System.out.printf("%x ", bytes[i]);
        }
        System.out.println();
        
//        string 클래스에도 특정 인스턴스가 아닌 일반 목적으로 문자열을 다룰 수 있는 메소드를 제공한다
//        클래스 메소드 = 스태틱 메소드 제공
        
//        형식을 갖춘 문자열을 만들기
        String s4 = String.format("%s님 반갑습니다.\n", "홍길동");
        System.out.println(s4);
        
        //구분자와 문자열들을 파라미터로 받아서 새 문자열을 만든다
        String s5 = String.join(":", "홍길동", "임꺽정", "유관순");
        System.out.println(s5);
        
//        primitive type 값을 문자열로 만든다
        String s6 = String.valueOf(true);
        String s7 = String.valueOf(3.14f);
        String s8 = String.valueOf(100);
        
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
    }
    
}
