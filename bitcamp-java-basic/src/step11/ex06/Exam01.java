package step11.ex06;

public class Exam01 {
    public static void main(String[] args) {
        C obj = new C();
        obj.v1 = 100;
        obj.v2 = 200;
        obj.v3 = 300;
        System.out.printf("v1 = %d v2 = %d v3 = %d", obj.v1, obj.v2, obj.v3);
    }
}
// 생성자 호출 순서
// C -> B -> A 순서
// C 클래스의 생성자를 호출하면 수퍼 클래스의 생성자를 호출한다
// super class B의 생성자가 호출되며 마찬가지로 B의 super class의 생성자를 호출한다
// B의 super class A 의 생성자가 호출되고 
// A 의 Super Class인 Object의 생성자가 호출된다
// 그리고 object 클래스는 수퍼 클래스가 없기 때문에 Object() 생성자를 실행하고
// object를 호출한 A의 생성자로 리턴한다
// A가 생성자를 를 실행하고 B클래스의 생성자로 리턴되고
//