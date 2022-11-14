package ch10.ex11_userDefineException;

public class Account {
	private int balance;
	
	public Account() {}

	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalaceInsufficientException {
		if (balance < money) {
			throw new BalaceInsufficientException("잔고 부족: " +(money - balance) + " 모자람");
		}
		balance -= money;	
	}
}
