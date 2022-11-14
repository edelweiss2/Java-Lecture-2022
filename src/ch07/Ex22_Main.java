package ch07;

public class Ex22_Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		Cock cock = new Cock();
		cow.sound();
		cock.sound();
		System.out.println();
		
		Ex22_Animal animal = new Cow();
		animal.sound();
		animal = new Cock();
		animal.sound();
		System.out.println();
		
		
		animalSound(new Cow());
		animalSound(new Cock());
	}
	
	static void animalSound(Ex22_Animal animal) {
		animal.sound();
	}
}
