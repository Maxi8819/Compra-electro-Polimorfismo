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
		art = seleccionCompraArt();
		while (art!=0) {
			
		}
		
	}
	
	private int seleccionCompraArt() {
		
		int eleccion;
			System.out.println("Menu de Opciones");
			System.out.println();
			mostrarArticulos();
			System.out.println("ingrese 0 para finalizar");
			eleccion= Integer.parseInt(leer.nextLine());
			return eleccion;
		
	}
		

	private void mostrarArticulos() {
		int cont = 1;
		for (Articulo a : articulos) {
			System.out.println(cont + "- " + a.toString());
			System.out.println();
			cont++;
		}
	}

}
