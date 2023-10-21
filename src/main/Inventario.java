package main;

/**
 * Enum que guarda los productos disponibles y sus respectivos precios.
 */
public enum Inventario {
	COCACOLA(500),
	SPRITE(300),
	FANTA(400),
	SUPER8(700),
	SNICKER(1000);
	int precio;
	/**
	 * Método para asignar los precios de los productos
	 * @param precio - precio
	 */
	Inventario (int precio){
		this.precio = precio;
	}
	/**
	 * Método para obtener el precio de un producto
	 * @param a - producto cuyo precio se quiere obtener
	 * @return - precio del producto
	 */
	public static int getPrecio(int a) {
		return Inventario.values()[a].precio;
	}
}
