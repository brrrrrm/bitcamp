// overriding 오버라이딩 문법 검사
package step11.ex11;

public class Exam04 {
    public static void main(String[] args) {
        B2 obj = new B2();

        obj.m(100);
    }
}

//B2에서 B의 m()메소드를 오버라이딩 했다고 착각하고 메소드를 사용할 수 있다
//그런데 B2 클래스를 가보면 m()의 파라미터가 float이다
// => override X overload O

//이런 실수를 방지하기 위해 특별한 문법이 있다