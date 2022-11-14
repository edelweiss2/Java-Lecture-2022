package ch14_lambda;

public class Q08_Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	Q08_Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	
}
