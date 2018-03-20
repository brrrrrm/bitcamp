//인스턴스와 인스턴스 변수, 인스턴스 메소드

package step08;

public class Exam03_2 {
    static class Calculator {
//        new 명령을 실행하면 다음 변수 선언이 실행되어 Heap에 메모리를 만든다
//        이름에 인스턴스가 붙었다고 해서 
//        인스턴스 메소드는 heap에 만들어지는 것이 아니다
//        클래스의 모든 코드는 메소드 영역에 로딩된다
        int result;
        
        public void plus(int value) {
            this.result += value;  
        }
        public void minus(int value) {
            this.result -= value;
            
        }
    }
    public static void main(String[] args) {
//        heap에 인스턴스 변수가 생성된다
//        인스턴스 메소드가 생성되는 것이 아니다
        
        Calculator c1 = new Calculator();
        
        Calculator c2 = new Calculator();
        
//        인스턴스 메소드던 클래스 메소드건 모두 메소드 영역에 올라간다
//        그리고 인스턴스를 가지고 메소드를 호출하는 것이다
        
//        c1이 가리키는 인스턴스를 가지고 메소드 영역에 있는 plus()를 호출한다
        c1.plus(123);
//        c2이 가리키는 인스턴스를 가지고 메소드 영역에 있는 minus()를 호출한다
        c2.minus(30);
    }
}

