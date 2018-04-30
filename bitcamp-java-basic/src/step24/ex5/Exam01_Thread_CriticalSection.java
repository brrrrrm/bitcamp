// 비동기 방식으로 인한 문제 및 해결책 
package step24.ex5;

public class Exam01_Thread_CriticalSection {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account("111-11-1111-111", 1000);

        ATM 강남 = new ATM("강남", account);
        ATM 서초 = new ATM("서초", account);
        ATM 부산 = new ATM("부산", account);
        ATM 대전 = new ATM("대전", account);
        ATM 광주 = new ATM("광주", account);
        
        강남.start();
        서초.start();
        부산.start();
        대전.start();
        광주.start(); 
        
        //여러 개의 스레드가 같은 객체의 메소드를 호출하여 동시에 값을 변경하려 할 때 
        //서로 그 메모리의 값을 덮어쓰는 문제가 발생한다
//        이처럼 여러 스레드가 동시에 실행할 때 문제가 발생하는 코드들을 
//        Critical Section(Critical Region)이라한다 - 임계구역
//        이 예제에서는 여러 스레드가 동시에 호출하고 같은 인스턴스의 변수 값을 변경하는 메소드인 withdraw()가 critical section
//        해결책?
//                한번에 한 스레드만이 변수의 값을 변경하도록 접근을 제한하면된다
//                주의 !
//                동시에 여러 스레드가 같은 메모리에 대해 값을 조회할 때는 문제가 발생하지 않는다(읽기만 하니까)
        
                
                
    }
}
