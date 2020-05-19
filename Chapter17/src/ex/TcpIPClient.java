package ex;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			InputStream is = socket.getInputStream();
			DataInputStream dIs = new DataInputStream(is);
			
			System.out.println("서버 : " + dIs.readUTF());
			
			dIs.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
