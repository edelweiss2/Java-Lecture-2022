package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Ex02_Integer {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,6,3,5,4,8,2);
		
		list.stream()
		    .filter(i -> i % 2 == 1)		//중간처리
		    .map(i -> i * i)				//중간처리, 여러개 사용가능
		    .sorted()
		    .forEach(i -> System.out.println(i));
	}

}
