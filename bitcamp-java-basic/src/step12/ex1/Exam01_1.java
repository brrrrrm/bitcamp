//객체(의 주소)목록을 다루는 클래스 - collection class 

package step12.ex1;
// 배열을 이용하여 컬렉션 클래스 만들기
// 단점 : 배열의 크기가 고정되기 때문에 
// 배열을 추가하여 값을 넣으려면 더 큰 새 배열을 만들고 기존 값을 복사해야 한다 
// 배열의 크기가 늘 때마다 가비지가 생기는 문제가 있다
// 기본 배열의 값을 복사하기 때문에 속도도 느리다


public class Exam01_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        
        print(list);
        
        list.remove(2);
        
        print(list);
        
        list.remove(0);
        
        print(list);
        
        list.remove(5);
        
        print(list);
        
        list.add(1, "xxx");
        print(list);
        list.add(1,"yyy");
        print(list);
        list.add(0,"Zzz");
        print(list);
        list.add(5, "ttt");
        
        print(list);
        
        list.set(1, "aaa");
        
        print(list);
        
//        list.set(5,"999");
        print(list);
        list.add("ccc");
        list.add("eee");
        print(list);
    }
    
    static void print(ArrayList list) {
        for (int i = 0 ; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
    }
}
