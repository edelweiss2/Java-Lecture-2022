package ch12_thread;

import java.awt.Toolkit;

public class Ex04_MultiThreadLambda {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {			//Lambda Expression 람다 표현식(화살표 함수) 익명 구현객체
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);           
		}
	}

}
