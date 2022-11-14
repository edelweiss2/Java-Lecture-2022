package ch08.ex11_member;

public interface MemberService  {
	void register(String id, String password, String name);
	void printAllMembers();
	Member findById(String id) throws WrongPasswordException;
	boolean login(String id, String password) throws WrongPasswordException;
	void logout(String id);
}