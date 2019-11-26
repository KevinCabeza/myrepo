package ExamenKevinCabeza;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe una numero: ");
		int num = entrada.nextInt();
		
		int numS = (int) (Math.random() * 100 + 1);
		System.out.println(numS);
		
		if (num == numS) {
			System.out.println("ACERTASTE");
		}else if ( num < numS) {
			System.out.println("el numero es mas grande");
			System.out.println("escribe una numero: ");
			int num1 = entrada.nextInt();
			
		}else 
			System.out.println("el numero es mas pequeño");
		
	//esta mal

	}

}
