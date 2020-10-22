package es.fempa.dam.programacion;

//SERGIO LORENTE MAZON
import java.util.Scanner;

public class Submenu {
	
	public void  mostrarSubmenu(){
	
		
		boolean continuar = true;
		int opcion;
		Scanner scan = new Scanner(System.in);
		
		
	do {
		System.out.println(" ");
		System.out.println("1. Submenu abrir");
		System.out.println("2. Submenu cerrar");
		System.out.println("3. Submenu guardar");
		System.out.println("4. Submenu salir");	
		System.out.println(" ");
		opcion = scan.nextInt();
		
		
		
		switch (opcion) {
			
		case 1:
			System.out.println(" ");
			System.out.println("Iniciando sesion...");
			System.out.println(" ");
			break;

		case 2:
			System.out.println(" ");
			System.out.println("Cerrando sesion...");
			System.out.println(" ");
			break;
			
		case 3:
			System.out.println(" ");
			System.out.println("Guardando... No apagues la consola");
			System.out.println(" ");
			break;
			
		case 4:
			System.out.println(" ");
			System.out.println("Saliendo del juego...");
			continuar=false;
			break;
			
		default:
			System.out.println("ERROR");
		
		}
		
	}while(continuar);
	
		
	}

	
}
