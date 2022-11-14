package ch15_collection;

import ch15_collection.sec06_treeSet.Person;

public class Q10_Student implements Comparable<Q10_Student> {
	public String id;
	public int score;
	
	Q10_Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	
	@Override
	
	public int compareTo(Q10_Student o) {
		if(score < o.score) 
			return -1;
		else if (score == o.score) 
			return 0;
		else return 1;
		
	}
	
	
	
	
}
