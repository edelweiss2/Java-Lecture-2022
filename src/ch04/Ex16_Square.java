package ch04;

import java.util.Scanner;

public class Ex16_Square {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("10보다 큰 정수를 입력하세요 >");
			num = scan.nextInt();
			if (num > 10)
				break;
		}
		
		int sum = 0, sumOfSquare = 0;
		for (int i = 1 ; i <= num ; i++) {
			sumOfSquare += (i*i);
			sum += i;
		}
		int squareOfSum = sum * sum;
		System.out.println("제곱의 합" + sumOfSquare);
		System.out.println("합의 제곱" + squareOfSum);
	}

}
