package ch11.sec03_object;

import java.util.HashMap;

public class Ex02_HashCodeMain {
//		HashCode = 이 두 객체를 식별하기위해서 자바에서는 메모리의 기억장소에 
//				   메모리 번지수를 이용해서 어떠한 정수값을 만들어줌
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<>();
		//key 객체를 식별키로 사용해서 String값을 저장하는 HashMap 객체를 생성
		
		hashMap.put(new Key(1), "James");
		hashMap.put(new Key(2), "Maria");
		
		//Key class에서 HashCode Method를 재정의 하기 이전이면 
		String value = hashMap.get(new Key(1));
	}

}
