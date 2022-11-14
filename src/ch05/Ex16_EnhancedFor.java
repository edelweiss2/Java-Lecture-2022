package ch05;

/**
 * 향상된 For 문
 */
public class Ex16_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Banana", "Cherry" };
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//
		
		
		
		
	}

}
