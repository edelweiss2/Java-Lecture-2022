package ch11;

import java.util.Objects;

public class Q01_Student {
	private String studentNum;
	
	public Q01_Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
//		return Objects.hash(studentNum);
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Q01_Student))
			return false;
		Q01_Student st = (Q01_Student) obj;
		return studentNum.equals(st.getStudentNum());
		
	}
	
}
