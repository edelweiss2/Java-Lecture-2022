package ch03;
/** 
 * < **는 이 클래스 설명?
 */
public class Ex01_Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++;	
		System.out.printf("a = %d, \tb = %d\n", a, b); // \n은 한칸 건너띄어라
		int c = ++a;
		System.out.printf("a = %d, \tc = %d%n", a, c); // %n도 같은의미  \t
		
		String s = (a % 2 == 0) ? "짝수" : "홀수"; // 3항 연산자는 코딩을 간결하게 만들어줌
		System.out.println(a + "은/는 " + s);
		
		int sum = 0;
		sum += 1;
		sum += 2;
		System.out.println(sum);
		sum = 0;
		for (int i = 1; i<=10; i++ )
			sum += i;
		System.out.println(sum);
		
		short s1 = 1;
//		short ss = -s1;		// 단항연상자 -를 하면 결과가 int 타입이 되서 에러가남
							//	-s1 앞에 (short) 달면 프로그램 돌아가긴함
							//	byte, short, long ==> int로 써라 
							//	처음엔 float 쓰지말고 double로 쓰고
							//	char : 문자를 사용할 때만.
							//	boolean 
	}
		
}
