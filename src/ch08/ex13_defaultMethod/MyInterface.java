package ch08.ex13_defaultMethod;
/*
 * 최초의 method1()를 만들고,
 * 나중에 method2()를 만들고싶을 경우
 */
public interface MyInterface {
	abstract void method1();
	
	public default void method2() {    //이 default는 접근자가 아니고 
		System.out.println("MyInterface - method2()");
	}
}
