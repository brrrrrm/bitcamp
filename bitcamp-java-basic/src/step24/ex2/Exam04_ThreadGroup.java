package step24.ex2;

public class Exam04_ThreadGroup {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        
        ThreadGroup[] groups = new ThreadGroup[100];
        int count = mainGroup.enumerate(groups,false);
        System.out.println("메인 그룹의 하위 그룹들 : ");
        for (int i = 0 ; i <count; i++) 
            System.out.println("==> " + groups[i].getName());
        
        //main 스레드 그룹 
        //   main 스레드
        //   다른 하위 그룹은 없다
    }
    
}
