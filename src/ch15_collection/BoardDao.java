package ch15_collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Q07_Board> getBoardList() {
		List<Q07_Board> list = new ArrayList<>();
		list.add(new Q07_Board("제목 1", "내용1"));
		list.add(new Q07_Board("제목 2", "내용2"));
		list.add(new Q07_Board("제목 3", "내용3"));
		return list;
	} 
}

