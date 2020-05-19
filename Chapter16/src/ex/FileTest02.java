package ex;

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		String pathName = System.getProperty("user.dir");
		File myDir = new File(pathName + File.separator);
		String[] fNames = myDir.list(); // String 타입의 fNames를 반환한다.
		
		/*
		for (int i = 0; i < fNames.length; i++) {
			System.out.println(fNames[i]);
		}
		*/
		
		File[] files = myDir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].getName() + "\t");
			if (files[i].isDirectory()) {
				System.out.println("[DIR]");
			}else {
				System.out.println("[FILE]");
			}
		}
	}
}
