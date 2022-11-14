package ch14_lambda;

public class Ex04_Member {
	int id;
	String name;
	
	public Ex04_Member(int i, String name) {
		this.id = i;
		this.name = name;
	}

	@Override
	public String toString() {
		return "" + id + ": " + name + "";
	}	
}
