package ch11;

public class Q03_Time {

	public static void main(String[] args) {
		int[] scores = new int[1000];
		for (int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg =(double)( sum / scores.length);
		System.out.println(avg);
		
	}

}
