package ch04;

import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (sum < 100) {
			System.out.print("정수 입력 > ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
		
		sum = 0;
		while (true) {					// 의도적으로 무한루프, 탈출 조건에 맞으면 break 
			System.out.print("정수 입력 > ");
			int num = scan.nextInt();
			sum += num;			
			if(sum >= 100)
				break;
		}
		System.out.println(sum);
	}	

}
