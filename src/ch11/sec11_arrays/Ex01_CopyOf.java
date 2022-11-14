package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {
		//방법1
		char[] src = {'J', 'A', 'V', 'A'};
		
		char[] dst = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(dst));
		
		//방법2
		dst = Arrays.copyOfRange(dst, 1, 3);
		System.out.println(Arrays.toString(dst));
		
		//방법3, 받는 배열에 기억장소가 확보되어야 함 그리 좋은방법이 아님
		char[] newDst = new char[4];
		System.arraycopy(src, 0, newDst, 0, src.length);
		System.out.println(Arrays.toString(newDst));
		
		src[0] = 'j';
		newDst[1] = 'a';
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(newDst));
		
	}

}
