package ch11;

public class Q02_Member {
	private String id;
	private String name;
	
	public Q02_Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "" + id + ": " + name + "";
	}	
	
}
