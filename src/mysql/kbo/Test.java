package mysql.kbo;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		DAO dao = new DAO();		
		
//		dao.insertPlayer(new Player(47, "강민호", "포수", LocalDate.parse("1985-08-18"),185,0));
		dao.insertPlayer(new Player(6, "강한울", "내야수",	LocalDate.parse("1991-09-12"), 181,0));
		dao.insertPlayer(new Player(5, "구자욱", "외야수",	LocalDate.parse("1993-02-12"), 189,0));
		dao.insertPlayer(new Player(27, "김동엽", "외야수",	LocalDate.parse("1990-07-24"), 186,0));
		dao.insertPlayer(new Player(12, "김민수", "포수",	LocalDate.parse("1991-03-02"), 177,0));
		dao.insertPlayer(new Player(42, "김태군", "포수",	LocalDate.parse("1989-12-30"), 182,0));
		dao.insertPlayer(new Player(4, "뷰캐넌", "투수",	LocalDate.parse("1989-05-11"), 190,0));
		dao.insertPlayer(new Player(57, "수아레즈", "투수",	LocalDate.parse("1989-10-08"), 190,0));
		dao.insertPlayer(new Player(21, "오승환", "투수",	LocalDate.parse("1982-07-15"), 178,0));
		dao.insertPlayer(new Player(44, "오재일", "내야수",	LocalDate.parse("1986-10-29"), 187,0));
		dao.insertPlayer(new Player(18, "원태인", "투수",	LocalDate.parse("2000-04-06"), 183,0));
		dao.insertPlayer(new Player(63, "피렐라", "외야수",	LocalDate.parse("1989-11-21"), 183,0));
		
	}

}
