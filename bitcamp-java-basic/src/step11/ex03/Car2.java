package step11.ex03;

public class Car2 {
    String model;
    String maker;
    int capacity;
    boolean sunroof;
    boolean auto;
    
//    이전 프로그램에서 다음 생성자를 사용하기 때문에 이 생성자의 파라미터를 덧붙일 수는 없다
    public Car2() {}
    
//    새로 생성자를 추가해야 한다
    public Car2(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
    }
    
    public Car2(String model, String maker, int capacity,
            boolean sunroof, boolean auto) {
        this(model, maker, capacity);
        
        this.sunroof = sunroof;
        this.auto = auto;
    }
}
