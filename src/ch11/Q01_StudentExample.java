package ch11;

import java.util.HashSet;

import ch11.sec04_objects.Student;

public class Q01_StudentExample {

	public static void main(String[] args) {
		HashSet<Q01_Student> hashSet = new HashSet<Q01_Student>();
		
		hashSet.add(new Q01_Student("1"));
		hashSet.add(new Q01_Student("1"));
		hashSet.add(new Q01_Student("2"));
		
		System.out.println(hashSet.size());
		for (Q01_Student st: hashSet)
			System.out.println(st.hashCode());
		
	}

}
