package main;

public class PagoIncorrectoException extends Exception{

	private static final long serialVersionUID = 1L;

	public PagoIncorrectoException(String error) {
		super(error);
	}
}
