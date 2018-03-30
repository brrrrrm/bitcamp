package step11.ex10;

public class Exam02 {
    public static void main(String[] args) {
        
//        같은 이름의 메소드가 여러 개이면 
//        아규먼트의 타입과 개수 순서에 따라 
        System.out.println(Calculator.plus(100, 200));
        System.out.println(Calculator.plus(100.5f, 200.2f));
        System.out.println(Calculator.plus("33", "77"));
    }
}
