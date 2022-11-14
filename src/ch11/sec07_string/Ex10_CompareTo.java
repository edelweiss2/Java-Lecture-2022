package ch11.sec07_string;

public class Ex10_CompareTo {

	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		
		System.out.println(str1.compareTo(str2)); //-2 : 앞에서 뒤를 빼는거 대문자 A와 C의 차이 = -2
		System.out.println(str1.compareToIgnoreCase(str3)); //아스키코드 ASCII code A0x41 B0x42 a0x61 b0x62
															//앞 a가 같으니까 두번째 i와 p를 비교
//																i jklmno p -> 7만큼 차이
		String han1 = "가나다";
		String han2 = "라마바";
		System.out.println(han1.compareTo(han2)); /** -2940 숫자보다 부호가중요 */
		
		System.out.println(str1.compareTo(han1)); //영어가 먼저라서 마이너스가뜸
	}

}
