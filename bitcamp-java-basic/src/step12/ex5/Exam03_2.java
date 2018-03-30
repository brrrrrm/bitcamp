//HashSet과 사용자 정의 데이터타입
package step12.ex5;

import java.util.HashSet;

public class Exam03_2 {
    static class Member{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Member [name=" + name + ", age=" + age + "]";
        }
        
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + age;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Member other = (Member) obj;
            if (age != other.age)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
        public static void main(String[] args) {
            Member m1 = new Member("a", 20);
            Member m2 = new Member("b", 30);
            Member m3 = new Member("c", 15);
            Member m4 = new Member("c", 15);

//          출력해보면 데이터가 중복 저장되었음을 알 수 있다
//          Member class에서 hashCode()와 equals() 를 오버라이딩하지 않았기 때문이다
//          즉 Object로부터 상속받은 hashCode()와 equals를 그대로 사용하여 
//            값의 중복여부를 검사하기 때문이다
//          Object 의 hashCode()는 instance와 다르면 무조건 다른 hashCode()를 리턴한다
//          Object의 equals() 는 무조건 인스턴스 주소가 같은지 검사한다
           
            HashSet set = new HashSet();
            set.add(m1);
            set.add(m2);
            set.add(m3);
            set.add(m4);
            
            print(set);
        }
        
        static void print(HashSet set) {
            Object[] values = set.toArray();
            for (Object value: values) {
                System.out.println(value);
            }
        }
        
    }
}
