//contains()와 hasCode(), equals()의 관계

package step12.ex1;
// 배열을 이용하여 컬렉션 클래스 만들기
// 단점 : 배열의 크기가 고정되기 때문에 
// 배열을 추가하여 값을 넣으려면 더 큰 새 배열을 만들고 기존 값을 복사해야 한다 
// 배열의 크기가 늘 때마다 가비지가 생기는 문제가 있다
// 기본 배열의 값을 복사하기 때문에 속도도 느리다


public class Exam02_1 {
    public static void main(String[] args) {
        String s1 = new String("Aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("bbb");
//        s2 != s4
        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        
        System.out.println(list.contains(s4));
        
    }
    
    static void print(ArrayList list) {
        for (int i = 0 ; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
    }
}
