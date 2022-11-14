package ch05;

public class Ex21_Enum {
	public enum Week {MON, TUE, WED, THU, FRI, SAT, SUN};
	public static void main(String[] args) {
		Week today = Week.THU;
		System.out.println(today.name());
		System.out.println(today.ordinal());
		System.out.println(today.compareTo(Week.TUE)); // ordinal 값 3-1
		System.out.println(today.compareTo(Week.SAT));// 3 - 5
//		System.out.println(today);
//		System.out.println(today);
	}

}
