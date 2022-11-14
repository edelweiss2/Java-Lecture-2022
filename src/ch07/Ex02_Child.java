package ch07;

public class Ex02_Child extends Ex02_Parent {
	int childInt;
	
	void childMethod() {
		super.parentMethod();   //super로 parentMethod 불러옴
		System.out.println("Child: " + childInt);
	}
	
	@Override
	void parentMethod() {
		System.out.println("Child: " + parentInt);
	}
	
}
