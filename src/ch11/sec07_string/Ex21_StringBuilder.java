package ch11.sec07_string;

public class Ex21_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, 2);       //4번째 자리에 2 입력
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");   //13은 포함이 안되는것 명심
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
	}

}
