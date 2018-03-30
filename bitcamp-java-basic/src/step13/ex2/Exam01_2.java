//제네릭 적용전 LinkedList

package step13.ex2;

public class Exam01_2 {
    public static void main(String[] args) {
        
        
        LinkedList2<Member> list = new LinkedList2();
        list.add(new Member("Hong Gildong", 20));
        list.add(new Member("Hong ", 20));
        list.add(new Member(" Gildong", 20));
//      get()메소드는 제네릭이 적용되었기 때문에 굳이 형변환할 필요가 없다 
        for(int i = 0; i <list.size(); i++) {
            Member member = list.get(i);
            System.out.printf("%s(%d)\n", member.name, member.age);
        }
    }
}
