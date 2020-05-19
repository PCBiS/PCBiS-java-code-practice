package ex;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIPServer {
	public static void main(String[] args) {
		ServerSocket sSocket = null;
		try {
			sSocket = new ServerSocket(8088);
			System.out.println("소켓 서버가 준비 되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//클라이언트에서 소켓연결요청이 올 때까지 대기.
		while (true) {
			System.out.println("연결 요청을 기다립니다.");
			
			try {
				Socket sock = sSocket.accept();
				System.out.println(sock.getInetAddress() + "으로부터 연결 요청이 왔습니다.");
				OutputStream out = sock.getOutputStream();
				DataOutputStream dOut = new DataOutputStream(out);
				
				
				//클라이언트 소켓으로 데이터를 전송한다.
				dOut.writeUTF("[Notice] Test Message from Server");
				System.out.println("데이터를 전송 하였습니다.");
				
				dOut.close();
				sock.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
