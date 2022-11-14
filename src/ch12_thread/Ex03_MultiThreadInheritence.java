package ch12_thread;

public class Ex03_MultiThreadInheritence {

	public static void main(String[] args) {
		Thread thread = new Ex03_BeepThread();
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}           //
		}
	}

}
