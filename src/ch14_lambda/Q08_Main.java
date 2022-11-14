package ch14_lambda;

import java.util.function.ToIntFunction;

public class Q08_Main {
	private static Q08_Student[] students = {
			new Q08_Student("홍길동", 90, 96),
			new Q08_Student("신용권", 95, 93)
	};
	
	public static double  avg(Q08_Function<Q08_Student> f) {
		double sum = 0;
		for (Q08_Student student : students)
			sum += f.apply(student);
		double avg =  sum / students.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균점수 : " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균점수 : " + mathAvg);
	}
		
 }


