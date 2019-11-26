/* introducimos por teclado la base y exponente y 
 * conseguimos la potencia 
 */
package estructurasdecontrol;

import java.util.Scanner;
public class baseExponente {
	
	public static void main(String [] args) {
		
		// introducimos la base y el exponente 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introducimos la base:");
		int base = entrada.nextInt();
		System.out.println("introducimos el exponente: ");
		int exponente = entrada.nextInt();
		
		//calculamos la potencia
		int resultado = 1;
		for (int i=1; i<= exponente ; i++)
			resultado = resultado * base ;
		 //enviamos a pantalla el resultado 
		System.out.println("el resultado es :" + resultado);
	     
		
		
	}
	

}
