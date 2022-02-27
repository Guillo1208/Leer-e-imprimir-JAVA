package com.canterauno;

import java.util.Scanner;

import Punto_Cinco.PuntoCinco;
import Punto_Cuatro.PuntoCuatro;
import Punto_Dos.PuntoDos;
import Punto_Tres.PuntoTres;
import Punto_Uno.PuntoUno;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sn6 = new Scanner(System.in);
		boolean salir6=false;
		int opc6;
		
		do {
			System.out.println("===========================================");
			System.out.println("BIENVENIDO AL TALLER DE CAPTURAR E IMPRIMIR");
			System.out.println("===========================================");
			System.out.println("1. CAPTURA NOMBRE-APELLIDO");
			System.out.println("2. CAPTURARA NOMBRE-APELLIDO-EDAD-ESTATURA");
			System.out.println("3. CAPTURAR Y MOSTRAR DATOS");
			System.out.println("4. CAPTURAR CAPITAL-PAIS");
			System.out.println("5. INFORMACION MASCOTA");
			System.out.println("6. SALIR");
			opc6=sn6.nextInt();
			
			switch (opc6) {
			case 1:
				PuntoUno uno =new PuntoUno();
				uno.captura();
				break;
				
			case 2:
				PuntoDos dos = new PuntoDos();
				dos.capturar();
				break;
				
			case 3:
				PuntoTres tres = new PuntoTres();
				tres.capturar();
				break;
				
			case 4:
				PuntoCuatro cuatro = new PuntoCuatro();
				cuatro.capturar();
				break;
				
			case 5:
				PuntoCinco cinco = new PuntoCinco();
				cinco.capturar();
				break;
				
			case 6:
				System.out.println("SALIDA EXITOSA");
				salir6=true;
				break;
				
			default:
				System.out.println("SOLO SE PERMITEN NUMEROS ENTRE 1 - 6");
			}
			
		} while (!salir6);
		
	}
	
	
}
