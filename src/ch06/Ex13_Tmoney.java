package ch06;

/*
 *  - 10000원 카드 구매
 *  - 1회 탑승시 -1350원
 *  - 금액이 -가 되면 안됨. 잔액이 1000원이라 하면 사용 불가
 *  - 금액을 재충전 해야함
 */

public class Ex13_Tmoney {

	public static void main(String[] args) {
		int[] a = new int[2];
		Tmoney card = new Tmoney(10000);
		while(true) {
			if(!card.ride())
				break;
			System.out.println(card.cash);
		}
		card.charge(10000);
		while(true) {
			if(!card.ride())
				break;
			System.out.println(card.cash);
		}
		
	}

}

class Tmoney{
	int cash;
	
	Tmoney() {
		this.cash = 10000;
	}
	Tmoney(int cash) {
		this.cash = cash;
	}
	boolean ride() {
		if (this.cash >= 1350) { 
			this.cash -= 1350;
			return true;
		} 	
		return false;		
	}
	void charge(int cash) {
		this.cash += cash;
	}
}