package ch04;

public class Ex23_Pythagoras {

	public static void main(String[] args) {
		
		
		for (int a = 1; a < 332; a++) {
			for (int b = a + 1; b < 499; b++) {
				int c = 1000 - (a + b);
				if (a*a + b*b == c*c) 
					System.out.print(a + ", " + b + ", " + c );					
			}			
				
		}
		
	}

}
