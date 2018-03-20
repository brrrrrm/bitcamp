// 생성자 활용 예 - java.util.Date
package step09;

import java.util.Date;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
//        java.util.Date 날짜 데이터를 다루는 클래스
//        날짜데이터를 다룰 수 있는 다양한 메소드 들어 있다
        
//        Date()기본 생성자는 메모리를 오늘 날짜 값으로 초기화한다
        Date d1 = new Date();
        System.out.println(d1);
        
//        년월일값으로 날짜 인스턴스를 초기화시킨다
        Date d2 = new Date(118, 2, 20);
        System.out.println(d2);
//        1970년 1월 1일 0시 0분 0초부터 지금까지 측정된 ms를 가지고 
//        날짜 인스턴스(객체= 메모리) 초기화한다
        
        Date d3 = new Date(1000L * 60 * 60 * 24 * 365 * 50);
        
        
        System.out.println(d3);
    }
}

