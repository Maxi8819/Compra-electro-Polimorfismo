package Ejr3;

public class Heladera extends Articulo {

	private int capacidad;
	private String frost;

	public Heladera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Heladera(String marca, String modelo, int precio, int capacidad, String frost) {
		super(marca, modelo, precio);
		this.capacidad = capacidad;
		this.frost = frost;
	}

	@Override
	public String toString() {
		return "Heladera" + super.toString();
	}

	
	
	

}
