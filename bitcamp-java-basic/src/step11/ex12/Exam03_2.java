//오버라이딩 - 응용 예

package step11.ex12;

public class Exam03_2 {
    static class Member{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
//        object로 부터 상속받은 equals()메소드를  
//         Member 클래스의 역할에 맞게 재정의해보자
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Member))
                return false;
            Member other = (Member) obj;
           
            if(!this.name.equals(other.name))
               return false;
            
            if(this.age != other.age)
                return false;
            
            return true;
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

         System.out.println(m1.equals(m2));
    }
}

//  결론
// object 로 부터 상속받은 기본 메소드인 equals()는 
// 같은 인스턴스인지를 비교하는 메소드이다
// 인스턴스의 데이터가 같은지를 비교하고 싶다면, 이 메소드를 재정의해야한다
// 오버라이딩의 예
// String, wrapper 크래스

