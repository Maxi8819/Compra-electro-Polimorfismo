package Ejr3;

public abstract class Articulo {

	private String marca;
	private String modelo;

	private int precio;

	public Articulo() {

	}

	public Articulo(String marca, String modelo, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return " [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	public String detalles() {
		 return " [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	

	
}
