package step11.ex10;

public class A {
    static public void m() {
        System.out.println("m()");
    }        
    static public void m(int a) {
            System.out.println("m(int)");
    }
    static public void m(String a) {
        System.out.println("m(String)");
    }   
    static public void m(String a, int b) {
        System.out.println("m(String, int)");
    }
    static public void m(int a, String b) {
        System.out.println("m(int, String)");
    }
//    주의! 
//   변수의 이름만 다른 메소드를 중복해서 만들 수 없다
//    아래는 위와 같기 때문에 컴파일 오류이다
//    static public void m(int x, String y)

    
//    리턴 타입만 다른 메소드를 중복해 만들 수 없다
//    이유? 
//    메소드를 찾을 때 파라미터 값의 타입으로 찾기 때문이다
//    다음 메소드는 컴파일 오류이다

    /*
    static public int m(int a, String b) {
        
    }
    */
}

//파라미터 타입이나 개수가 다르지만 이름이 같은 메소드를 여러개 만들 수 있다
