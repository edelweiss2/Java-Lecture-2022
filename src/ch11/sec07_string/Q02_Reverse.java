package ch11.sec07_string;

public class Q02_Reverse {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "안녕하세요";
		
//		String reverse2 = ""; 		 
//		for (int i = str1.length() - 1; i >= 0; i-- ) {
//			reverse = reverse2 +str1.charAt(i);
//		}	
//		
//		System.out.println(reverse);		
		
		System.out.println(reverse(str1));
		System.out.println(reverse(str2));
		
		System.out.println(isPalindrome("우영우"));
		
		
	}
	
	static String reverse(String src) {
		String reverseStr = "";			
		int len = src.length();
		
		for (int i=1; i<= len; i++) 
			reverseStr += src.charAt(len - i);			
		return reverseStr;		
	}
	
	
	
	static boolean isPalindrome(String src) {
		return src.equals(reverse(src));
	}

}
