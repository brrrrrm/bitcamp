package step23.ex2;

import java.net.ServerSocket;
import java.net.Socket;

//서버?
//네트워크 연결을 기다리는 쪽을 가리킨다
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 대기 중...");
        //1) 네트워크 연결을 기다리는 역할을 수행할 객체를 준비한다
        //new ServerSocket(포트 번호);
        
        ServerSocket ss = new ServerSocket(8888);
        //포트번호
        //=>한 컴퓨터에서 네트워크 연결을 기다리는 프로그램의 식별번호이다
        //OS는 이 번호를 가지고 데이터를  받을 프로그램을 결정한다
        
        System.out.println("클라이언트 연결을 기다리는 중");
        //2) 대기중인 클라이언트에 연결을 허락한다
        //클라이언트가 서버에 연결을 요청하면 서버는 대기열에 추가한다
        //서버에서 연결을 승인하면 클라이언트와 통신할 수 있는 소켓을 리턴한다
        Socket socket = ss.accept();
        System.out.println("대기 중인 클라이언트 중 한 개의 클라이언트에 대해 연결 승인");
        //자원해제
        socket.close();
        System.out.println("클라이언트와의 연결 해제");
        ss.close();
        System.out.println("서버 종료");
        
    }
}

//포트 번호
//0번 ~ 1023번: 잘 알려진 포트 (well-known port)
//특정 프로그램이 관습적으로 사용하는 포트번호
//프로그램을 작성할 때 가능한 이 포트 번호를 사용하지 말아야한다
//ex) 7(echo) - 보낸 데이터를 그대로 리턴, 20(FTP 데이터 포트), 21(FTP 제어포트),  ...
//1024번 ~ 49151번: 등록된 포트 (registered port)
//일반적 통신 프로그램을 작성할 떄 이 범위의 포트 번호를 사용한다
//다만 이 범위의 번호 중 특정 프로그램이 널리 사용하는 번호가 있다 이 번호도 피하라 
//49152번 ~ 65535번: 동적 포트 (dynamic port)
//통신을 하는 프로그램은 반드시 포트 번호를 가져야 한다 그래야 OS가 해당 프로그램을 구분할 수 있다 
//따라서 클라이언트 프로그램도 포트 번호를 갖는데 프로그램에서 결정하는 것이 아니라 OS로부터 자동 발급받는다
//이 범위의 포트번호는 클라이언트가 OS로부터 자동 발급받는 포트 번호이다
