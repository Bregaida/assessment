package br.com.oncast.codechallenge.exception;

/**
 * eduardo.bregaida
 */
public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EntityNotFoundException() {
    }

    public EntityNotFoundException(String message) {
	super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
	super(message, cause);
    }

    public EntityNotFoundException(Throwable cause) {
	super(cause);
    }

    public EntityNotFoundException(String message, Throwable cause,
	    boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}
