package step11.ex13;

public class Exam01_4 {
    public static void main(String[] args) {
        
        Customer4 c1 = new Customer4();
        
//        실무에서 만드는 셋터는 보통 파라미터 값을 검증하지 않기 때문에
//        그냥 입력된 값 그대로 인스턴스 변수에 저장한다
//        그래서 값을 꺼내 출력해보면 입력된 값 그대로 출력될 것이다
        
        c1.setName("홍길동");
        c1.setAge(300);
    }
}