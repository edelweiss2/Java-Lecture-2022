package ch08.ex11_member;

public class NotExistIDException extends RuntimeException {
	NotExistIDException() {}

	NotExistIDException(String message) {
		super(message);
	}	

}
