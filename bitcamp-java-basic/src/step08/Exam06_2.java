//초기화 블록 - 인스턴스 블록
package step08;

public class Exam06_2 {
    static class A {
        int a;
        int b;
        
        {
            //아무 이름 없이 선언하는 블록 "초기화 블록"
//            인스턴스를 생성 후 생성자를 호출하기 전 자동으로 실행한다
            System.out.println("{}1");
        }
        A() {
            this.a = 100;
            System.out.println("A()");
        }
        
        {
            //초기화 블록은 여러 개 정의할 수 있다.
//            순서대로 호출한다
            System.out.println("{}2");
//            초기화 블록을 굳이 나눠서 여러개 정의할 필요는 없다 //유지보수 어려움, 하지말라
            
        }
    }
    public static void main(String[] args) {
        A obj1 = new A();
    }
}
