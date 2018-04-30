package step24.ex2;

public class Exam05_ThreadGroup {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        
        ThreadGroup parentGroup = mainGroup.getParent();
        System.out.println(parentGroup.getName());
        //system 스레드 그룹
        //  main 스레드 그룹 
        //    main 스레드
        //     다른 하위 그룹은 없다
    }
    
}
