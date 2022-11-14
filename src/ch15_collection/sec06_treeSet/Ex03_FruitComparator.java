package ch15_collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex03_FruitComparator {

	public static void main(String[] args) {
		TreeSet<Fruit> ts = new TreeSet<>(new FruitComparator());
		
		ts.add(new Fruit("Grape", 3000));
		ts.add(new Fruit("Melon", 10000));
		ts.add(new Fruit("StrawBerry", 6000));
		ts.add(new Fruit("Banana", 6000));
		
		for (Fruit fruit : ts)
			System.out.println(fruit.name + " :  " + fruit.price);
	}

}
