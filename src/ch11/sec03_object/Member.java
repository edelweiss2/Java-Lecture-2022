package ch11.sec03_object;

public class Member {
	String id;
	String name;
	
	Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override				//overload랑 다름 equals 자리에 member쓰면 overload라 문제생길수도
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id) && name.equals(member.name)) {
				return true;
			}
		}
		return false;
	}
}
