package es.fempa.dam.programacion;
//SERGIO LORENTE MAZON
//https://github.com/sergiogix/misEjerciciosSergio
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int num1 = 0;
			int num2 = 1;
			int fibonacci;
			System.out.println(num1);
			System.out.println(num2);
			for (int i = 0; i < 10; i++) {
				fibonacci = num1 + num2;
				num1 = num2;
				num2 = fibonacci;
				System.out.println(fibonacci);
			}
			
			
		}
	}


