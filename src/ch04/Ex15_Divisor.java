package ch04;

import java.util.Scanner;

public class Ex15_Divisor {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("10보다 큰 정수를 입력하세요 >");
			num = scan.nextInt();
			if (num > 10)
				break;
		}

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				System.out.println(i + "은 약수입니다.");

	}

}
