package Ejr3;

public class Lavarropa extends Articulo {

	private int carga;
	private String automatico;

	public Lavarropa(String marca, String modelo, int precio, int carga, String automatico) {
		super(marca, modelo, precio);
		this.automatico = automatico;
		this.carga = carga;
	}

	@Override
	public String detalles()  {
		return "Lavarropa" +  super.detalles();
	}

	@Override
	public String toString() {
		return detalles()+ "[carga=" + carga + ", automatico=" + automatico + "]";
	}

		
}
