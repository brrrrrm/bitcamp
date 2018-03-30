//Queue구현과 사용
//java.util.SynchrounousQue사용
package step12.ex4;

import java.util.concurrent.ArrayBlockingQueue;

public class Exam01_2 {
    public static void main(String[] args) {
        
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");

        ArrayBlockingQueue queue = new ArrayBlockingQueue(100);
        queue.offer(s1);
        print(queue); //aaa
        queue.offer(s2);
        print(queue);
        queue.offer(s3);
        print(queue);
        
        System.out.println("------------");
        System.out.println("X"+ queue.poll());
        System.out.println("X"+ queue.poll());
        
        queue.offer(s4);
        queue.offer(s5);
        
        String value;
        while ((value = (String)queue.poll())!= null) {
            System.out.println(value);
        }
    }
        
        static void print(ArrayBlockingQueue list) {
            Object[] arr = list.toArray();
            for (Object value : arr) {
                System.out.print(value + ", ");
            }
            System.out.println();
        }
}
