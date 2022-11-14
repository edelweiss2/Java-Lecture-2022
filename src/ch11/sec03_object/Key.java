package ch11.sec03_object;

public class Key {
	public int number;

	Key(int number) {
		super();
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return number;				// Objects.hashCode(number); <<나중엔 이걸써서 비교
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (number == compareKey.number) 
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Key [number=" + number + "]";
	}
	
}
