package step11.ex11;

public class A3 extends A{
    int age;
    
//    상속 받은 메소드가 서브 클래스와 맞지 않다면
//    서브 클래스의 역할에 맞추어 메소드를 재정의 하라
//    그래서 부모의 메소드를 덮어쓰는(override)하는 것이당
//    
    void print() {
        System.out.printf("'%s(%d)'님 반갑습니다!.\n", this.name, this.age);
    }
}
