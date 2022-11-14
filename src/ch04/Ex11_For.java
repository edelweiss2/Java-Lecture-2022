package ch04;

import java.util.Scanner;

/*
 * for : 대부분 사용, 반복 횟수를 아는 경우
 * while : 반복 횟수를 정하기 어려운 경우 - ex) 상대가 얼마나 신호를 보낼지 모를때
 * do-while : 실용성이 떨어짐.
 */
public class Ex11_For {

	public static void main(String[] args) {
		// 1에서 100까지 합

		int sum = 0;
		for (int i = 1; i <= 100; i++)
			sum += i;
		System.out.println(sum);

		// 1에서 10까지 곱

		int product = 1;
		for (int i = 1; i <= 10; i++)
			product *= i;
		System.out.println(product);

		// 사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기

		Scanner scan = new Scanner(System.in);
		String line = "";
		scan.close();
		
		for (int i = 0; i < 5; i++) { // 5회 반복 int i = 0으로 시작하는건 배열에서 많이함
			System.out.print("입력하세요> ");
			String s = scan.nextLine();
			line += s + " ";
		}
		System.out.println(line);
		
	}

}
