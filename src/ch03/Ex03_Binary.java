package ch03;

// 큰수를 다룰때야 오버플로우나 맥스값 생각하는게 의미있음 그게아니라면 크게 쓸 일 없을듯
public class Ex03_Binary {

	public static void main(String[] args) {
		int a = 2000000000;
		int b = a * 2 ;  // a값이 40억 -> int 표시 범위를 벗어나 오버플로우
		System.out.println(b); //에러는 아니지만 값이 이상해짐
		System.out.printf("%d, %d%n", Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println(safeAdd(a, a));
		System.out.println(safeAdd(-a, -a));
		System.out.println(safeAdd(a,100000000));
		
		int c = 3, d = 4;
		int res1 = c / d;		// 0.75를 결과값으로 정수를 받으므로 0 (반올림이 아니라 자름)
		System.out.println(res1);  
		double res2 = c / d;
		System.out.println(res2);
		double res3 = c / (double)d; //하나만 double을 줘도 실수가 됨. 나누기
		System.out.println(res3);  // 나누기 연산할때 주의
		System.out.println(4/ 3.); // 3뒤에 .을 찍으면 (0 생략해도됨) 실수로 받음
		
		System.out.println(Double.NaN);  // 0.0 / 0.0  부정
		System.out.println(Double.POSITIVE_INFINITY);  // 3.0 / 0.0, 불능
		
		//비교연산자
		System.out.println(3 == 3);
		System.out.println(3.0 == 3.0); //이런거 하지마라. 실수연산에서 같으냐를 비교하면 굉장히 위험 할 수 있음
		System.out.println(3.0 == 1.2+3.3-1.5); //지금은 true로 나오지만 실수표현방식에서 모든숫자를 정확하게 표현못함. 실수에서 두 수가 같냐고 비교하면 값이 정확하지 않을 수 있음. 엉뚱한 결과를 야기
		System.out.println(Math.abs(3.0 - (1.2+3.3-1.5)) < 1e-15) ; // 차이의 절대값 (Math.abs)이 1e-15(10의 -15승)보다 작냐고 물어봐야함.
		
		// 문자열 비교 - 문자열은 변수가 참조형
		String str1 = "홍길동";  // 리터럴로 문자열을 할당한것 (Heap memory)
		String str2 = "홍길동";  	//문자열 객체와 리터럴은 저장되는위치가 다름
		String str3 = new String("홍길동"); // 문자열 객체를 만들어서 할당 (stack memory)
		System.out.println(str1 + str2 + str3);
		System.out.println(str1 == str2); // 두개의 저장된 공간(리터럴이 저장되는곳)이 같아서 true라고 나옴
		System.out.println(str1 == str3); // 두개의 값은 같지만 false가 나옴. 다른 기억장소에 저장된다는걸 보여줌
		System.out.println(str1.equals(str3)); // string의 비교는 이렇게함
		
	}
	private static int safeAdd(int x, int y) {      //method, 다른언어에서는 함수
		if (x > 0 && y > 0 && y > Integer.MAX_VALUE - x )
			return 0;
		if (x < 0 && y < 0 && y < Integer.MIN_VALUE - x )
			return 0;
		
	   return x + y;
	}
}
