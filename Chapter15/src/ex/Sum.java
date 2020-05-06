package ex;

public class Sum {
	Long num;
	
	Sum(){
		num=0L;
	}
	
	void addNum(Long num) {
		this.num += num;
	}
	
	public Long getNum() {
		return num;
	}
	
}
