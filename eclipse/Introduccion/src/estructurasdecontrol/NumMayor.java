package estructurasdecontrol;

import java.util.Scanner;

public class NumMayor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = entrada.nextInt();
		System.out.println("introduce otro numero: ");
		int num2 = entrada.nextInt();
		if(num1<num2) {
			System.out.println("numero 1 es menor");
		}else {
			System.out.println("el numero 2 es mayor" + num2);
		}
		
		
	}

}
