// 다형성 - 다형적 변수의 활용
package step11.ex09;

public class Exam04 {

//    Sedan 과 Truck이 모델명과 cc 출력
//    다형적 변수가 없다면? 
//    Sedan 의 모델명과 cc를 출력하는 메소드와 
//    truck 의 모델명과 cc를 출력하는 메소드를 모두 만들어야되서 번거롭다
    
    public static void printSedan(Sedan sedan) {
        System.out.printf("Model : %s\n", sedan.model);
        System.out.printf("cc : %d\n", sedan.cc);
        System.out.println("-------------------");
    }
    
    public static void printTruck(Truck truck) {
        System.out.printf("Model : %s\n", truck.model);
        System.out.printf("cc : %d\n", truck.cc);
        System.out.println("-------------------");
    }

//    다형적 변수를 사용하게 되면 동일한 코드를 갖고 있는 위의 메소드를
//    한 개의 메소드로 통합할 수 있다
//    즉 세단 객체와 트럭 객체를 모두 가리킬 수 있는 레퍼런스를 선언한다
//    둘 모두의 상위인 클래스의 레퍼런스를 선언하다 
    public static void printCar(Car car) {
        System.out.printf("Model : %s\n", car.model);
        System.out.printf("cc : %d\n", car.cc);
        System.out.println("-------------------");

    }
    public static void main(String[] args) {
        
        Sedan car1 = new Sedan(); //JVM이 형변환을 처리할 때 진짜 sedan객체가 맞는지 검사한다 따라서 실행오류
        car1.model = "Tico";
        car1.cc = 800;
        
        Truck car2 = new Truck();
        car2.model = "titan";
        car2.cc = 10000;
        printSedan(car1);
        printTruck(car2);
        
//        printSedan()의 파라미터는 Sedan 객체의 주소만 받을 수 있다
//        그래서 Truck객체를 전달받을 수 없다
//        printSedan(car2); 컴파일 오류
//        해결책?
//        Truck을 출력하는 메소드를 따로 만들어 사용하라
        
        
//        해결책2
//        Sedan과 Truck을 모두 처리하는 메소드를 만드렁 사용한다
        printCar(car1);
//        Sedan은 car의 종류라서 괜찮음
        printCar(car2);
        //왜? truck 도 car의 서브 
    }
}