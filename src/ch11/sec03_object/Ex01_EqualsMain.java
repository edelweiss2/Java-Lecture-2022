package ch11.sec03_object;

public class Ex01_EqualsMain {

	public static void main(String[] args) {
		Member member1 = new Member("hong", "홍길동");
		Member member2 = new Member("hong", "홍자바");
		Member member3 = new Member("hong", "홍길동");
		
		//member에서 equals method를 재정의 하기 이전
		System.out.println(member1.equals(member3)); // false가 나옴. Member에서 오버라이딩 후 true
		System.out.println(member1 == member3);  // 참조하는 주소가 같으냐 를 비교. false	
		
	}

}
