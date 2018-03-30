//Stack : Last in First Out push.() pop.()

package step12.ex3;

import step12.ex2.LinkedList;

//Stack 의 예 - 웹 브라우저의 히스토리, 
//웹사이트에서 브레드크럼스
public class Stack extends LinkedList {
    public void push(Object value) {
        this.add(value);
    }
    
    public Object pop() {
        if (this.head == this.tail) 
            return null;
        
        Bucket removedBucket = this.tail.prev;
        if (this.tail.prev.prev != null) { //리스트에서 중간 버킷 제거할 때
            this.tail.prev.prev.next = tail;
            this.tail.prev = this.tail.prev.prev;
        } else { //리스트에서 맨 처음 버킷을 제거할 때
            head = tail;
            head.prev = null;
        }
        return removedBucket.value;
    }
}
