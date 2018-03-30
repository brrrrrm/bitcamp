package step11.ex01;

public class Exam01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.maker = "Bitcar";
        c1.model = "Tico";
        c1.capacity = 5;
        
        Car c2 = new Car("Bitcar", "Sonata", 5);
                
    }
}
