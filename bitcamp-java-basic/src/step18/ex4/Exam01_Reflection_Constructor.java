// 생성자 : 생성자 정보 가져오기
package step18.ex4;

import java.lang.reflect.Constructor;

public class Exam01_Reflection_Constructor {
    
    public Exam01_Reflection_Constructor() {}
    public Exam01_Reflection_Constructor(int i) {}
    public Exam01_Reflection_Constructor(String s, int i) {} 
    
    public static void main(String[] args) {
        Class clazz = Exam01_Reflection_Constructor.class;
        
        // 생성자 목록 가져오기
        Constructor[] list = clazz.getConstructors();
        for (Constructor c : list) {
            System.out.printf("%s(%d)\n", c.getName(), c.getParameterCount());
        }

    }

}
