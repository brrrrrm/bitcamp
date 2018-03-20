// 파라미터를 받는 생성자
package step08;

public class Exam04_2 {
//    Exam04_1 클래스조차 기본 생성자가 자동으로 추가된다
//    즉 다음의 생성자를 컴파일러가 자동으로 붙일 것이다 
//    Exam04_1() {}
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
//        생성자 
//        클래스 이름과 같은 이름으로 메소드를 만든다
//        리턴 타입을 선언하지 않는다
//        값을 리턴하지 않는다
//        인스턴스를 만들 때 자동 호출된다 //나중에 따로 호출할 수 없다      
//        만약 개발자가 생성자를 만들지 않으면 컴파일러가 자동으로 생성해준다
//        모든 클래스는 반드시 한 개 이상의 생성자가 있다
//        보통 인스턴스를 만든 후에 인스턴스 변수를 초기화시키는 용도로 정의한다
//        다음과 같이 파라미터가 없는 생성자가 기본 생성자이다 (default constructor)

// 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다
        Score(String name, int kor, int eng, int math) {
            System.out.println("Score(String, int, int, int)호출");
//            파라미터로 받은 값을 새로 만든 인스턴스 변수에 저장한다
//            이렇게 생성자는 새로 만든 인스턴스 변수를 초기화시키는 일을 한다 
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.compute();
        }
        public void compute() {
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum / 3f;
        }
    }
    public static void main(String[] args) {
//Score 클래스에는 기본 생성자가 없기 때문에 컴파일 오류 
//        Score s0 = new Score();        
//        Score 인스턴스를 만든 후에는 생성자가 원하는 값을 주어 초기화해야한다
        Score s1 = new Score("홍길동", 100, 90, 77);
        Score s2 = new Score("임꺽정", 80, 88, 87);
//        생성자에서 이미 계산을 수행했기 때문에 따로 compute()를 호출할 필요가 없다
//        생성자를 사용하는 이유!
        System.out.printf("%s %d %d %d %d %f", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
        System.out.printf("%s %d %d %d %d %f", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);

        
    }
}
// 생성자
// 인스턴스 객체를 생성한 후에 사용하기 유효한 값으로 초기화시키는 작업을 수행한다
