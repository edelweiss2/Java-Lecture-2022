package ch05;

import java.util.Arrays;
import java.util.Random;
/*length 30인 정수형배열 score를 만들고
 * 배열에 100이하 임의의 정수값을 입력하고
 * 이 배열에서 가장 큰 수를 찾으시오
 */
public class Ex17_Max {

	public static void main(String[] args) {
		int[] score = new int[30];
		Random ran = new Random();
		for (int i=0; i<score.length; i++) {
			score[i] = ran.nextInt(100);  //100보다 작은 랜덤인수 입력		
		}
		System.out.println(Arrays.toString(score));
		
		int max = 0;				// int max = score[0];
		for (int i = 0; i<score.length; i++) {
			if (score[i]> max)
				max = score[i];			
		}
		System.out.println(max);
		
		int min = 100;  //0으로 주면안됨, 최소값 찾는거니까 int min = score[0];으로 줘도됨. 배열의 첫번째 숫자로 주는거니까.
		for (int i=0; i<score.length; i++) {
			if (score[i]<min)
				min = score[i];
		}
		System.out.println(min);
	}

}
