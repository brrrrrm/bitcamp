package step11.ex13;

public class Car {
    String model;
    String maker;
    int cc;
    int valve;
    
//    외부에서 직접 인스턴스를 생성하는 것을 막기 위해
//    생성자를  private 으로 선언
    private Car() {}
    
//    대신 객체를 생성해주는 static method를 준비한다
//    언제 이렇게 인스턴스를 직접 생성하지 않고 스태틱 메소드를 통해 인스턴스를 생성하는가?
//    다음의 경우처럼 인스턴스 생성과정이 복잡할 경우에 
//    직접 인스턴스를 생성하기 보다는 
//    인스턴스를 생성해주는 메소드를 사용하여 
//    인스턴스를 만든다
//    singleton패턴에서 getInstance 메소드는 오직 한 개의 메소드만 사용한다
//    즉 메소드의 목적은 단지 인스턴스를 한 개만 만들어 사용하기 위함이다
//    그러나 다음  create()메소드는 호출할 때마다 인스터를 만들어 주기 때문에
//    singleton과 구조가 비슷하나 singleton 이 아니다
//    이 메소드의 목적은 복잡한 인스턴스 생성을 대신 해주는 것이다
//    언제 이렇게 설계?
//    인스턴스 생성과정이 복잡할 경우에 이용하는 방법이다
//    메소드를 통해 인스턴스를 생성하면 
//    인스턴스를 사용하고픈 개발자는 코드가 간결해서 좋다
//    "Factory Method" pattern
    public static Car create(String name) {
        Car c = new Car(); //private 은 클래스 안에서 사용할 수 있다
        switch (name) {
        case "Tico" :
            c.model = "Tico";
            c.maker = "Daewoo";
            c.cc = 800;
            c.valve = 16;
            break;
        case "Sonata" :
            c.model = "Sonata";
            c.maker = "Hyundai";
            c.cc = 1980;
            c.valve = 16;
            break;
        default :
            c.model = "Model S";
            c.maker = "Tesla";
            c.cc = 0;
            c.valve = 0;
        }
        return c;
    }
}
