//introduce por teclado un conjunto de notas hastq que te crea el flag-99
//visualizando en pantalla la nota media 
package estructurasdecontrol;
import java.util.Scanner;

public class MediaNota {
	
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
// variable que controlla la salida de bucle
		boolean salir = false;
		
		//contador de notas o alumnos 
		int ContadorNotas = 0;
		
		//pedimos la nota
		System.out.println("introduce la nota, teclea -99 para salir.");
		do {
			//almacenamos la nota
			float nota = entrada.nextFloat();
			 // comprobamos si ha introducido un menos 99
			if(nota == -99)
				salir = true;
			if(!salir);
		}while (!salir);
			
		
	}

}
