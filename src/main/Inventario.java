package main;

public enum Inventario {
	COCACOLA(500),
	SPRITE(300),
	FANTA(400),
	SUPER8(700),
	SNICKER(1000);
	int precio;
	Inventario (int precio){
		this.precio = precio;
	}
	public static int getPrecio(int a) {
		return Inventario.values()[a].precio;
	}
}
