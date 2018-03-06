package bitcamp.java106.pms;

public class App{
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

         
        String teamName, description, startDate , endDate; 
        //변수 이름 설정 유의
        int maxQty;

        System.out.print("팀명? "); 
        teamName = keyScan.nextLine(); 
        System.out.print("설명? "); 
        description = keyScan.nextLine();
        System.out.print("최대인원? "); 
        maxQty = keyScan.nextInt();
        keyScan.nextLine(); //숫자 뒤의 0d0a를 읽고 아무 것도 하지 않음
                            //줄바꿈 효과
        System.out.print("시작일? "); 
        startDate = keyScan.nextLine();
        System.out.print("종료일? "); 
        endDate = keyScan.nextLine();

        System.out.println("-----------------");
        System.out.println("팀명 : " + teamName);
        System.out.println("설명 :");
        System.out.println(description);
        System.out.println("최대인원 : " + maxQty);
        System.out.println("일자 : " + startDate + " ~ " + endDate);


    }
}