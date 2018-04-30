package step24.ex2;

public class Exam03_ThreadGroup {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        
        Thread[] arr = new Thread[100];
        int count = mainGroup.enumerate(arr,false);
        //두번째 파라미터 값을 false로 지정하면 하위 그룹에 소속된 스레드들은 제외한다
        System.out.println("메인 그룹 소속 스레드 : ");
        for (int i = 0 ; i <count; i++) 
            System.out.println("==> " + arr[i].getName());
        
        //main 스레드 그룹 
        //   main 스레드
    }
    
}
