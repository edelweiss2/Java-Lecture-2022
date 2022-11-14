package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q06_Main {

	public static void main(String[] args) {
		List<Q06_Member> list = Arrays.asList(
					new Q06_Member("홍길동", 30),
					new Q06_Member("신용권", 40),
					new Q06_Member("감자바", 26)
				);
		
		Double avg = list.stream()
						 .mapToDouble(Q06_Member::getAge)
						 .average().getAsDouble();
		System.out.println("평균나이: " + avg);
						 
	}

}
