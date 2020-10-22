package es.fempa.dam.programacion;
//SERGIO LORENTE MAZON
import java.util.Scanner;

public class Menu {	
	
	
	public static void main(String[] args) {
		
		boolean continuar = true;
		int opcion;
		Scanner scan = new Scanner(System.in);
		Submenu submenu = new Submenu();
		
	do {
		System.out.println(" ");
		System.out.println("Elige una opcion");
		System.out.println("1. Abrir programa");
		System.out.println("2. Cerrar programa");
		System.out.println("3. Guardar");
		System.out.println("4. Abrir submenu");
		System.out.println("5. Salir");	
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
			System.out.println("Abriendo submenu...");
			// preguntar duda
			submenu.mostrarSubmenu();
			break;
			
		case 5:
			System.out.println(" ");
			System.out.println("Saliendo del juego...");
			continuar=false;
			break;
		
			
		default:
			System.out.println("ERROR");
		
		}
		
	}while(continuar);
	
		scan.close();
	}

}
