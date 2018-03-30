//인스턴스 메소드와 클래스 메소드의 활용 - calendar 클래스 
package step09;

import java.util.Calendar;
import java.util.Date;

public class Exam02_5 {
    public static void main(String[] args) throws Exception {
//       캘린더 클래스의 생성자는 프로텍티드로 접근이 제한되어 있기 때문에 
//        다른 패키지에서 직접 호출할 수 없다
        
//        오늘 날짜 및 시간 정보를 저장한 객체를 만들어 리턴한다
        
//      인스턴스 메소드 활용
        Calendar c =  Calendar.getInstance();
        System.out.println(c.get(1)); //년도
        System.out.println(c.get(2) + 1); //월
        System.out.println(c.get(5)); //일
        System.out.println(c.get(7)); //요일
        System.out.println(c.get(10)); //시 
        System.out.println(c.get(11)); //시 
        System.out.println(c.get(12)); //분  
        System.out.println(c.get(13)); //초  
        
//      상수의 활용
        System.out.println(c.get(Calendar.YEAR)); //년도
        System.out.println(c.get(Calendar.MONTH) + 1); //월
        System.out.println(c.get(Calendar.DATE)); //일
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //요일
        System.out.println(c.get(Calendar.HOUR)); //시 
        System.out.println(c.get(Calendar.HOUR_OF_DAY)); //시 
        System.out.println(c.get(Calendar.MINUTE)); //분  
        System.out.println(c.get(Calendar.SECOND)); //초  
        
    }
}
