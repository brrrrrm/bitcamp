//인스턴스 메소드와 클래스 메소드의 활용 - Wrapper 클래스
package step09;

import java.util.Date;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {
       Integer i1 = new Integer(100);
       //인스턴스 메소드
       Integer i2 = new Integer(200);
       Integer i3 = new Integer(300);
       
       System.out.println(i2.compareTo(i1));
       System.out.println(i2.compareTo(i3));
       
       int v1 = i2.intValue();
       System.out.println(v1);
       
//       static method (class method)
       
       int v2 = Integer.parseInt("1280");
       String s1 = Integer.toBinaryString(77);
       String s2 = Integer.toHexString(77);
       String s3 = Integer.toOctalString(77);
       System.out.printf("77: %s %s %s\n", s1, s2, s3);
     
       Integer x1 = Integer.valueOf("44");//문자열에 저장된 수는 10진수로 간주  
       Integer x2 = Integer.valueOf("44", 16); //16진수로 지정
       System.out.printf("%d %d\n", x1, x2);
       
       float f = Float.parseFloat("3.14f");
       boolean b = Boolean.parseBoolean("true");
       System.out.println(f);
       System.out.println(b);
    }
    
}
