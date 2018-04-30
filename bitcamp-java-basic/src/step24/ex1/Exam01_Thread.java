//멀티스레드 적용전
package step24.ex1;

public class Exam01_Thread {
    public static void main(String[] args) {
        //코드의 실행은 위에서 아래로 순서대로 실행한다
        
        
        for (int i = 0 ; i < 1000; i ++) {
            System.out.println("==> " + i);
        }
        for (int i = 0 ; i < 1000; i ++) {
            System.out.println(">>> " + i);
        }
    }
}
