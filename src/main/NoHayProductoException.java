package main;

/**
 * Clase que añade una exception cuando no hay productos
 */
public class NoHayProductoException extends RuntimeException{

	private static final long serialVersionUID = 3L;

	/**
	 * Método constructor que añade un mensaje explicando la causa de la exception
	 * @param error - mensaje
	 */
	public NoHayProductoException(String error) {
		super(error);
	}
}
