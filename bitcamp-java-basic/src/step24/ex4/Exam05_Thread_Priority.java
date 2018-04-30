// 스레드의 생명주기(lifecycle) - 우선순위 조회
package step24.ex4;

public class Exam05_Thread_Priority {
    public static void main(String[] args) throws Exception {
        class MyThread extends Thread {
            public MyThread(String name) {
                super(name);
            }
            public void run() {
                for (int i = 0; i < 1000; i++)
                    System.out.printf("%s %d\n", this.getName(), i);
            }
        }
        
        MyThread t1 = new MyThread("t1");
        
        System.out.printf("우선 순위 범위 : %d ~%d\n", Thread.MIN_PRIORITY, Thread.MAX_PRIORITY);
        
        System.out.printf("우선순위 기본 값 : %d\n", Thread.NORM_PRIORITY);
        
        System.out.printf("main 스레드 우선 순위 : %d\n", Thread.currentThread().getPriority());
        
        //메인 스레드를 실행하는 동안 만든 스레드는 main의 자식스레드라 부른다
        //그래서 t1스레드는 main의 우선순위 값과 같다
        System.out.printf("%s 스레드 우선 순위 : %d\n", t1.getName(), t1.getPriority());
    }

}







