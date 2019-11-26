package herencia;
/**
 * figura plana es una clase abstracta 
 * una clase anstracta es la que tiene por lo menos una cosa abstracta, un metodo
 * abstracto es una herramienta que tiene java para implementar el polimorfismo
 * no se pueden crear objetos en una clase abstracta
 * @author alumno
 *
 */

public abstract class figuraPlana {

	//atributos
	 private double base;
	 private double altura;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String mostrarDatos() {
		return "\n"+ base + "\n" + altura;
	}
	// metodo abstracto
	public abstract double area();
	
	

}
