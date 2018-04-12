// 인터페이스 다중 상속 불가!
package step14.ex4;

// 상위 인터페이스에 있는 메서드 중에서 
// 메서드명과 파라미터 형식은 같지만 
// 리턴 타입이 다른 그런 메서드가 있다면 
// 둘 중 어떤 것을 상속 받느냐에 따라 규칙이 달라지기 때문에
// 이런 경우에는 다중 상속이 불가하다! 컴파일 오류!
public interface C2 extends A/*, B2*/ {
    void m3();
}
