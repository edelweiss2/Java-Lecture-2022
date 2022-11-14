package ch10.ex11_userDefineException;

public class BalaceInsufficientException extends RuntimeException {

	BalaceInsufficientException() {}

	BalaceInsufficientException(String message) {
		super(message);		
	}
		
}
