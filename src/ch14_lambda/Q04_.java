package ch14_lambda;


public class Q04_ {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {				
				for (int i = 0; i < 3; i++) 
					System.out.println("작업 스레드 실행.");			
		});
		thread.start();
		
	}

}
