// 오버로딩 - 주의

package step11.ex10;

public class Exam04 {
    public static void main(String[] args) {
//        자식 클래스에서 부모 클래스에 있는 메소드와 같은 이름의 메소드를 만들어도
//        (파라미터 타입 다름)오버로딩이다
        
        B.m(); //super class 의 m()을 호출
        B.m(100, 200, 300); // B class의 m()호출
        
        
    }
}
