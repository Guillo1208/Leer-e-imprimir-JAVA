package Punto_Tres;

import java.util.Scanner;

public class PuntoTres {
	
	public static String nombre;
	public static String apellido;
	public static String nombre_mama;
	public static String apellido_mama;
	public static String nombre_papa;
	public static String apellido_papa;
	
	public void capturar() {
		Scanner infuno = new Scanner(System.in);
		System.out.println("Ingrese su Nombre");
		nombre=infuno.nextLine();
		
		Scanner infdos = new Scanner(System.in);
		System.out.println("Ingrese su apellidos");
		apellido=infdos.nextLine();
		
		Scanner inftres = new Scanner(System.in);
		System.out.println("Ingrese el Nombre de tu mam�");
		nombre_mama=inftres.nextLine();
		
		Scanner infcuatro = new Scanner(System.in);
		System.out.println("Ingrese el apellido de tu mam�");
		apellido_mama=infcuatro.nextLine();
		
		Scanner infcinco = new Scanner(System.in);
		System.out.println("Ingrese el Nombre de tu pap�");
		nombre_papa=infcinco.nextLine();
		
		Scanner infseis = new Scanner(System.in);
		System.out.println("Ingrese el apellido de tu pap�");
		apellido_papa=infseis.nextLine();
		
		System.out.print("Yo "+ nombre +" "+ apellido + " Soy Hijo de " + nombre_mama +" "+ apellido_mama +" y " + nombre_papa +" "+ apellido_papa);
		System.out.println(" ");
	}

}
