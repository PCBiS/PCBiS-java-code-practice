package ex;

public class Member {
	
	private String name; // 어디에서도 직접접근을 할 수 없는 상태
	private String id; // 가 되기 때문에 정보 은닉이 가능하다.
	
	// getter, setter 메소드 생성	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + "]";
	}	
}