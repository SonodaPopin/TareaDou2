package main;

public class PagoInsuficienteException extends Exception{

	private static final long serialVersionUID = 2L;

	public PagoInsuficienteException(String error) {
		super(error);
	}
}
