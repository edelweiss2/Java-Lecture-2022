package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_OutputStream {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/temp/test.db");

			byte a = 10, b = 20;
			int c = 30; // integer(4byte)로 선언해도 실제론 1byte만 써진다.
			os.write(a); // a,b도 자동 타입캐스팅으로 인테저로 나감
			os.write(b);
			os.write(c);

			byte[] array = { 10, 20, 30, 40, 50 };
			os.write(array);
			
			os.write(array, 1, 3);

			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
