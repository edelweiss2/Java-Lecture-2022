package ch11.sec07_string;
//주어진 스트링에서 내가 찾고자하는 문자열이 몇번째 있는지 찾는값
public class Ex04_IndexOf {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		int index = str.indexOf("프로그래밍");
		System.out.println(index);
		
//찾고자 하는 문자열이 대상 문자열에 있는경우 리턴밸류는 0이상이 된다.
		if (str.indexOf("자바") >= 0 )
			System.out.println("자바 포함");
		else 			//없으면 -1을 리턴
			System.out.println("자바 포함안됨");
	
	}

}
