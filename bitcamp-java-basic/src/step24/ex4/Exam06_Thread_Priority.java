// 스레드의 생명주기(lifecycle) - 우선순위 설정
package step24.ex4;

public class Exam06_Thread_Priority {
    public static void main(String[] args) throws Exception {
        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 100000000; i++)
                    Math.asin(38.567);
                long endTime = System.currentTimeMillis();
                System.out.println("MyThread " + (endTime-startTime));
            }
        }
        Thread.currentThread().setPriority(1);
        MyThread t1 = new MyThread("t1");
        t1.setPriority(10);
        //유닉스 계열의 OS는 스케쥴링에서 우선 순위를 고려하여 CPU를 배분한다
//        그러나 윈도우즈는 우선 순위를 덜 고려하여 cpu를 배분한다
//        그러다보니 우선순위를 조정하여 작업을 처리하도록 프로그램을 짜게되면 
//        유닉스 계열에서 실행할 때는 의도한 대로 동작할 수 있으나 
//        윈도우에서는 의도대로 동작하지 않을 것이다 
//        따라서 프로그램을 짤 때 스레드의 우선 순위를 조정하는 방법에 의존하지 말라
        System.out.printf("우선 순위 범위 : %d ~%d\n", Thread.MIN_PRIORITY, Thread.MAX_PRIORITY);
        
        System.out.printf("우선순위 기본 값 : %d\n", Thread.NORM_PRIORITY);
        
        System.out.printf("main 스레드 우선 순위 : %d\n", Thread.currentThread().getPriority());
        
        //메인 스레드를 실행하는 동안 만든 스레드는 main의 자식스레드라 부른다
        //그래서 t1스레드는 main의 우선순위 값과 같다
        System.out.printf("%s 스레드 우선 순위 : %d\n", t1.getName(), t1.getPriority());
        
        //t1시작
        t1.start();
        //main작업 시작
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++)
            Math.asin(38.567);
        long endTime = System.currentTimeMillis();
        System.out.println("main " + (endTime-startTime));
    }

}







