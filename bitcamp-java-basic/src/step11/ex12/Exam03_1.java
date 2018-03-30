//overriding this와 super로 메소드를 호출하는 원리
package step11.ex12;

public class Exam03_1 {
    static class Member{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Member m1 = new Member("hong gildong", 20);
        Member m2 = new Member("hong gildong", 20);
        
        if (m1 == m2) {
            System.out.println("m == m2");
        } else {
            System.out.println("m1 != m2");
        }
//        Member 클래스에  equals 를 정의한 적이 없는데 컴파일 오류가 발생하지 않는다
        
//        클래스를 만들 때 수퍼 클래스를 지정하지 않으면
//        자동으로 오브젝트를 상속받게 된다
//        따라서 자바의 모든 클래스는 오브젝트의 자손이다 
//        그래서 자바의 모든 클래스는 오브젝트의 메소드를 사용할 수 있다
//        equals 는 오브젝트의 메소드
        //        상속 받은 메소드 중 이퀄스 메소드를 살펴보자
         System.out.println(m1.equals(m2));
//        equals 는 문자열 비교를 할 때 사용했던 메소드이다. 
//         두 문자열의 내용이 같으면   true 를 리턴했는데
//         위에서 비록 둘이 인스턴스는 다르지만 내용이 같은데
//         실제 리턴 값을 확인해보면  false를 리턴한다
//         이유? object 클래스에서 상속받아 쓰는 equals는 원래 내용물을 비교하는 게 아니라
//         인스턴스가 같은지를 비교하는 메소드이다. 
//         m1, m2 인스턴스가 다르니 당연히 그 결과가  false 인 것이다
         
//         Member의 내용이 같은지 비교하고 싶다면?오버라이딩 사용
//         즉 오브젝트로부터 상속받은 메소드가 멤버 클래스에 맞지 않다
//         그렇다면 멤버 클래스에 맞게끔 재정의
         
         System.out.println(m1.hashCode());
         System.out.println();
    }
}

//static block 안에서는 static 멤버는 접근할 수 있지만 인스턴스 변수에 직접 접근할 수 없다
//static 멤버는 인스턴스 멤버에 접근할 수 없다 
