package ch11.sec05_system;

import java.util.Properties;
import java.util.Set;

public class Ex02_Property {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.name");
		System.out.println(osName + ", "+ userName + ", "+ userHome);
		System.out.println();
		
		Properties props = System.getProperties();
		Set keys = props.keySet();   // set -> 집합 -> 중복이 없음 -> 포룹돌림
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println(key + ": " + value);
		}
		
		
	}

}
