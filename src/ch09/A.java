package ch09;
/*
 * 중첩 클래스 거의 안씀
 */

public class A {				//가장 외부의 Class
	A() {						//A의 생성자
		System.out.println("A 객체가 생성됨.");
	}   
	
	//인스턴스 멤버 클래스 
	class B {                   //클래스A안의 클래스 B
		B() {
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		void method1() {}
		
	}
	
	//정적 멤버 클래스
	
	static class C{
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	// 로컬 클래스
	void method() {				
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method1() {}			
		}
	}
}
