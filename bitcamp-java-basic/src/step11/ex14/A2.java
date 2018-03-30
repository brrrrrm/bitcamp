//다형적 변수와 오버라이딩
package step11.ex14;

public class A2 extends A {
@Override
    public void m() {
        System.out.println("call m() in A2");
    }
    
    public void x() {
        System.out.println("method x() added from A2");
    }
}
