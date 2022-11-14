package ch10;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();    //이건 다형성. 자식은 부모타입으로 자동타입변환 가능
		
//		cat = (Cat) animal1();  
//		dog = (Dog) animal1();
		Cat cat;
		Dog dog;
		if (animal1 instanceof Cat) {
			cat = (Cat) animal1;
		}
		if (animal1 instanceof Dog) {
			dog = (Dog) animal1;
		}
	}

}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}
