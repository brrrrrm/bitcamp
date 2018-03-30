
package step12.ex4;

import step12.ex2.LinkedList;

public class Queue extends LinkedList{
//    맨 뒤에 값을 붙인다
    public void offer(Object value) {
        this.add(value);
    }
//    맨 앞의 값을 꺼낸다
    public Object poll() {
        return this.remove(0);
    }

}
