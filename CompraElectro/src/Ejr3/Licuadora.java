package Ejr3;

public class Licuadora extends Articulo {

	private int watts;
	private int velocidad;

	public Licuadora(String marca, String modelo, int precio, int watts, int velocidad) {
		super(marca, modelo, precio);
		this.velocidad = velocidad;
		this.watts = watts;
	}

	@Override
	public String detalles() {
		return "Licuadora" +  super.detalles();
	}

	@Override
	public String toString() {
		return detalles()+"[watts=" + watts + ", velocidad=" + velocidad + "]";
	}

	
}
