package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03_Pipelined {

	public static void main(String[] args) {
		List<Ex03_Student> list = new ArrayList<>();
		list.add(new Ex03_Student("홍길동", 10));
		list.add(new Ex03_Student("김자바", 20));
		list.add(new Ex03_Student("박객체", 30));
		
		//평균 구하고싶을때 
		//방법 1
		Stream<Ex03_Student> stream = list.stream();
		IntStream scoreStream = stream.mapToInt(s -> s.getScore());
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균점수: " + avg);
		
		//방법2
		avg = list.stream()
				  .mapToInt(s -> s.getScore())
				  .average()
				  .getAsDouble();
		System.out.println("평균점수: " + avg);
		
	}

}
