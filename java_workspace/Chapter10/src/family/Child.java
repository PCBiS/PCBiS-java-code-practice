package family;

public class Child extends Parent{
	int age = 30;	
	
	void method() {
		System.out.println("age : " + age);					// child(this)의 age
		System.out.println("this.age : " + this.age);		// child(this)의 age
		System.out.println("super.age : " + super.age);		// Parent(super)의 age
	}	
}
