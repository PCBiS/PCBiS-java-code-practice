package ex;

import java.io.File;

public class FileMove {
	public static void main(String[] args) {
		String pathName = System.getProperty("user.dir");
		// File myFile = new File("c:" + File.separator + "myJava" + File.separator + test.txt"); <- 윈도우에서 안전하게 절대경로 찾아들어가는 법.
		File myFile = new File(pathName + File.separator + "news.txt");
		if (!myFile.exists()) {
			System.out.println("원본 파일이 준비되어 있지 않습니다.");
		}else {
			System.out.println("파일이 존재 합니다.");
		}
		File reDir = new File(pathName + File.separator + "yourJava");
		reDir.mkdir();
		File newFile = new File(reDir, "news.txt");
		myFile.renameTo(newFile);
		if (newFile.exists()) {
			System.out.println("파일 이동 성공");
		}else {
			System.out.println("파일 이동 실패");
		}
	}
}
