package ch02;

public class Ex01_Var {
	
	public static void main(String[] args) {
		int score = 90;
		int result = score * 2;
		
		int intLiteral = 30;  //정수형 리터럴 (integer literal)
		double doubleLiteral = 3.14159; // 실수형 리터럴	(floating point literal)
		char charLiteral = 'a'; // 문자 리터럴, 글자 1개(single quote) 
		String strLiteral = "A quick brown fox"; // 문자열 리터럴, 
		boolean boolLiteral = true; // true or false만 있음
		System.out.println(intLiteral);
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score1); 변수의 사용법, 스코프? 룰
	}

}
