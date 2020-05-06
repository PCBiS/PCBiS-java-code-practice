package ex;

public class AdderThread extends Sum implements Runnable {

	Long start, end;

	 AdderThread(Long s, Long e){
		 start=s;
		 end=e;
	 }

	@Override
	public void run() {
		for (Long i = start; i <= end; i++) {
			addNum(i);
		}
	}

}
