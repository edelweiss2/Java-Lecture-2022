package ch05;

import java.util.Arrays;

/**
 * 배열복사 - 1차원 배열에서만 적용됨
 */

public class Ex15_ArrayCopy {

	public static void main(String[] args) {
		//for로 복사
		int [] src = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] dst = new int [8];
		// src[2] 부터 끝까지 dst에 카피
		for (int i = 2; i < src.length; i++) {
			dst[i-2] = src[i];
		}
		System.out.println(Arrays.toString(dst));
		
		//
		String[] srcStrArray = {"A", "quick", "brown", "fox"};
		String[] dstStrArray = new String[5];
		//src의 몇번째부터 , dst의 몇번째부터 를 묻는거
		System.arraycopy(srcStrArray, 0, dstStrArray, 1, srcStrArray.length); 
		System.out.println(Arrays.toString(dstStrArray));
		
		// 실전에서는 arrays copy는 많이 사용안하고 List를 많이씀
		int[] newArray = Arrays.copyOf(dst, 10);
		System.out.println(Arrays.toString(newArray));
		
	}

}
