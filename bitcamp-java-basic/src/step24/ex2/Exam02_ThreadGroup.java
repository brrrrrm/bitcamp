//스레드 그룹
package step24.ex2;

public class Exam02_ThreadGroup {
    public static void main(String[] args) {
        
        Thread main = Thread.currentThread();
        
        //스레드는 그룹으로 묶일 수 있다
        //그룹 단위로 스레드를 시작시키고 멈출 수 있다
        ThreadGroup group = main.getThreadGroup();
        
        System.out.println(group);
        
        //main()메소드를 호출하는 스레드는 메인 스레도 이고 메인 스레드가 소속된 그룹은 메인 그룹이다
    }
}
