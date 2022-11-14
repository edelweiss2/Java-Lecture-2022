package ch04;

public class Ex24_Diamond {

	public static void main(String[] args) {
		int num = 7;
		for (int i = 1; i <= (num/2) + 1; i++) {
			for (int k = 1 ; k <= num/2 - i + 1 ; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();				
		}
		for (int i = 1; i <= num/2; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*(num/2 - i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
