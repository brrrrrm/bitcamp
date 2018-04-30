//스레드 상속 = 익명 클래스로 구현하기
package step24.ex3;

public class Exam03_Thread_Annonymous {
//익명 클래스
    public static void main(String[] args) {
        new Thread() {
             @Override
            public void run() {
                 //별도로 분리해 동시 실행할 코드
                 for (int i = 0 ; i < 20; i++) {
                     System.out.println("=======> " + i);
                 }
             }
        }.start();
        
        for (int i = 0 ; i < 20 ; i++) {
            System.out.println(">>>>>" + i);
        }
        //"main"스레드는 MyThread와 관계 없이 병행하여 실행된다
    }
}


