package main;

public class NoHayProductoException extends RuntimeException{

	private static final long serialVersionUID = 3L;

	public NoHayProductoException(String error) {
		super(error);
	}
}
