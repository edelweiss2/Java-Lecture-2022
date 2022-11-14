package ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		byte b = 30;
		short c = 300; 
		int i = b; 		// 작은수 -> 큰 수로 변환 할 때는 자동 변환이 됨
		i = c; 			// 이를 promotion 이라고 함
		short s = (short)i;  // i 값이 integer지만(4byte) 명시적으로(short)를 추가해 short수(2byte)로 변환시키기 때문에 에러가 나지않음.
		long l = i;			// int -> long   가능
		float f = l; 		// long -> float 가능
		double d = f; 		// float -> double 가능
		
		byte bb = (byte)s; // 이건 실행할 때 에러가남. 컴파일에선 자체 에러 x 좋은 코드가 아님
		System.out.println(s);
		System.out.println(bb); // 에러가 발생함
		
		System.out.println("안녕하세요?");
			
	}

}
