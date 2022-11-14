package ch15_collection;

import java.util.List;

import ch15_collection.sec01_arrayList.Board;

public class Q07_List {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Q07_Board> list = dao.getBoardList();
		for(Q07_Board board : list) 
			System.out.println(board.getTitle() + "-" + board.getContent());
	}

}
