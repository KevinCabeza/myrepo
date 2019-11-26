package estructurasdecontrol;

import java.io.IOException;

public class conversornotas {

	public static void main(String[] args) throws IOException 
	{
		//introducimos por teclado la nota 
		System.out.println("introduce la nota alfabetica :");
		char notaAlfab = (char) System.in.read();
		//declaramos una nota numerica 
		int notaNumerica = 0;
		//VARIABLE BOOLEANA PARA COMPROBAR SI LA NOTA ES CORRECTA 
		boolean notaCorrecta = true;
		//convertimos la nota numerica a alfabetica 
		switch(notaAlfab)
		{
		 case 'I':
			 notaNumerica = 4;
		   break;
		 case 'F':
			 notaNumerica = 5;
		   break;
		 case 'B':
			 notaNumerica = 6;
		   break;
		 case 'N':
			 notaNumerica = 7;
		   break;
		 case 'S':
			 notaNumerica = 9;
		   break;
		   default:
			   System.out.println("la nota introducida no es corecta");
			   notaCorrecta = false;
		    break;
			   
		   
		}
		//comprobamos si la nota es correcta 
		if(notaCorrecta) 
		{
		// enviamos a pantalla 
		System.out.println("la nota numerica es :" + notaNumerica);
 			 
			 
		}
		
	}
		
	

}
