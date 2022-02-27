package Punto_Uno;

import java.util.Scanner;

public class PuntoUno {
	
	private String nombre;
	private String apellido;
	Scanner sn = new Scanner(System.in);
	
	public void captura() {
		
		System.out.print("Digite su nombre ");
		nombre = sn.next();
		
		
		System.out.print("Digite su apellido ");
		apellido = sn.next();
		
	}
}
