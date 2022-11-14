package ch11.sec07_string;

public class Strings {
	
	
	public static String reverse(String src) {
		String reverseStr = "";			
		int len = src.length();
		
		for (int i=1; i<= len; i++) 
			reverseStr += src.charAt(len - i);			
		return reverseStr;		
	}
	
	
	
	public static boolean isPalindrome(String src) {
		return src.equals(reverse(src));
	}
	
	public static int count(String src, String target) {
		String eliminated = src.replace(target, "");
		int len = (src.length()- eliminated.length()) / target.length();
		return len;
	}
}
