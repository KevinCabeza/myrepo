package estructurasdecontrol;
import java.io.IOException;


public class ControlD {
	
	public static void main (String [] args) throws IOException
	
	{
		final char EDF = (char)-1;
		System.out.println(EDF);
		System.out.println("introduce frase(ctrlD para terminar):");
		
		char car = (char) System.in.read();
		
		while(car!= EDF)
		
		{
			System.out.println(car);
			car=(char)System.in.read();
			
		}//fin mientras 
	}// fin main

} // fin class 
