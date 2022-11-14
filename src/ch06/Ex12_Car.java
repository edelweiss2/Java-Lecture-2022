package ch06;

public class Ex12_Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	void printFeild() {
		System.out.println(this.company + ", " + this.model + ", " + this.color+ ", "+ this.maxSpeed);
	}

	@Override
	public String toString() {
		return "Ex12_Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}
