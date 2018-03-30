// 다형성 - 다형적 변수 polymorphic variables
package step11.ex09;

public class Exam01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();
        Car car = new Car();
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
 

      //레퍼런스는 같은 타입의 객체를 가리킬 수 있을 뿐 아니라 
      //그 클래스의 서브 객체까지 가리킬 수 있다
      //왜 서브 클래스는 상위 클래스의 모든 것을 사용할 수 있기 때문이다
      //이런 규칙에 따라 다음 vehicle2 변수는 vehicle 객체 뿐만 아니라
      //bike, car, sedan, truck 객체까지 다양한 서브클래스의 객체를 가리킬 수 있다
      //그래서 v2를 다형적 변수의 기능을 갖고있다고 한다 
        
        Vehicle vehicle2 = null;
        vehicle2 = bike;
        vehicle2 = car;
        vehicle2 = sedan;

        Bike bike2 = null;
//        bike2 = vehicle;
//        bike2 = car;
//        bike2 = sedan;
        
        Car car2 = null;
//        car2 = vehicle;
        car2 = sedan;
        car2 = truck;
        
        Sedan sedan2 = null;
//        sedan2 = vehicle;
//        sedan2 = bike;
//        sedan2 = car;
        
    }

}