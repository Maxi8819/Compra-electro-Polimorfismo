package Ejr3;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	Scanner leer = new Scanner(System.in);

	private ArrayList<Articulo> articulos;
	private ArrayList<Articulo> carrito;

	public Empresa() {
		this.articulos = new ArrayList<Articulo>();
		this.carrito = new ArrayList<Articulo>();
	}

	public void agregararticulos(Articulo t) {
		articulos.add(t);

	}

	public void compar() {
		int art;
		Articulo a;
		int total = 0;

		art = seleccionCompraArt();
		while (art != 0) {
			a = articulos.get(art - 1);
			carrito.add(a);
			total += a.getPrecio();
			art = seleccionCompraArt();
		}
		for (Articulo artCompr : carrito) {
			System.out.println(artCompr.toString());
			System.out.println();
		}

		System.out.println("El valor total de su facura es: "+total);
	}

	private int seleccionCompraArt() {

		int eleccion;
		do {
			System.out.println("Menu de Opciones");
			System.out.println();
			mostrarArticulos();
			System.out.println("ingrese 0 para finalizar");
			eleccion = Integer.parseInt(leer.nextLine());
		} while (!(eleccion >= 0) && eleccion <= 4);

		return eleccion;

	}

	private void mostrarArticulos() {
		int cont = 1;
		for (Articulo a : articulos) {
			System.out.println(cont + "- " + a.detalles());
			System.out.println();
			cont++;
		}
	}

}
