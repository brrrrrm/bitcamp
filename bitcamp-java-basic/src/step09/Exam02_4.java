//인스턴스 메소드와 클래스 메소드의 활용 - Date 클래스 
package step09;

import java.util.Date;

public class Exam02_4 {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        
        
        System.out.println(d1.getYear() + 1900);
        System.out.println(d1.getMonth() + 1);
        System.out.println(d1.getDate());
        
        long millis = Date.parse("Sat, 12 Aug 1995 13:30:00 GMT");
        System.out.println(millis);
        
//        실무에서는 java.util.date 보다 sql.date을 많이 쓴다
//        이 클래스는 날짜 데이터를 문자열로 다룰 때
//        yyyy-MM-dd 형식으로 다룸
        
//        스태틱 메소드 활용
        long currentMs = System.currentTimeMillis();
        
//        생성자 활용
        java.sql.Date today = new java.sql.Date(currentMs);
        
//        인스턴스 메소드 활용 
        
        String str = today.toString();
        System.out.println(str);
        
//        static method
        java.sql.Date d = java.sql.Date.valueOf("2018-03-21");
        
    }
}
