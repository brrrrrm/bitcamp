package step11.ex11;

public class C2 extends C{
//    다음은 C의 메소드를 오버라이딩한게 아니다
//    C의 m1()은 private이기 때문에 오직 C에서만 사용할 수 있다
//    C 내부에서만 접근할 수 있으므로 오버라이딩이 불가능 
//    그럼 다음 m1()? C2에 새로 추가한 것 
//    @Override
   // private void m1() {}
//    접근 권한이 없는 메소드는 오버라이딩 불가
//    @Override
    protected void m2() {}
//    @Override
    void m3() {}
    @Override
    public void m4() {}
    //오버라이딩 할 때 원본보다 접근 범위를 확대할 수는 있지만 좁힐 수는 없다 
  //  @Override protected void m3() {}
}

//멤버의 접근 범위 
/*
private 같은 클래스 내에서만 접근 가능
(default) 같은 클래스와 같은 패키지 내에서 접근 가능
protected 같은 클래스와 같은 패키지와 서브 클래스에서 접근 가능
public 모든 클래스에서 접근 가능

수퍼 클래스의 메소드를 자식 클래스가 재정의할 때 
접근 범위를 확대할 수는 있지만 좁힐 수는 없다
*/