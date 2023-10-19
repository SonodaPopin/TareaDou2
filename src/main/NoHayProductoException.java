package main;

public class NoHayProductoException extends Exception{

	private static final long serialVersionUID = 3L;

	public NoHayProductoException(String error) {
		super(error);
	}
}
