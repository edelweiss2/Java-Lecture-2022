package ch11.sec07_string;

import java.util.Scanner;

public class Q05_CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장 입력> ");
		String plainText = scan.nextLine();
		System.out.println("스텝> ");
		int step = scan.nextInt();
		String cipherText = plain2cipher(plainText, step);
		System.out.println(plain2cipher(plainText, step));
		System.out.println(cipher2plain(cipherText, step));
	}
	
	static String plain2cipher (String text, int step) {
		char[] cipherText = new char[text.length()];   //일단 암호문 만들것의 길이
		for (int i = 0; i<text.length();i++) {
			char c = text.charAt(i);                    //끄집어 오는 글자
			if (c == ' ') {
				cipherText[i] = c;						//공백이 오면 그대로
				continue;
			}
			char d = (char)(c + step);					// c가 인트가 되니까 앞에 (char)
			if (d > 'Z')
				d =(char)(d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}
		
	static String cipher2plain (String text, int step) {
		char [] plainText = new char[text.length()];
		for (int i=0; i<text.length();i++) {
			char c = text.charAt(i);
			if (c == ' ') {
				plainText[i] = c;
				continue;
			}
			char d = (char)(c - step);
			if (d < 'A') 
				d = (char)(d+26);
			plainText[i] = d;
		}
		return new String(plainText);
	}
}

