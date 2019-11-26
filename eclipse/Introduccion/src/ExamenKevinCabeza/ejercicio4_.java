package ExamenKevinCabeza;

import java.util.Scanner;

public class ejercicio4_ {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero para A, B, C: ");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		double d = (b * b -4 * a * c);
		double e;
		double f;
		
		if ( a == 0 && b == 0) {
			System.out.println("error, no es una euacion");
		} else if  (a == 0 && b !=0) {
			System.out.println("error esto es una ecuacion de primer grado");
			f = (-c/b);
			System.out.println("con solucion: " + f);
		}else if (d < 0) {
			System.out.println("no se pueden hacer raices de numeros negativos");
		}else {
			e = (-b + Math.sqrt(d) / 2*a);
			System.out.println("la primera solucion es: " + e);
			f = (-b - Math.sqrt(d) / 2*a);
			System.out.println("la segunda solucion es :" + f);
		}

		
	}
}



