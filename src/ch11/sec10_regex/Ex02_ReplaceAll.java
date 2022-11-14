package ch11.sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "나는 Java Programming이 좋아요!!!";
		data.replaceAll("[A-Z]", "");
		System.out.println(data.replaceAll("[A-Z]", ""));
		System.out.println(data.replaceAll("[a-z]", ""));
		System.out.println(data.replaceAll("[^가-힣 ]", "" ));
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		String[] arr = data.split("\\\\"); //pattern으로 \\을 사용해야 되기 때문에 
		System.out.println(Arrays.toString(arr));
	}

}
