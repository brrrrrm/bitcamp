
package step11.ex05;
public class B extends step11.ex05.A {

    int v2;
    
    static {
        System.out.println("execute static{] in B class!");
    }
}
// 개발 입문자들이 가장 많이 착각하는 것
// 상속이라는 단어로 인해 오해가 발생한다
// B클래스가 A클래스를 상속했기 때문에
// B 클래스는 A클래스의 코드를 갖고 있을 것이라고...
// 그렇지 않다
// B 클래스는 단지 A 클래스의 링크 정보만 갖고 있다
// 따라서 B 클래스를 사용하려면 반드시 A 클래스가 있어야한다