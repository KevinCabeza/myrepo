package estructurasdecontrol;

import java.util.Scanner ;

public class DivisionDecimal {

 
	/*Este programa sirve para dividir dos numeros decimales entre si y en el caso de que el resultado sea 0 tiene que saltar un mensaje de error*/
	
	  public static void main(String arg[]) {
	  
	  Scanner entrada = new Scanner (System.in);
	  
	// escribimos dos numeros decimales , escritos con una coma(,)
	  
	    System.out.println("Escribe un numero decimal,DIVIDENDO:");
	    float num1 = entrada.nextFloat();
	    System.out.println("Escribe un numero decial,DIVISOR:");
	    float  num2 = entrada.nextFloat();
	    

	      if (num2 == 0 ) {
	         System.out.println("ERROR, el divisor no puede ser 0 ");
         
	      }  
	        else {
	   
	          float solucion =  num1 / num2 ;
	          System.out.println("el resultado es:" + solucion); 
	 }
	  }
} 
	      
	      
	          
	    	  
	    		

