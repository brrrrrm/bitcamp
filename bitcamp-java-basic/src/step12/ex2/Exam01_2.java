package step12.ex2;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam01_2 {
    public static void main(String[] args) {
        
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        
        LinkedList list = new LinkedList();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));       
        System.out.println("------------");
        System.out.println(list.size());
        System.out.println(list.remove(0));
        print(list);// aaa, bbb 
        System.out.println("------------");

        list.add(s4);
        print(list);
        System.out.println("------------");

        list.add(1,s3);
        print(list);
        System.out.println("------------");

       list.add(0,s2);
       print(list);
       System.out.println("------------");

       list.add(5,"Xxx");
       print(list);

    }
    static void print(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
    }
    
    Iterator i = set.iterator();
    
    while (i.hasNext()) {
        System.out.println(i.next()+ ", ");
    }
}
}

