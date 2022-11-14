package ch08;
//인터페이스 선언
public interface Ex01_RemoteControllable {
	//상수
	public int MAX_VOLUME = 10;		//스태틱 파이날 생략되어있음
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn(); //디폴트가 아니라 abstract가 생략->인터페이스니까 public도 생략
	public void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴트 메소드 (java 1.8부터 지원) 클래스 객체의 인스턴스 메소드
	public default void setMute(boolean mute) {			//defualt가 없으면 추상메소드가 되서 생략불가
		if (mute)
			System.out.println("무음상태가 되었습니다.");
	    else 
	    	System.out.println("무음상태가 해제 되었습니다.");
	}
	
	//정적 메소드
	public static void changeBattery() {			//static이 없으면 추상메소드가 되서 생략불가
		System.out.println("건전지를 교체해야 합니다.");
	}
	
}
