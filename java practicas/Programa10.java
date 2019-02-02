package programas;

import java.util.Scanner;

public class Programa10 {
	
	public static void main(String[] args) {
		
		float p1, p2, p3 ;
		double suma, total;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Ingrese precio de producto 1: ");
		p1 = leer.nextFloat();
		System.out.println("Ingrese precio de producto 2: ");
		p2 = leer.nextFloat();
		System.out.println("Ingrese precio de producto 3: ");
		p3 = leer.nextFloat();
		suma=p1+p2+p3;
		
		if (suma>=1500)
		{
			total=suma*1.11;
			
		}
		else 
		{
			total=suma*1.10;
			
		}
			
		
		System.out.println("El incremento del total es: : "+total);
		
	}

}
