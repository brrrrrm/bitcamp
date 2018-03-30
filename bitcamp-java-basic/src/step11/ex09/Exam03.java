// 다형성 - 다형적 변수와 형변환
package step11.ex09;

public class Exam03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle vehicle1 = new Vehicle();
        
        vehicle1.model = "Tico";
        vehicle1.capacity = 5;

        //vechile1변수에는 Vehicle 객체가 들어있다
//        그런데 그 주소가 Sedan 객체의 주소라고 속이면 컴파일은 되지만 실행이 안된당
        
        Sedan s = (Sedan)vehicle1; //JVM이 형변환을 처리할 때 진짜 sedan객체가 맞는지 검사한다 따라서 실행오류
        
        s.cc = 1980;
        s.valve = 16;
        s.sunroof = true;
        s.auto = true;
        System.out.printf("%s, %d, %d, %d, %b, %b\n", s.model, s.capacity,
                s.cc, s.valve, s.sunroof, s.auto );

    }
}