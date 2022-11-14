package ch11.sec07_string;

import java.util.Arrays;

public class Ex11_Split {

	public static void main(String[] args) {
		String fruits = "감, 배, 밤, 귤";
		String[] fruitsArr = fruits.split(", ");
		System.out.println(Arrays.toString(fruitsArr));
		
		String fruits2 = "사과, 대추. 망고: 포도";
		String[] fruitsArr2 = fruits2.split("[,|.|:]");
		System.out.println(Arrays.toString(fruitsArr2));

		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArr = paths.split(";");
//		for (String path: pathArr)
//			System.out.println(path);
		String pathStr = String.join("\n", pathArr);
		System.out.println(pathStr);
	}

}
