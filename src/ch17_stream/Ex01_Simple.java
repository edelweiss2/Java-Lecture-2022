package ch17_stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01_Simple {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("컬렉션");
		set.add("람다식");
		
		//스트림을 이용해 반복처리
		Stream stream = set.stream();
		stream.forEach(name -> System.out.println(name)); //이렇게 잘 안쓰임
		
		set.stream()
		   .forEach(s -> System.out.println(s));  //바로 불러쓰는게 많음
		
		//컬렉션 단독으로 forEach 사용가능
		set.forEach(s -> System.out.println(s));
		
		
	}

}
