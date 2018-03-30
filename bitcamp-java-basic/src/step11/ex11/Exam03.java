package step11.ex11;

public class Exam03 {
    public static void main(String[] args) {
        A3 obj1 = new A3();
        obj1.name = "홍길동";
        obj1.age = 20;
        
//        A3클래스에서 A클래스의 print()를 재정의했기 때문에 
//        다음 호출하는 메소드는 A3의 print()메소드가 된다 
        obj1.print();
    }
}


//Overriding

//상속받은 메소드 중 서브 클래스 역할에 맞지 않는 메소드가 있다면 자신의 역할에 맞추어 
//서브 클래스의 역할에 맞춰 재정의하여 프로그래밍의 일관성을 확보하는 문법