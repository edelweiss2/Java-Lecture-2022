package mysql.erd;

import java.util.List;
import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class UsersTest {
	static UsersDao dao = new UsersDao();
	public static void main(String[] args) {
		UsersDao dao = new UsersDao();
		
//		dao.registerUser(new Users("admin", "admin", "관리자", "admin@mysql.com"));
//		dao.registerUser(new Users("james", "james", "관리자", "james@mysql.com"));
		
//		Users user = dao.getUserInfo("admin123");
//		System.out.println(user);
		
		
//		List<Users> list = dao.listUsers();
//		for(Users u : list) {
//			System.out.println(u);
//		}
						
		Scanner scan = new Scanner(System.in);
		System.out.print("uid> ");
		String uid = scan.nextLine();
		System.out.print("pwd> ");
		String pwd = scan.nextLine();
		login(uid, pwd);
	}
	
	static void login(String uid, String pwd) {
		Users user = dao.getUserInfo(uid);
		if(!uid.equals(user.getUid())) {
			System.out.println("ID가 없습니다.");
		} else {
			if (BCrypt.checkpw(pwd, user.getPwd())) {
				System.out.println("Login 성공");
			}  else {
				System.out.println("비밀번호가 틀렸습니다.");
			} 
		} 
	}

}
