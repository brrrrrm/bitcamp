//제네릭 적용전 LinkedList

package step13.ex2;

public class Exam01_1 {
    public static void main(String[] args) {
        
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        
        LinkedList list = new LinkedList();
        list.add(new Member("Hong Gildong", 20));
        list.add(new Member("Hong ", 20));
        list.add(new Member(" Gildong", 20));
        //값을 꺼내 사용하려면 항상 형변환해야 한다
        for(int i = 0; i <list.size(); i++) {
            Member member = (Member) list.get(i);
            System.out.printf("%s(%d)\n", member.name, member.age);
        }
    }
}
