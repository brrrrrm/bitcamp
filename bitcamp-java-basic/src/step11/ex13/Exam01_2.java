//접근 제한
package step11.ex13;

public class Exam01_2 {
    static class Customer {
        String name;
        int age;
        int weight;
        int height;
    }
    public static void main(String[] args) {
//        환자 데이터를 등록해보자
        Customer c1 = new Customer();
        c1.name = "Hong Gildong";
        c1.age = 300;
        c1.weight = 100;
        c1.height = -50;
        
        
//        위 코드의 문제점?
//        각각의 값이 인스턴스 변수에 들어갈 수 있는 값이기 때문에 컴파일 오류는 없다 
//        그러나 데이터로서 유효한 값이 아니다
//        즉 환자 클래스를 만든 추상화의 목적에 벗어난다
//        Customer 는 환자 데이터를 다루기 위해 만들어진 클래스
//        즉 클ㄹ래스를 정의한 이유를 상실하게 된다
//        이를 방지하기 위해 만든 문법이 캡슐화이다
        
//        캡슐화? 
//        instance 의 변수에 추상화 목적에 맞는 유효한 값만 넣을 수 있도록 
//        외부 접근을 제한하는 문법이다
//        제한 범위
//        private : 클래스 내부에서만 접근 가능 
//        default : 클래스 내부, 같은 패키지
//        protected : 클래스 내부, 같은 패키지, 자식 클래스
//        public : 모든 클래스
//        보통 
    }
}
