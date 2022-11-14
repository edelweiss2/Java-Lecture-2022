package ch08.ex11_member;

public class WrongPasswordException extends RuntimeException {
	WrongPasswordException() {}

	WrongPasswordException(String message) {
		super(message);
	}
}
