//상대방에게 연결을 요쳥하기 - 클라이언트
package step23.ex1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws Exception {
        //1)다른 컴퓨터와 네트워크로 연결한다
        Socket socket = new Socket("192.168.0.6", 8888);
        //2)소켓 객체를 통해 읽고 쓸 수 있도록 입출력 스트립을 읽는다
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        //3)상대편으로 문자열을 한 줄 보낸다
        //상대편에서 데이터를 읽을 때까지 리턴하지 않는다
        //이런 메소드를 blocking method라 부른다
        out.println("최보람입니다. 안녕하세요 ");
        //4)상대편에서 보낸 문자열을 한 줄 읽는다
        //상대편이 한 줄 데이터를 보낼 때까지 리턴하지 않는다
        String str = in.nextLine();
        System.out.println(str);
        //5)입출력 도구 닫기
        
        in.close();
        out.close();
        //6)네트워크 연결 닫기
        socket.close();
    }
}
