package herencia;

public class testVehiculo {

	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo (4, "gasolina", "blanco", "golf", "caja3");
		System.out.println();
		
		System.out.println("datos del camion");
		Camion camion = new Camion(10, "diesel", "rojo", "volvo", "tdi");
		System.out.println(camion.mostrarDatos());


	}

}
