package ch07;

public class Ex04_Student extends Ex04_Person {
	String major = "";

	Ex04_Student(String name, String gender, int age, String major) { // 여기에 부모거를 상속받음
		super(name, gender, age); // person에 생성자 만들고 여기에 적어줌
		this.major = major;
	}

	void study() {
		System.out.println("공부를 한다.");
	}

	@Override
	public String toString() {
		return "Ex04_Student [major=" + major + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
