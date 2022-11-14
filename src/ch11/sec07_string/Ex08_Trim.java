package ch11.sec07_string;

public class Ex08_Trim {

	public static void main(String[] args) {
		String oldStr = "   자바 프로그래밍 \t \r \n ";
		String newStr = oldStr.trim();
		System.out.println(newStr);
		System.out.println(newStr.length());  //앞뒤 공백은 다 잘림 \t \r \n 다 잘림
	}

}
