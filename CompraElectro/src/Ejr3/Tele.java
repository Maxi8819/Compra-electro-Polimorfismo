package Ejr3;

public class Tele extends Articulo {
	private int pulgada;
	private String smart;

	public Tele() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tele(String marca, String modelo, int precio, String smart, int pulgada) {
		super(marca, modelo, precio);
		this.smart = smart;
		this.pulgada = pulgada;
	}

	@Override
	public String detalles() {
		return "Tv" +  super.detalles();
	}

	@Override
	public String toString() {
		return detalles()+"[pulgada=" + pulgada + ", smart=" + smart + "]";
	}
	

}
