package ch07;
/*
 * Casting
 */
public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		parent = son;          // 자동 타입변환
		parent.parentMethod();
		
		parent = daughter;
		parent.parentMethod();
		
//		/*강제 타입변환이지만 올바르지 않음*/
//		daughter = (Daughter)parent;   //강제 타입변환으로 오류없엠
//		daughter.daughterMethod();
//		
//		son = (Son)parent;
//		son.sonMethod();           // 콘솔에 문제가 일어남 (class cast exception) 
//									//15줄 parent=daughter에서 부모가 딸
//		
		/*강제 타입변환, 올바른 방법*/
		if (parent instanceof Daughter) {
			daughter = (Daughter)parent;   
			daughter.daughterMethod();
		}
		if (parent instanceof Son) {
			son = (Son)parent;
			son.sonMethod(); 
		}
	}

}
