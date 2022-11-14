package ch05;

import java.util.Arrays;

public class Ex18_Challanged {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("두 개의 양의정수를 입력하세요.");
			System.exit(1);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + ", " + num2);
		
		
		//두 수중 작은수만큼 for loop을 돌면서 num1, num2로 나누어지는지 확인
		int min = (num1 < num2) ? num1 : num2;
		for (int i =1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				System.out.println(i);
		}
		
		// 찾은 수를 배열로 만들기
		
		int[] tmp = new int[min];
		int index = 0;
		for (int i =1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				tmp[index++] = i;
		}
		System.out.println(index);
		System.out.println(Arrays.toString(tmp));
		
		int[] commonDivisors = Arrays.copyOf(tmp, index);
		System.out.println(Arrays.toString(commonDivisors));
	}

}
