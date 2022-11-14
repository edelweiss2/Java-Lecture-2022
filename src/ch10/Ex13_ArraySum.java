package ch10;

public class Ex13_ArraySum {

	public static void main(String[] args) {
		int[] arr = {5, 14, 76, 23, 48};		
		int sum = 0, index = 0;		
		
		try {
			while (true) {
				sum += arr[index++];				
			}
		} catch (Exception e) {			//ArrayIndexOutOfBoundsException이 
			System.out.println(sum);	//자연스럽게 발생하면서 탈출
										// 의도적으로 만든것
		}
	}

}
