package ch15_collection.sec05_properties;

import java.io.IOException;
import java.util.Properties;

public class Ex01_Properties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		//database.properties 라는 파일을 로드해야함
		//파일을 읽을때 자바는 익셉션 처리를 반드시 해야함
		prop.load(Ex01_Properties.class.getResourceAsStream("database.properties"));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("admin"));
	}

}
