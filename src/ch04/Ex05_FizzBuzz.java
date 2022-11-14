package ch04;

import java.util.Random;
import java.util.Scanner;

public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		// 임의의 정수값을 생성
		Random ran = new Random();
		int number = ran.nextInt(100) + 1; // 1~100 까지 임의의 정수값 생성

		System.out.print("1에서 100까지의 정수를 입력하세요."); // 자바 scanner로 입력받는 방법
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		number = num;
		scan.close();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println(number + ", FizzBuzz");
		} else if (number % 5 == 0) {
			System.out.println(number + ", Buzz");
		} else if (number % 3 == 0) {
			System.out.println(number + ", Fizz");
		} else
			System.out.println(number);	
		
	}

}
