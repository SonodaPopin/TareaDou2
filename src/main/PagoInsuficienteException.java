package main;

public class PagoInsuficienteException extends RuntimeException{

	private static final long serialVersionUID = 2L;

	public PagoInsuficienteException(String error) {
		super(error);
	}
}
