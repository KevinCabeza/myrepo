/* este programa visualiza el maximo comun divisor de 2 numeros
 * 
 */
package estructurasdecontrol;

import java.util.Scanner;

public class mcd {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		//introducimos por teclado dos numeros 
		System.out.println("introduce el numero 1: ");
		int num1 = entrada.nextInt();
		System.out.println("introduce el numero 2: ");
		int num2 = entrada.nextInt();
		//comparamos num1 con num2 
		while(num1 != num2)
		{
			if (num1 > num2)
				num1 = num1 - num2;
				else
					num2 = num2 - num1; 		
		}
		System.out.println("maximo comun divisor " + num1);
			
		

	}

}
