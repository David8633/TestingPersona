package persona;

public class alturaIntroducidaException extends Exception {

	private static final String DEFAULT_MESSAGE = "La altura que has introducido es erronea";
	
	public alturaIntroducidaException() {
		super(DEFAULT_MESSAGE);
	}

	public alturaIntroducidaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public alturaIntroducidaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public alturaIntroducidaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public alturaIntroducidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
