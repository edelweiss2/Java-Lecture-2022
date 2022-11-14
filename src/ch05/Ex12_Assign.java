package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex12_Assign {

	public static void main(String[] args) {
//		주사위를 10번 던진 결과를 dice array에 집어넣기
		int[] dice = new int[10];
		Random ran = new Random();

		for (int i = 0; i < dice.length; i++) {
			dice[i] = ran.nextInt(6) + 1; // 0~5라서 +1 주사위 눈금은 1부터
		}
		System.out.println(Arrays.toString(dice));
		
		
//		학생 30명의 시험점수에 51~100 값을 집어넣고 평균 구하기
		int[] score = new int[30];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(50) + 51;
			sum += score[i];			
		}
		System.out.println((double)sum / score.length);
		System.out.println(Arrays.toString(score));
		
//		한줄에 5명이 성적이 나타나도록 출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]);
			if ((i + 1) % 5 == 0) 		// i가 0부터 시작해서 i가 0일때 5로 나눠져서 줄바꿈 이상하게됨
				System.out.println();
			else
				System.out.print(", ");
		}
		
		
		
	}	

}
