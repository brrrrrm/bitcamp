// 생성자 : 특정 생성자 정보 가져오기
package step18.ex4;

import java.lang.reflect.Constructor;

public class Exam02_Reflection_Constructor {
    
    public Exam02_Reflection_Constructor() {}
    public Exam02_Reflection_Constructor(int i) {}
    public Exam02_Reflection_Constructor(String s, int i) {} 
    
    public static void main(String[] args) throws Exception {
        Class clazz = Exam02_Reflection_Constructor.class;
        
        // 특정 생성자만 가져오기
        Constructor c = clazz.getConstructor(int.class);
        System.out.printf("%s(%d)\n", c.getName(), c.getParameterCount());

    }

}
