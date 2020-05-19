package ex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {
	public static void main(String[] args) {
		int copyByte = 0;
		int readLen;
		byte[] buffer = new byte[4096];
		
		InputStream in = null;
		OutputStream out = null;
		// 사용자 절대경로값을 가져와 줌.
		String pathName = System.getProperty("user.dir");
		System.out.println(pathName);
		try {
			// 원본 파일의 데이터를 프로그램 안으로 가지고 와야 함.
			// InputStream 인스턴스 생성.
			in = new FileInputStream(pathName+"/2020.dmg");
			// 새로운 파일을 생성
			// OutputStream 인스턴스 생성.
			out = new FileOutputStream(pathName+"/copy2020.dmg");
			// 필터 스트림 생성.
			BufferedInputStream bIn = new BufferedInputStream(in);
			
			
			
			while (true) {
				readLen = in.read(buffer);
				if (readLen==-1) {
					break;
				}
				out.write(buffer, 0, readLen);
				copyByte++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("복사 된 바이트 크기 : " + copyByte*4096);
	}
}
