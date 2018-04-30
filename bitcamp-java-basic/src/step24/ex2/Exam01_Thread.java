//현재의 실행 라인을 알아내기
package step24.ex2;

public class Exam01_Thread {
    public static void main(String[] args) {
        //이 순간 실행중인 흐름이 무엇인지 알고 싶다면?
        Thread t = Thread.currentThread();
        System.out.println("실행흐름명 " + t.getName());
        //실행 흐름 = thread
        //JVM이 실행될 때 main()메소드를 호출하는 실행 흐름의 이름은 main이다
        
    }
}
