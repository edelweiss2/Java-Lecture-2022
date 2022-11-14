package ch06;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.register("kim", "9876", "김자바");
		memberService.register("hong", "12345", "홍길동");
		memberService.register("hong", "1234", "홍자");
		memberService.printAllMembers();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Id:  ");
		String id = scan.nextLine();
		System.out.print("Password:    ");
		String password = scan.nextLine();
		boolean result = memberService.login(id, password);
		if (result) {
			System.out.println("로그인 되었습니다");
			memberService.logout(id);
		} else {
			
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
		
	}
	
	
}
