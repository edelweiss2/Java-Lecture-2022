package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08_Boxed {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 4, 6, 7};
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream()
				 .forEach(d -> System.out.println(d));
		
		intStream = Arrays.stream(intArray);  //인트스트림이 한번 되면 닫히기때문에 다시 만들어줌
		intStream.boxed()
				 .forEach(obj -> System.out.println(obj.intValue()));
	}

}
