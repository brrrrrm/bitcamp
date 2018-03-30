package step11.ex05;

public class A {
    int v1;
//    이전 프로그램에서 다음 생성자를 사용하기 때문에 이 생성자의 파라미터를 덧붙일 수는 없다
    static {
        System.out.println("execute static{} in A class!");
    }
}
