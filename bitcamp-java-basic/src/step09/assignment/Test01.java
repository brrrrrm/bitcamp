package step09.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        Calendar c =  Calendar.getInstance();
              
        System.out.print("년, 월, 일? 예(2018 3 21) ");
        int year = keyScan.nextInt();
        int month = keyScan.nextInt();
        int date = keyScan.nextInt();
        
        c.set(year, month -1, date);
        
        String[] weekdays = {"", "일", "월", "화", "수", "목", "금", "토"};
        System.out.printf("요일 : %s요일\n", weekdays[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("주차 : %d주차\n", c.get(Calendar.WEEK_OF_YEAR));
        System.out.printf("일차 : %d일차\n", c.get(Calendar.DAY_OF_YEAR));

    }
}
