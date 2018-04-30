//system thread 그룹에 소속된 스레드들
package step24.ex2;

public class Exam07_SystemThreadGroup {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        ThreadGroup systemGroup = mainGroup.getParent();
        
        Thread[] arr = new Thread[100];
        int count = systemGroup.enumerate(arr, false);
        
        System.out.println("system 스레드 그룹의 소속 스레드들");
        for (int i = 0 ; i < count ; i ++) {
            System.out.println("    =>" + arr[i].getName());
        }

//        [JVM 프로세스] - 실행중인 프로그램 
//        "system" 스레드 그룹의 소속 스레드들
//         =>main스레드 그룹 : main 메소드 호출
//         =>Reference Handler - 인스턴스 참조 관리
//         =>Finalizer - 가비지 관리
//         =>Signal Dispatcher - 외부 신호 관리
//         =>Attach Listener

    }
    
}
