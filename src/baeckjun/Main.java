package baeckjun;

public class Main {
	
	
	public static void main(String[] args) {
		int n = 5;
		
		int[] arrA = {1, 1, 1, 6, 0};
		int[] arrB = {2, 7, 8, 3, 1};
		
		System.out.println(s(n,arrA, arrB));
	}
	
	
	public static int s(int n, int[] a, int[] b) {		
		int s = 0;
		
		for(int i = 0; i < n; i++) {
			s += a[i] * b[i];
		}
		
		
		return s;
	}
	
	public int sMin(int n, int[] a, int[] b) {
		int sMin = 0;
		int bMax = b[0];
		
		for(int i= 0; i < n; i++) {
			
			sMin = a[i]*b[i];
		}
		
		return sMin;
	}

	
}

