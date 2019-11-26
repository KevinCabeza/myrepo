package ExamenKevinCabeza;
import java.io.IOException;

public class ejercicio3 {

	public static void main(String[] args) throws IOException
	{
	
		int altura = 3;
		char car = 'p';
		
		for(int linea = 1; linea <= altura; linea++) {
			
			for (int contador = 1; contador <= linea; contador++) {
			
			System.out.print(car);	
		}
		 System.out.println();
		
		}
		for(int linea = 2; linea <= altura; linea++) {
		
			for (int contador = 3; contador >= linea; contador--) {
				System.out.print(car);
			}
			 System.out.println();
		}
	}

}
