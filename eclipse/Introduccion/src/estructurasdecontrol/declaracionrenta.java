
package estructurasdecontrol;

import java.util.Scanner;

public class declaracionrenta {

	public static void main(String[] args)
	{
		
		Scanner entrada = new Scanner(System.in);
//introducimos por teclado la renta anual
		System.out.println("introducimos la renta anual:");
		int renta = entrada.nextInt();
		int tipoImpositivo = 0;  
		if (renta <= 0)
			System.out.println("la renta tiene que ser mayor que 0");
		
		else if(renta <= 10000) {
			tipoImpositivo = 5;
		}
		else if (renta  <= 20000) {
			tipoImpositivo = 15;
		}	
		else if (renta  <= 35000) {
			tipoImpositivo = 20;
			
	    }
		else if (renta  <= 60000) {
			tipoImpositivo = 30;
        }
		else 
			tipoImpositivo = 45;
		
		System.out.println("el tipo impositivo es " + tipoImpositivo + "%");
		}	
	}
	
	
