package Ejr3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa e = new Empresa();
		Articulo t = new Tele("LG","Super 8K",255054,"Smart", 75);
		Articulo l =new Lavarropa("Whirpool", "Master Lavado", 78457,  100,"Automatico");
		Articulo h = new Heladera ("Samsung", "Frost7857", 877957, 30, "No Frost");
		Articulo lq = new Licuadora ("Liliana", "DemolerFast", 8955,  220, 10);
		
		e.agregararticulos(t);
		e.agregararticulos(l);
		e.agregararticulos(h);
		e.agregararticulos(lq);
		
		//e.mostrarArticulos();
		
	}

}
