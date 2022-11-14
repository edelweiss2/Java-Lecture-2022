package ch06;

public class Ex23_Account2 {

	public static void main(String[] args) {
		Ex23_Account account = new Ex23_Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고: "+ account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고: "+ account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고: "+ account.getBalance());
	}

}
