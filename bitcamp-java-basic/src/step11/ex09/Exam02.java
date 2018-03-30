// 다형성 - 다형적 변수와 형변환
package step11.ex09;

public class Exam02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle vehicle1 = new Sedan();
        
//        model 과 capacity 변수는 원래 vehicle설계도에 있는 변수이기 때문에
//        당연히 레퍼런스를 통해 사용할 수 있다
        
        vehicle1.model = "Tico";
        vehicle1.capacity = 5;
        
//        자바 컴파일러는 레퍼런스의 클래스를 보고 사용할 수 있는 변수나 메소드인지 아닌지 판단한다
//        비록 vecicle1 변수에 Sedan 객체의 주소가 들어 있다 할지라도 실제 들어있는 객체 주소로 판단하지 않고
//        레퍼런스가 어떤 클래스냐에 따라 판단한다.
//        vehicle1.cc = 1980;
//        vehicle1.valve = 16;
        
//        그럼에도 불구하고 레퍼런스가 실제 가리키는 객체의 모든 메모리에 접근하고 싶다면
//        형변환을 하면 된다 
        ((Sedan)vehicle1).cc = 1980;
        ((Sedan)vehicle1).valve = 16;
        ((Sedan)vehicle1).sunroof = true;
        ((Sedan)vehicle1).auto = true;
        System.out.printf("%s, %d, %d, %d, %b, %b\n", vehicle1.model, vehicle1.capacity,
                ((Sedan)vehicle1).cc, ((Sedan)vehicle1).valve, ((Sedan)vehicle1).sunroof, 
                ((Sedan)vehicle1).auto );
//        불편,,,,,,
//        레퍼런스를 형변환해서 사용하라
        Sedan s = (Sedan)vehicle1;
        
        s.cc = 1980;
        s.valve = 16;
        s.sunroof = true;
        s.auto = true;
        System.out.printf("%s, %d, %d, %d, %b, %b\n", s.model, s.capacity,
                s.cc, s.valve, s.sunroof, s.auto );

    }
}