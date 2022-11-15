package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Q05 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
					"This is a java book",
					"Lambda Expressions",
					"Java8 supports lambda expressions"
				);
		list.stream()
			.filter(s -> s.toLowerCase().indexOf("java") >=0 ) //indexof는 안에 원하는string이 없으면 -1
			.forEach(s -> System.out.println(s));				//을 반환함. 있으면 그 위치를 숫자로 반환
	}

}
