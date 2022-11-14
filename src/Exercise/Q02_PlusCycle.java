package Exercise;

import java.util.Scanner;

public class Q02_PlusCycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력하세요>>");				
		int num = scan.nextInt();
		scan.close();
		
		//조건을 봤을때 루프를 돌려야함 하지만 몇번 돌려야 될지 모름 -> 무한루프로
//		
//		int originalNum = num;
//		int cycle = 0;   // 싸이클을 구해야 하니까 미리 초기화시켜놓음
//		while (true) {
//			cycle++;
//						
//			int digit10 = (num<10) ? 0 : num/10;
//			int digit1 = num % 10;		
//			num = digit1 * 10 +(digit10+digit1) % 10;
//			System.out.println(num);
//					
//			if (num == originalNum)									
//				break;
//		}				
//		System.out.println(cycle);
		System.out.println(plusCycle(num));
	}
	
	static int plusCycle (int num) {
		int cycle = 0;
		int originalNum = num;
		while (true) {
			cycle++;
						
			int digit10 = (num<10) ? 0 : num/10;
			int digit1 = num % 10;		
			num = digit1 * 10 +(digit10+digit1) % 10;
			System.out.println(num);
			if (num == originalNum)									
				return cycle;
		}				
	}
	
}
