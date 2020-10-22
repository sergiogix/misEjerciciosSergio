package es.fempa.dam.programacion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		int acumulador = 1;
		System.out.println("Introduce un numero para hacer factorial");
		numero = scan.nextInt();
		for (int i = 1; i <=numero; i++) {
			
			acumulador = i * acumulador;
		}
		
		System.out.println(" " + acumulador );
	}

}
