package ch08;

public class Q03_Main {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
	private static void printSound(Q03_Soundable soundable) {
		System.out.println(soundable.sound());
	}
}

class Cat implements Q03_Soundable {		//1 class 1 file  이 원칙이라 이렇게 만들진 않음
											//1 interface 1 file
	@Override								//지금은 끽해야 한줄이라 
	public String sound() { 				//안에다가 클래스 여러개 만들어도
		return "야옹";						//bin에 클래스 파일은 여전히 3개 생기기때문에 
	}										//찾기 쉽게하려면 1클래스 1파일
											//캣.class를 보고 이클립스에서 
											//	cat.java찾을려하는데 못찾을수있음		
}

class Dog implements Q03_Soundable {

	@Override
	public String sound() {		
		return "멍멍";
	}
	
}