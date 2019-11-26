package herencia;

public class Rectangulo extends figuraPlana {

	public Rectangulo (double area, double altura)
	{
		super (area,altura);
	}
	
	public double area() {
		return base * altura;
		
	} 
	

}
