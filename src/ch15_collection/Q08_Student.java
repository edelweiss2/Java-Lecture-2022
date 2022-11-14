package ch15_collection;

import java.util.Objects;

public class Q08_Student {
	public int studentNum;
	public String name;
	
	Q08_Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Q08_Student))
			return false;
		Q08_Student target = (Q08_Student) obj;
		if(studentNum != target.studentNum) 
			return false;
		return true;
	}
	
}
