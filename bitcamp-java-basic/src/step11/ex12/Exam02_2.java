//Object클래스의 메소드를 오버라이딩 하기 hasoCode
package step11.ex12;

public class Exam02_2 {
    
    static class Score{
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.sum = kor + eng + math;
            this.aver = this.sum/3f;
        }
        
//        인스턴스가 다르도록 값이 같으면 같은 해시코드 값을 리턴하도록 오버라이딩해보자
//        가장 간단한 방법은 모든 값을 문자열로 만들어 붙인 다음에  
//        String class 에 있는 hashcode를 사용하는 것이다
//        String class 에 있는 해시코드는 문자열이 같은 경우
//        같은 해시값을 리턴하도록 오버라이딩되어 있기 때문이다
        @Override
        public int hashCode() {
            // TODO Auto-generated method stub
            String value = String.format("%s %d %d %d %d %.1f", this.name, this.kor, 
                    this.eng, this.math, this.sum, this.aver);
            return value.hashCode();
        }
    }
    public static void main(String[] args) {
        Score s1 = new Score("hong gildong", 100, 100, 100);
        Score s2 = new Score("hong gildong", 100, 100, 100);
//      같은 값을 가질 때 같은 해시값을 리턴하도록 hashcode 를 오버라이딩
        System.out.printf("%d %d\n", s1.hashCode(), s2.hashCode());
        
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}
