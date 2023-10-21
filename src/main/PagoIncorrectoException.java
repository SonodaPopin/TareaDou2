package main;

/**
 * Clase que añade una exception cuando no hay moneda
 */
public class PagoIncorrectoException extends Exception{

	private static final long serialVersionUID = 1L;
	/**
	 * Método constructor que añade un mensaje explicando la causa de la exception
	 * @param error - mensaje
	 */
	public PagoIncorrectoException(String error) {
		super(error);
	}
}
