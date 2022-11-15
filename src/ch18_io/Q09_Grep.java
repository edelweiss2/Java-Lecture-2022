package ch18_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q09_Grep {

	public static void main(String[] args) throws Exception {
		grep("reader", "/temp/Q09_Grep.java");
	}

	public static void grep(String word, String filePath) {
		try {
			FileReader fr = new FileReader (filePath);
			BufferedReader br = new BufferedReader(fr);
			int lineNo =0;
			while (true) {
				String rowData = br.readLine();
				if (rowData == null)
					break;
				lineNo++;
				String lineData = rowData.toLowerCase();
				if(lineData.indexOf(word)>=0)
					System.err.printf("%3d:\t%$%n", lineNo + ": " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
