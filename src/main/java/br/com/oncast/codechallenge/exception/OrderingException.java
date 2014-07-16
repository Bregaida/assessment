/**
 * 
 */
package br.com.oncast.codechallenge.exception;

/**
 * @author eduardobregaida
 * 
 */
public class OrderingException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public OrderingException() {
    }

    public OrderingException(String message) {
	super(message);
    }

    public OrderingException(String message, Throwable cause) {
	super(message, cause);
    }

    public OrderingException(Throwable cause) {
	super(cause);
    }

    public OrderingException(String message, Throwable cause,
	    boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}
