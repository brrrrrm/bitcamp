//클라이언트 + 키보드
package step23.ex1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender2 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("192.168.0.6", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        //키보드 입력을 받아 서버에게 전송
        System.out.print("입력> ");
        String input = keyScan.nextLine();
        
        out.println(input);
        //서버가 보낸 데이터를 수신한다
        String str = in.nextLine();
        System.out.println(str);
        
        in.close();
        out.close();
        socket.close();
        keyScan.close();
    }
}
