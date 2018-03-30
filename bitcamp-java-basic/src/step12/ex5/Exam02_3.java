package step12.ex5;

import java.util.Stack;

public class Exam02_3 {
    public static void main(String[] args) {
        
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        
        Stack stack = new Stack();
        
        stack.add(s1);
        stack.add(s2);
        stack.add(s3);
        
        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.get(2));
        System.out.println(stack.get(3));       
        System.out.println("------------");
        System.out.println(stack.size());
        System.out.println(stack.remove(0));
        print(stack);// aaa, bbb 
        System.out.println("------------");

        stack.add(s4);
        print(stack);
        System.out.println("------------");

        stack.add(1,s3);
        print(stack);
        System.out.println("------------");

       stack.add(0,s2);
       print(stack);
       System.out.println("------------");

       stack.add(5,"Xxx");
       print(stack);

    }
    static void print(Stack stack) {
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i)+",");
        }
    }
}
