package ch15_collection.sec02_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		
		//List의 맨 앞에 추가하는것은 ArrayList가 오래걸림
		long startTime = System.nanoTime();
		for(int i = 0; i<10000 ; i++)
			al.add(0, String.valueOf(i));
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간: " + (endTime - startTime) + " ns");		
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000 ; i++)
			ll.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간: " + (endTime - startTime) + " ns");
		System.out.println();
		
		System.out.println("List 뒤쪽에 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i<10000 ; i++)
			al.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간: " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000 ; i++)
			ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간: " + (endTime - startTime) + " ns");
		
	}

}
