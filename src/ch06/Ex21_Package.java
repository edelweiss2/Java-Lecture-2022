package ch06;

import java.time.LocalDate;  //자바 패키지 안에 time 패키지 안에 LocalDate 

public class Ex21_Package {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();    
//		Exercise ex06 = new Exercise();				//클래스명이 같아도 
//		ch05.Exercise ex05 = new ch05.Excise();		//패키지가 달라서 다름
//		Ex24_Diamond diamond = new Ex24_Diamond();  // 패키지가 다르면 import하거나 앞에 패키지.
	}

}
