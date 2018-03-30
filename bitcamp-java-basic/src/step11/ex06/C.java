package step11.ex06;

public class C extends B {
    int v3;
    
    C() {
//        super class의 어떤 생성자를 호출할지 지정하지 않으면
//        컴파일러는 다음과 같이 수퍼 클래스의 기본 생성자를 호출하라는 명령을 자동으로 붙인다
        
        super();
        System.out.println("C()생성자!");
        
//      만약 개발자가 수퍼 클래스의 생성자를 호출하는 명령을 작성할 때 
//        그 전에 다른 코드가 있다면 컴파일러 에러 발생
//        따라서 수퍼클래스 호출 명령은 반드시 맨 앞에 위치
    }

}
