package ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		String pathName = System.getProperty("user.dir");
		FileWriter fw = new FileWriter(pathName + "/news.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("손흥민 해병대 입대.");
		bw.newLine();
		bw.write("손흥민 전역 - 2020");
		bw.newLine();
		bw.write("기사 끝.");
		bw.close();
		
		System.out.println("파일 생성 끝.");
	}

}
