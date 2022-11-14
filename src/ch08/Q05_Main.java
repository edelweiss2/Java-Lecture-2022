package ch08;

public class Q05_Main {

	public static void main(String[] args) {
		Q05_Action action = new Q05_Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
			
		};                   //익명 구현객체 (별도의 클래스파일이 있어서 해주는게 원칙. 
		action.work();		 //보통 거의 쓸일없음		
	}

}
