package ch06;

public class Ex23_Account {
	private int balance;
	
	public static final int MIN_BALANCE = 0; 
	public static final int MAX_BALANCE = 1000000;
			
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		//내 잔고의 total balance가  0 이상, 100만 이하일때 this.balance를 더해야함		
//		if(MAX_BALANCE >= balance+this.balance && balance+this.balance >= MIN_BALANCE)
//			this.balance += balance;						
		//매개변수 balance가 0이상 100만 이하
		if(MAX_BALANCE >= balance && balance >= MIN_BALANCE)
			this.balance += balance;	
	}		
}
