package interfaz;

public class Circulo implements Geometria {

	private double radio;
	public Circulo(double radio) {
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
//////////////////////////////////////////////////////////7
	public void setRadio(double radio) {
		this.radio = radio;
	}
	////////////////////////////////////////////////////////////////
	public double area(){
		return Math.PI* Math.pow(radio, 2);	}
}
