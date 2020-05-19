package ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StringReader {
	public static void main(String[] args) {
		String pathName = System.getProperty("user.dir");
		try {
			FileReader reader = new FileReader(pathName + "/news.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = null;
			
			while (true) {
				str = br.readLine();
				if (str==null) {
					break;
				}
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
