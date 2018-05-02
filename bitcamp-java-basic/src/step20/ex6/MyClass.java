// 애노테이션 프로퍼티 타입
package step20.ex6;

// @MyAnnotation은 메서드와 타입(인터페이스와 클래스)에만 붙일 수 있다.
@MyAnnotation // OK!
public class MyClass {
    
<<<<<<< HEAD
//    @MyAnnotation int i; // 컴파일 오류!
=======
    @MyAnnotation int i; // 컴파일 오류!
>>>>>>> 16a2630253d40c6d57244a06acd06b74495b9c9a
    
    @MyAnnotation public void m() {} // OK!
}
