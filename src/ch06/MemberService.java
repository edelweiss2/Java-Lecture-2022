package ch06;

public class MemberService {
	private Member[] members = new Member[10];
	
	void register(String id, String password, String name) {
	Member member = findById(id);
	if(member != null) {
		System.out.println("id가 중복되었습니다.");
		return;
	}
	
	Member member1 = new Member(id, password, name);
		for (int i = 0 ; i<members.length; i++) {
			if (members[i] == null) {
				members[i] = member1;
				break;
			}
		}
	}
	
	void printAllMembers() {
		for (Member member1 : members) {
			if (member1 == null)
				break;
			System.out.println(member1);
		}
	}
	
	Member findById(String id) {
		for(Member member1 : members) {
			if(member1 == null)
				break;
			System.out.println(member1);
			if (id.equals(member1.getId()))
				return member1;
		}
		
		return null;
	}
	
	boolean login(String id, String password) {
		Member member = findById(id);
		if (member == null)
			return false;
		else {
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 환영합니다");
				return true;
			} else 
				return false;
		}		
	}
	
	 void logout(String id) {
		Member member = findById(id);
		System.out.println(member.getName() + "님 로그아웃 되셨습니다");
	}
}
