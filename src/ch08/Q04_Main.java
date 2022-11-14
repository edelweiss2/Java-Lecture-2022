package ch08;

public class Q04_Main {

	public static void main(String[] args) {
		dbWork(new Q04_OracleDao());   //오라클다오의 객체를 만들어준 다음에 다형성
		dbWork(new Q04_MySqlDao());
	}
	
	private static void dbWork(Q04_DataAccessObject dao) {  //메소드만들고, 구현클래스에서 만들어놓은
		dao.select();										//추상 메소드들을 불러옴
		dao.insert();
		dao.update();
		dao.delete();
	}
}
