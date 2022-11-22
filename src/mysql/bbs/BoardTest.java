package mysql.bbs;

public class BoardTest {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
//		dao.insertBoard(new Board("안녕하세요", "반갑습니다", "admin" ));
//		dao.updateBoard(new Board("반갑습니다", "안녕하세요", "admin"));
		
		dao.incrementViewCount(0);
		int count = dao.getCount();
		System.out.println(count);
	}

}
