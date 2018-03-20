//변수의 초기화 - 초기화 문장과 생성자의 실행순서
package step08;

public class Exam05_3 {
    static class A {
        int a = 200;
        
//        생성자는 초기화 문장을 실행한 후에 호출된다
        A() {
            this.a = 300;
        }
    }
    public static void main(String[] args) {
        int c = 300;
        
        A obj1 = new A();
        System.out.println(obj1.a);
//        로컬 변수는 자동 초기화되지 않는다
//        반드시 사용 전에 값을 저장해야 한다
//        System.out.println(c);  컴파일 오류
    }
}
