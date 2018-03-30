package step11.ex11;

public class B3 extends B {
//        오버라이딩 문법 검사
//        오버라이딩을 제대로 했는지 컴파일러에게 검사하도록 요청할 수 있다ㅐ
//    어떻게?
//    메소드 정의 앞에 @override를 붙인다
    
    @Override //컴파일러가 검사한다
    void m(int x) {
            System.out.println("B2의 m()");
    }
}
