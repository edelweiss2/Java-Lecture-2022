package ch15_collection.sec03_hashSet;

import java.util.Objects;

public class Member {
	private String name;
	private int age;	
	
	Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
//		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member))
			return false;
		Member target = (Member) obj;
			return name.equals(target.name) && age == target.age;
//		if (obj instanceof Member target)   자바 16부터 사용가능 여기는 자바 11사용중
//			return	target.name.equals(name) && (target.age == age);
//		
	}
}
