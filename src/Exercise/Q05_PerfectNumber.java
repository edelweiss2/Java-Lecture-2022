package Exercise;

public class Q05_PerfectNumber {

	public static void main(String[] args) {

		for (int i = 2; i < 10000; i++) {
			int sum = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0) {
					sum += k;
				}
			}
			if (sum == i)
				System.out.println(i + "는 완전수");
		}

	}
}
