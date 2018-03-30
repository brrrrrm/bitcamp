// 오버로딩 - 응용 2



package step11.ex10;

public class Exam03 {
    public static void main(String[] args) {
        
//        다양한 파라미터 값을 받는 println()
        System.out.println(100);
        System.out.println(true);
        System.out.println("hello");
        
//        외부에서 값을 받아 Integer 객체를 생성하는 메소드들
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf("100");
        Integer obj3 = Integer.valueOf("64", 16);
        System.out.printf("%d %d %d\n", obj1, obj2, obj3);
        
        Integer r1 = Integer.parseInt("100");
        Integer r2 = Integer.parseInt("100");
        
        if(r1 ==r2)
            System.out.println("r1 == r2");
    }
}
