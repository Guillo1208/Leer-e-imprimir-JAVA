package Punto_Cinco;

import java.util.Scanner;

public class PuntoCinco {
	
	public static String nombre_mascota;
	public static String tipo;
	public static int edad;
	public static String nombre_completo;
	
	public void capturar() {
		Scanner infuno = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la mascota");
		nombre_mascota=infuno.nextLine();
		
		Scanner infdos = new Scanner(System.in);
		System.out.println("Ingrese el tipo de mascota");
		tipo=infdos.nextLine();
		
		Scanner inftres = new Scanner(System.in);
		System.out.println("Ingrese la edad en a�os de la mascota");
		edad=inftres.nextInt();
		
		Scanner infcuatro = new Scanner(System.in);
		System.out.println("Ingrese el nombre completo del due�o");
		nombre_completo=infcuatro.nextLine();
		
		System.out.println(nombre_mascota + " Es un(a) "+ tipo + " El cual tiene " + edad + " a�os de edad  y " + nombre_completo+" Es actualmente su due�o(a) ");
		
	}

}
