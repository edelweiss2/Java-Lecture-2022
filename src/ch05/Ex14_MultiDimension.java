package ch05;

import java.util.Arrays;

public class Ex14_MultiDimension {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];  //행 row 2 열 column 3
		int[][] score = {{80, 90, 84}, {78, 85, 95}};
		
		System.out.println(score[0][0]);
		System.out.println(score[1][1]);
		System.out.println(matrix.length); // 행의개수 묻는거
		System.out.println(matrix[0].length); // 1행의 열의 갯수 인듯
		
		for (int i = 0; i < score.length; i++) {
			for (int k = 0; k < score[0].length; k++) {
				System.out.print(score[i][k]+ " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(score)); // score는 2차원이라서 이상하게 깨져나옴
		
		
	}
	
}
