package step24.ex5;

public class Account {
    String accountId;
    long balance;
    
    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
//    한번에 한 스레드만이 호출하도록 접근을 제한하고 싶다면 메소드 전체를 동기화블록으로 선언하라
//    메소드 앞에 synchronized를 붙인다
//    이 메소드처럼 여러 스레드가 접근했을 때 문제가 발생하는 critical section이 아니면
//    synchronized를 자제 <= 성능 저하 발생
    synchronized public long withdraw(long money) {
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        long b = this.balance;
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        b -= money;
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        if (b < 0)
            return 0;
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        this.balance = b;
        for (int i = 0; i < 1000; i++) Math.asin(45.765); // CPU를 뺏길 기회를 제공
        return money;
    }
}






