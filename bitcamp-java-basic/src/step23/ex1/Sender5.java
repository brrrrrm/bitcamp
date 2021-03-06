// 파일 보내기 - 버퍼 적용
package step23.ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.sql.Time;
import java.util.Scanner;

public class Sender5 {

    public static void main(String[] args) throws Exception {
        File file = new File("temp/jls8.pdf");
        
        BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(file));
        
        System.out.println("서버에 연결 중...");
        Socket socket = new Socket("localhost", 8888);
        System.out.println("서버에 연결 완료!");
        
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream()));
        
        System.out.println("서버에 데이터 송신 중...");
        //1) 파일 크기 보내기
        out.writeLong(file.length());
        
        //2) 파일 이름 보내기
        out.writeUTF(file.getName());
        
        long startTime = System.currentTimeMillis();
        //3) 파일 데이터 보내기
        int b;
        while ((b = fileIn.read()) != -1) {
            out.write(b);
        } 
        out.flush(); //버퍼에 남아 있는 데이터를 방출하기 - 안 하면 마지막 데이터가 버퍼에만 남아 있음
        long endTime = System.currentTimeMillis();
        System.out.println("서버에 데이터 송신 완료!");
        System.out.println(endTime - startTime);
        //4) 서버의 응답받기
        String response = in.nextLine();
        System.out.println(response);

        in.close();
        out.close();
        socket.close();
        fileIn.close();
    }

}





