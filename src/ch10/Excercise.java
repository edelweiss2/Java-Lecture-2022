package ch10;

public class Excercise {

	public static void main(String[] args) {
		int[] a = new int[5];
		try {
			System.out.println(a[5]);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("출력합니다");
	}

}
