// connectionful(=stateful) 방식 - 계산기 서버 만들기
package step23.ex4;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//connectionful 방식
//=>한번 연결한 후 여러번 요청/응답하는 방식
//단점  : 한번 연결하면 클라이언트가 연결을 끊을 때까지 계속 유지한다
//클라이언트가 작업을 요청하지 않더라도 계속 연결 정보를 유지해야 하기 때문에
//메모리를 많이 차지하고 동시에 많은 클라이언트의 요청을 처리하기 힘들다
//장점 : 한번 서버에 연결되면 클라이언트가 연결을 끊을 때까지 유지되기 때문에 작업을 처리하는 속도가 빠르다
//작업 처리에 걸리는 시간 = 데이터 전송 + 작업처리시간 + 데이터 수신시간
//작업을 요청할 때마다 연결할 필요가 없기 때문에 연결하는 데 시간이 걸리지 않는다
//클라이언트의 작업 상태를 계속 유지할 수 있기 때문에 stateful방식이라 부른다 
//이어서 작업할 수 있음 !
//대표적인 예
//게임서버 연결 - 서버에 한번 연결되면 게임을 마칠 때까지 데이터를 주고 받는다

public class CalcServer2 {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중...");
        
        ServerSocket ss = new ServerSocket(8888);
        
        while (true) {
            Socket socket = ss.accept();
            try {
                processRequest(socket);
            } catch (Exception e) {
                System.out.println("클라이언트 요청 처리 중 오류 발생!");
                System.out.println("다음 클라이언트의 요청을 처리합니다.");
            }
        }
        //ss.close();
    }
    
    static void processRequest(Socket socket) throws Exception {
        try (
                Socket socket2 = socket;
                DataInputStream in = new DataInputStream(socket.getInputStream());
                PrintStream out = new PrintStream(socket.getOutputStream());
            ) {
            
            l1: while (true) {
                int a = in.readInt();
                String op = in.readUTF();
                int b = in.readInt();
                int result = 0;
                
                switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break;
                case "quit": break l1;
                }
                
                out.printf("%d %s %d = %d\n", a, op, b, result);
            }
            out.println("quit");
        }
    }
}





