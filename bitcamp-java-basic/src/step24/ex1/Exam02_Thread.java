//멀티스레드 적용후
package step24.ex1;

public class Exam02_Thread {
    static class MyThread extends Thread  {
        public void run() {
//기존 실행 흐름과 분리하여 따로 실행시킬 코드를 이 메소드에 둔다
            for (int i = 0 ; i < 1000; i ++) {
                System.out.println("==> " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        //코드 실행 라인을 새로 만들어 따로 실행한다
        new MyThread().start();  
        
        for (int i = 0 ; i < 1000; i ++) {
            System.out.println(">>> " + i);
        }
    }
}
//main()메소드를 실행하는 기본 실행 흐름에서 새로운 실행 흐름으로 분기하고 싶다면
//Thread 클래스에 분기해 실행할 코드를 담으면 된다
//별도의 실행 
