package Punto_Cuatro;

import java.util.Scanner;

public class PuntoCuatro {
	
	public static String ciudad_capital;
	public static String pais;

	public void capturar() {
		Scanner infuno = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la ciudad capital");
		ciudad_capital=infuno.next();
		
		Scanner infdos = new Scanner(System.in);
		System.out.println("Ingrese el nombre del Pais");
		pais=infdos.next();

		System.out.println("La ciudad "+ ciudad_capital +" Es la capital de " + pais);
	}
}
