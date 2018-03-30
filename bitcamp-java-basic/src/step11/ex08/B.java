
package step11.ex08;
public class B extends step11.ex08.A {

    int v2;
    
    B() {
        
//        만약 수퍼 클래스에 기본 생성자가 없으면 컴파일 오류가 발생한다
//        해결 방법 ?
//        super class에 있는 생성자를 호출하라
        super(100);
        System.out.println("B() 생성자");
    }
}
