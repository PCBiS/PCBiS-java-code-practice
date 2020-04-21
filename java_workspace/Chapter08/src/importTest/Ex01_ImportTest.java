package importTest;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex01_ImportTest {
	public static void main(String[] args) throws InterruptedException {
		Date today = new Date();
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));
		
		
		while (true) {
			Date now = new Date();
			System.out.println(now.toString());
			TimeUnit.SECONDS.sleep(1);
		}
	}
	
}
