package ch13_generic.sec01.non_generic;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
