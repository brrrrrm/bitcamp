// 메서드 : 스택 메모리 응용1
package step06;

class Exam04_4 {
    static int m1(int value) {
        int r = m2(value);
        int r2 = m3(value);
        return r + r2;
    }

    static int m2(int value) {
        return value + 100;
    }

    static int m3(int value) {
        return value + 200;
    }

    public static void main(String[] args){
        int r = m1(5);
        System.out.println(r);
    }
}