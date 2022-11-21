package mysql.erd;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		String cryptedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd.length());
		System.out.println(cryptedPwd);
		
		String cryptedPwd2 = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd2);
		System.out.println();
		
		String salt = BCrypt.gensalt();
		System.out.println(salt);
		System.out.println(salt.length());
		
		// #2a : BCrypt의 버전 정보
		// $10 : 라운드 정보
		
		
		//salt값이 동일하면 만들어지는 비문도 동일
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println(BCrypt.hashpw(pwd, salt));
		
		// 패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result);
	}

}
