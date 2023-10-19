package main;

public enum Inventario {
	COCACOLA(0),
	SPRITE(0),
	FANTA(0),
	SUPER8(0),
	SNICKER(0);
	int precio;
	Inventario (int precio){
		this.precio = precio;
	}
	public static int getPrecio(int a) {
		return Inventario.values()[a].precio;
	}
}
