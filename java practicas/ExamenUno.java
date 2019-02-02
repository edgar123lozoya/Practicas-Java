package examenUno;

import java.util.Scanner;

public class ExamenUno {

	private static Scanner leer;

	public static void main(String[] args) {
		int productos;
		String resp = null;
		leer = new Scanner(System.in);
		do{
		System.out.print("Introduzca el porcentaje de los productos defectuoso");
		productos=leer.nextInt();
		
		if (productos >= 10){
			System.out.println("Codigo rojo");
	}
		
		if (productos == 5){
			System.out.println("Codigo cafe");
	}	
		if (productos == 6){
			System.out.println("Codigo cafe");
	}	
		if (productos == 7){
			System.out.println("Codigo cafe");
	}	
		if (productos == 8){
			System.out.println("Codigo cafe");
	}	
		if (productos == 9){
			System.out.println("Codigo cafe");
	}	

		if (productos < 5){
			System.out.println("Codigo verde");
	}
		System.out.print("¿Desea calcular otra muestra? ");
        System.out.println("S / N ");
        resp= leer.next();
	}while (resp.equals("S"));
		
		System.out.print("Programa Finalizado");

	}

}
