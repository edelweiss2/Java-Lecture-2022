package ch08.ex13_defaultMethod;
/*
 * 새롭게 MyClass를 구현한 클래스
 */
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB - method1()");
	}	
	@Override
	public void method2() {    //default 못씀 인터페이스 아니라서 
		System.out.println("MyClassB - method2()");
	}
}
