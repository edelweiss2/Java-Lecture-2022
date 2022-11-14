package ch14_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05_FunctionalMain {

	public static void main(String[] args) {	
		Runnable r = () -> System.out.println("Runnable"); //no arg, no return
		Consumer<Integer> c = i -> System.out.println(i*i); //with arg, no return
		Supplier<Integer> s = () -> (int) (Math.random() * 6) + 1 ; // no arg, with return
		Function<Integer, Integer> f = i -> i * i; 	//with arg, with return
		Predicate<Integer> p = x -> x % 2 == 1;		//with arg, return boolean
		
		r.run();
		c.accept(5);
		System.out.println(s.get());
		System.out.println(f.apply(5));
		System.out.println(p.test(3));
		
		BiConsumer<Integer, Integer> bc = (x,y) -> 	System.out.println(x + y);
		BiFunction<Integer, Integer, Double> bf = (x, y) -> Math.sqrt(x*x + y*y);
		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;

		bc.accept(3, 4);
		System.out.println(bf.apply(3, 4));
		System.out.println(bp.test(3, 4)); 
	}

}
