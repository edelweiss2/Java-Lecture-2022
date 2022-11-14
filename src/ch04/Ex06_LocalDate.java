package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex06_LocalDate {

	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		System.out.println(today);
//		System.out.println(today.getYear());
//		System.out.println(today.getMonthValue());
//		System.out.println(today.getDayOfMonth());
	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("생년 > ");
		int bYear = scan.nextInt();
		System.out.print("생월 > ");
		int bMonth = scan.nextInt();
		System.out.print("생일 > ");
		int bDay = scan.nextInt();
		LocalDate birthday = LocalDate.of(bYear, bMonth, bDay);
		System.out.println(birthday);
		scan.close();
		
		
		LocalDate today = LocalDate.now();
		System.out.println("오늘날짜: " + today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		
		int fullAge = 0;
		if (tMonth > bMonth)
			fullAge = tYear - bYear;
		else if (tMonth < bMonth)
			fullAge = tYear - bYear - 1;
		else {
			if (tDay >= bDay) 
				fullAge = tYear - bYear;
			else 
				fullAge = tYear - bYear -1;
		}
		System.out.println("만 나이는 " + fullAge + "세 입니다.");	
	}
	
	
	

}
