package ch11.sec11_arrays;
//interface를 구현해와야 비교가능. 그 전엔 비교대상이 없어 비교가 불가능
public class Ex04_Member implements Comparable<Ex04_Member> {
	int id;								//	<>가 없으면 오브젝트로 받음 클래스 이름을 넣으면 클래스로받음
	String name;
	
	Ex04_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Ex04_Member o) {		
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Ex04_Member [id=" + id + ", name=" + name + "]";
	}

	
}
