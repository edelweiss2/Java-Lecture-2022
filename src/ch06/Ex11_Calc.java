package ch06;

public class Ex11_Calc {

	public static void main(String[] args) {
		Calc calc = new Calc(1.2, 3.4);
		double res = calc.add();
		System.out.println(res);
		
		System.out.println(new Calc(2.5, 4.6).add());
	}

}

class Calc {			//public 이나 private 안쓰면 디폴트값 생략
	double x;    //2개의 실수값
	double y;
	
	Calc(double a, double b) {    //생성자, 앞에 타입 없음
		this.x = a;
		this.y = b;		
	} 
	double add() {     //메소드(함수)
		return this.x + this.y;
	}
	double subtract() {
		return this.x - this.y;
	}
}