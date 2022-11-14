package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; //mobile 전화번호
		String data1 = "02-2345-6789";
		String data2 = "010-234-9876";
		boolean result1 = Pattern.matches(regExp, data1);
		boolean result2 = Pattern.matches(regExp, data2);
		
		System.out.println(result1 + ", " + result2);
		
		regExp = "\\w+@\\w+\\.\\w+(\\\\.\\\\w+)?";
		data1 = "mykyh1010@naver.com";
		data2 = "ck.kim@naver.co.kr";
		result1 = Pattern.matches(regExp, data1);
		result2 = Pattern.matches(regExp, data2);
		
		System.out.println(result1 + ", " + result2);
		
				
	}

}
