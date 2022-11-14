package ch07;

public class Ex04_Person {
	String name;
	String gender;
	int age;

	Ex04_Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void eat() {
		System.out.println("이/가 먹는다.");
	}

	void sleep() {
		System.out.println("이/가 잔다.");
	}

}
