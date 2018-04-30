//Runnable인터페이스 구현과 Thread
package step24.ex3;

public class Exam02_Thread_Runnable {
    public static void main(String[] args) {
        //스레드에서 실행할 코드를 별도의 클래스로 분리학
        
        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 0 ; i < 20; i++) {
                    System.out.println("<<<<<" + i);
                }
            }
        }
        
        Thread t = new Thread(new MyRunnable());
        t.start();
        
        for (int i = 0 ; i < 20; i++) {
            System.out.println(">>>>>" + i);
    }
    
    }
}
