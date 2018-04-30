//상대편으로부터 연결을 요청받기 - 서버 
package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    public static void main(String[] args) throws Exception {
//      다른 컴퓨터의 연결 요청을 기다린다
        ServerSocket serverSocket = new ServerSocket(8888);
//      연결하기 위해 대기하고 있는 컴퓨터 중 하나를 연결 허락한다        
        Socket socket = serverSocket.accept();
//      소켓 객체를 통해 읽고 쓸 수 있도록 입출력 스트림을 읽는다
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
//      상대편이 보낸 문자열을 한 줄 읽는다
//        상대편이 보낸 한 줄의 데이터를 읽을 때까지 리턴하지 않는다
        String str = in.nextLine();
        System.out.printf("상대편> %s\n", str);
        out.println("나는 최보람입니다. 반갑습니다");

        in.close();
        out.close();
        //네트워크 연결 닫기
        socket.close();
        serverSocket.close();
    }
}
