package ch06;

public class Ex12_Main {

	public static void main(String[] args) {
		Ex12_Car car = new Ex12_Car();	 //객체 생성
		car.company = "현대자동차";
		car.color = "은색";
		car.model = "Ionic 6";
		car.maxSpeed = 200;
		
		System.out.println(car.company + ", " + car.model + ", " + car.color+ ", "+ car.maxSpeed);
		
		Ex12_Car bus = new Ex12_Car();
		bus.company = "기아자동차";
		bus.model = "리무진";
		bus.color = "분홍색";
		bus.maxSpeed = 180;
		bus.printFeild();
		System.out.println(bus.toString());
	}

}
