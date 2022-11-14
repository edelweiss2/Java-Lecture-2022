package ch11.sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 비교하려는 Object가 Comparable Interface를 구현한 경우 바로 Arrays.sort 사용가능
 */

public class Ex04_ObjectSort {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "박자바");
		Ex04_Member member2 = new Ex04_Member(1, "이자바");
		Ex04_Member member3 = new Ex04_Member(2, "김자바");
		Ex04_Member[] members = {member1, member2, member3};
		
		Arrays.sort(members, Comparator.reverseOrder());
		for(Ex04_Member member : members) 
			System.out.println(member);
	}

}
