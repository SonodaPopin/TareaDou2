package main;

/**
 * Clase que añade una exception cuando no alcanza el dinero para comprar un producto
 */
public class PagoInsuficienteException extends RuntimeException{

	private static final long serialVersionUID = 2L;
	/**
	 * Método constructor que añade un mensaje explicando la causa de la exception
	 * @param error - mensaje
	 */
	public PagoInsuficienteException(String error) {
		super(error);
	}
}
