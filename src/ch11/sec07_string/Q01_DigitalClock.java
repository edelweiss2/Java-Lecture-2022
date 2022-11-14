package ch11.sec07_string;

public class Q01_DigitalClock {

	public static void main(String[] args) {
		int seconds = 0;  //루프 들어가기전에 누적데이터 들어가는거 초기화 잊지말기
		for(int hour=0; hour<=23; hour++) {
			for (int minute=0; minute <=59; minute++) {
				String timeStr = hour + ":" + minute;
				if(timeStr.indexOf("3") >= 0)
					seconds += 60;
			}
		}		
		System.out.println("디지털 시계에 3이 표시되는 시간" + seconds + "초");
		
	}

}
