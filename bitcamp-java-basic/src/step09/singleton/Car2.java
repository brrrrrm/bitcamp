//싱글톤패턴 적용전
package step09.singleton;
// 외부에서 생성자를 호출하지 못하도록 private으로 접근을 ㅔㅈ한한다
public class Car2 {
//    Car2 객체를 생성하면 다음 스태틱 변수에 보관해둔다
    private static Car2 instance;
    
    private Car2() {
        System.out.println("Car()");
    }
        public static Car2 getInstace() {
            if (instance == null)
                instance = new Car2();
            return instance;

    }
}
