package ch07;

public class Ex02_Override {

	public static void main(String[] args) {
		Ex02_Parent parent = new Ex02_Parent();
		parent.parentInt = 10;
		parent.parentMethod();		//parent 10
		
		Ex02_Child child = new Ex02_Child();
		child.childInt = 200;
		child.parentInt = 300;		
		child.parentMethod();		//부모에서 만들었지만 (parentMethod but child에서 override)
		                            //child 300
		child.childMethod();		//parent 300
									//child 200
	}

}
