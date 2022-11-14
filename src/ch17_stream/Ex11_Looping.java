package ch17_stream;

import java.util.Arrays;

public class Ex11_Looping {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		//잘못 작성된 경우
		Arrays.stream(intArr)
			  .filter(i -> i % 2 == 0)
			  .forEach(i -> System.out.println(i));  //peek은 중간처리일뿐이라 결과가 
		System.out.println(); 						 //보이지 않음 foreach가 와야 결과를 볼수있음
		
		//peek 사용 예
		int sum = Arrays.stream(intArr)
						  .filter(i -> i % 2 == 0)
						  .peek(i -> System.out.println(i))
						  .sum();
		System.out.println("총합: " + sum);
		
	}

}
