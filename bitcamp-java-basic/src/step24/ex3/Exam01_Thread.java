//스레드 만들기 - Thread상속
package step24.ex3;

public class Exam01_Thread {
//  스레드 정의하기
    //java.lang.Thread를 상속받아 만든다
    public static void main(String[] args) {
        class MyThread extends Thread {
            //기존의 스레드에서 분기하여 새 스레드에서 실행하고 싶은 코드가 있다면
            //run()을 오버라이드한다
             @Override
            public void run() {
                 //별도로 분리해 동시 실행할 코드
                 for (int i = 0 ; i < 20; i++) {
                     System.out.println("=======> " + i);
                 }
             }
        }
        //스레드 실행하기
        //start()를 호출하여 기존 스레드에서 분리하여 스레드를 실행시킨다
        MyThread t = new MyThread();
        t.start(); //실행흐름을 분리한 후 즉시 리턴한다
        
        for (int i = 0 ; i < 20 ; i++) {
            System.out.println(">>>>>" + i);
            
        }
        //"main"스레드는 MyThread와 관계 없이 병행하여 실행된다
    }
}


