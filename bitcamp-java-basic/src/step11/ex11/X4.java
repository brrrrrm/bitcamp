package step11.ex11;

public class X4 extends X3{
    @Override
    void m1( ) {
        System.out.println("m1() in X4");
    }
    
    void test() {
        this.m1(); //X4의 m1()
        super.m1();
        
        this.m2();
        super.m2();
    }
}

//this메소드 호출
// 현재 클래스부터 호출할 메소드를 찾는다
// super.메소드 
// 부모 클래스부터 호출할 메소드를 찾는다