package ch08.ex12_inheritence;

public class Main {

	public static void main(String[] args) {
		InterfaceC ic = new ImplementClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
//		ic.methodParent(); 는 인터페이스에 없어서 사용못함
		
	}

}
