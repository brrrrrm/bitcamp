// IoC 컨테이너 만들기 - 의존 객체 자동 주입
package step19.ex8;

public class Exam14_iocContainer_DI {
    public Exam14_iocContainer_DI() {
        System.out.println("===> Exam14()");
    }
    
    public static void main(String[] args) throws Exception {
        ApplicationContext9 iocContainer = new ApplicationContext9("step19.ex8");
        Car2 car2 = (Car2) iocContainer.getBean("step19.ex8.Car2");
        car2.move();
    }
}





