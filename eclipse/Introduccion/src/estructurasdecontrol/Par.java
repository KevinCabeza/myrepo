package estructurasdecontrol;

import java.util.Scanner;

public class Par {
	
	public static void main(String[] args) {
	
	// intruduzco por teclado el numero 
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("intrudice un numero entero:");
	int num1 = entrada.nextInt();
	
	//comprobamos si es par 
	
	if (num1 % 2 == 0)
	  System.out.println(num1 + " Es par");
	else 
		System.out.println(num1 + "es impar");
	
	
	}
	
}
