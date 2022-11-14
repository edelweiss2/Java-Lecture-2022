package ch04;

public class Ex22_Star {

	public static void main(String[] args) {
		int num = 5;

		System.out.println("1사분면");
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("4사분면");
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2사분면");
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3사분면");
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
