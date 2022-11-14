package ch03;

public class Ex02_Unary {

	public static void main(String[] args) {
		boolean a = true;
		System.out.println(!a);
		
		int b = 3;
		System.out.println(Integer.toBinaryString(b)); //2진수로 보여주는거
		System.out.println(Integer.toBinaryString(~b)); //bitwise 반전 0을1로 1을0으로
		System.out.println(Integer.toBinaryString(-b));  // 
		System.out.println(Integer.toHexString(-b)); // 16진수로 보려고 to hex string
		
	}

}
