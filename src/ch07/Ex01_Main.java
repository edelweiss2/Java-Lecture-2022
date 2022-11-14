package ch07;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent();     //생성자 2개 됨 한번은 자기가 한번은 child에서 생성
		Ex01_Child child = new Ex01_Child();
		
		parent.parentInt = 5;
		parent.parentMethod();
		
		child.childInt = 10;
		child.childMethod();
				
		child.parentInt = 30;			//자식이 부모의 필드값 변경가능
		child.parentMethod();			// 자식이 부모의 메소드 사용가능
		
		
		Ex01_Child child2 = new Ex01_Child(200);
		child2.parentMethod();
	}

}
