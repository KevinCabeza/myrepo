package Estructuracontrol;

import java.util.Scanner;

public class NumeroMenor {
	 
	 public static void main(String arg[])
	 {
	 

		 Scanner entrada = new Scanner (System.in);
		 //escrbimos dos numeros y el programa nos mostrara el menor 
		 
		 System.out.println("escribe un numero1:");
		 int num1 = entrada.nextInt();
		 System.out.println("escribe un numero2:");
		 int num2 = entrada.nextInt();
		 
		 if(num1 < num2)
		    System.out.println("el numero menor es: " + num1);
		    
		 else if (num2<num1)
			System.out.println("el numero menor es:  " + num2);
			
			else 
				System.out.println("los numeros son iguales");
	 }	 
		
} 
