package step12.ex2;

public class Exam01_1 {
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
}
/*
ArrayList vs LinkedList 
1)메모리
ArrayList는 고정 크기를 갖는다
크기를 초과하면 새로 배열을 만들어야 하기 때문에 메모리 낭비가 심하다 
LinkedList 
값을 때마다 새 메모리가 추가되는 가변 크기를 가진다
ArrayList보다 메모리 낭비가 적고 가비지를 덜 생산한다

2)속도
ArrayList
검색 시배열의 특징상 특정 인덱스를 이용하여 특정 항목을 찾는 검색 속도가 빠르다
삭제 시 이전 항목을 당겨와야 하기 때문에 속도가 느리다
입력 시 현재 항목을 다음 항목으로 이동하기 때문에 느리다
LinkedList
검색 시 인덱스를 이용하여 특정 항목을 찾을 때 연결 리스트의 처음부터 찾아야하기 때문에 검색 속도가 느리다
삭제 시 이전 항목과 다음 항목을 바로 연결하면 되기 때문에 속도가 빠르다
입력 시 현재 항목과 다음 항목을 연결하면 되기 때문에 속도가 빠르다


3)
*/