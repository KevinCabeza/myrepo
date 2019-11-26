package herencia;

public class Camion extends Vehiculo{
	//atributos
	private int limiteCarga;


	public Camion(int numRuedas, String combustible, String marca, String color, String motor) {
		
		super(numRuedas, combustible, marca, color, motor);
		this.limiteCarga = limiteCarga;
	}
	////////////////////////////////////////
	public int getlimiteCarga() {
		return limiteCarga;
	}
	/////////////////////////////////

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}


}
