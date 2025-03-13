package persona;

public class invalidadEdadException extends Exception {

	private static final String DAFAULT_MASSEGE = "la edad introducidad es unda edad invalida";
	
	public invalidadEdadException() {
		super(DAFAULT_MASSEGE);
		}

	public invalidadEdadException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public invalidadEdadException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public invalidadEdadException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public invalidadEdadException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
