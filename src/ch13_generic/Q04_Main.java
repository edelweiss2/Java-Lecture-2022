package ch13_generic;

public class Q04_Main {
	
	public static void main(String[] args) {
		Q04_Pair<String, Integer> pair = new Q04_Pair<>("홍길동", 35);
		Integer age = Q04_Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		Q04_ChildPair<String, Integer> childPair = new Q04_ChildPair<>("홍삼원", 20);
		Integer childAge = Q04_Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
//		Q04_OtherPair<String, Integer> otherPair = new Q04_OtherPair<>("홍삼원", 20)
//		int otherAge = Q04_Util.getValue(otherPair, "홍삼원");
//		System.out.println(otherAge);
		
	}

}
