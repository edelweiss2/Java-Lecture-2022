package ch14_lambda;

import java.util.function.Function;

public class Q06_Main {
	public static double calc(Q06_Interface fun) {
		double x = 10;
		double y = 4;
		return (double) fun.apply(x, y);
	}

	public static void main(String[] args) {
		double result = calc((x, y) -> (x / y));
		System.out.println("result : " + result);
	}

	

	
}
