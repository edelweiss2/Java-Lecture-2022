package ch11.sec07_string;

import java.io.UnsupportedEncodingException;

public class Ex03_GetBytes {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요?";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);  //UTF-8로 해서 한글자당 3바이트
		String strFromByteArray = new String(bytes1);
		System.out.println(strFromByteArray);
		System.out.println();
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);
		strFromByteArray = new String(bytes2, "EUC-KR"); //한글자에 2바이트씩
		System.out.println(strFromByteArray);
		System.out.println();
		
		
	}

}
