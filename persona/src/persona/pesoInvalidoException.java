package persona;

public class pesoInvalidoException extends Exception {

	private static final String DEFAULT_MESSAGE = "el  peso introducido no es valido";
	
	public pesoInvalidoException() {
		super(DEFAULT_MESSAGE);
	}

	public pesoInvalidoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public pesoInvalidoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public pesoInvalidoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public pesoInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
