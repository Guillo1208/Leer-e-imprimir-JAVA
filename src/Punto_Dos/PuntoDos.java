package Punto_Dos;

import java.util.Scanner;

public class PuntoDos {
	
	public static String nombre;
	public static String apellido;
	public static int edad;
	public static float estatura;

	public void capturar() {
	
	Scanner infuno = new Scanner(System.in);
	System.out.println("Ingrese su Nombre");
	nombre=infuno.nextLine();
	
	Scanner infdos = new Scanner(System.in);
	System.out.println("Ingrese su apellidos");
	apellido=infdos.nextLine();
	
	Scanner inftres = new Scanner(System.in);
	System.out.println("Ingrese su edad");
	edad=inftres.nextInt();
	
	Scanner infcuatro = new Scanner(System.in);
	System.out.println("Ingrese su Estatura");
	estatura=inftres.nextFloat();
	}
}
