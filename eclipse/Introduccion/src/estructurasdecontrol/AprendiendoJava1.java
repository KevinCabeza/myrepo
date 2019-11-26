// EJER DE PEDIR NOMBRE Y MOSTRARLO
/*    

package estructurasdecontrol; 
import java.util.Scanner;

public class AprendiendoJava1 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = entrada.nextInt();
		System.out.println(numero);
		
		
	}

}

*/
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
//CALCULA TU EDAD EL PROXIMO AÑO 
/*
package estructurasdecontrol; 
import java.util.Scanner;

public class AprendiendoJava1 {
	public static void main(String [] args) {
	
public class AprendiendoJava1{
	Scanner entrada = new Scanner(System.in);
	System.out.println("escribe tu edad: ");
	int edad = entrada.nextInt();
	int edad = edad + 1;
	System.out.println("su edad el prox año sera: " + edad);


	}
	
}
*/

///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
// CALCULA TU EDAD EN BASE AL NACIMIENTO Y AÑO ACTUAL
/*
package estructurasdecontrol; 
import java.util.Scanner;
public class AprendiendoJava1 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escriba el año actual: ");
		int añoActual = entrada.nextInt();
		System.out.println("escriba su año de nacimiento: ");
		int añoNacimiento = entrada.nextInt();
		int edad;
		
		edad = añoActual - añoNacimiento;
		System.out.println("su edad es: " + edad + "años");
		
	}
}
*/

/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
// COMPRUEBA EL RANGO DE VALORES DE LA VARIABLE TIPO SHORT
/*
package estructurasdecontrol; 

public class AprendiendoJava1 {
	public static void main(String args[]) {
		short num;
		num = 32767;
		System.out.println("valor maximo para el tipo short:" + num);
		num++;
		System.out.println("valor minimo para el tipo short:" + num);
	}
}
*/

//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////
// HACE LA MEDIA DE DOS NOTAS
/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("primera nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("segunda nota: ");
		double nota2 = entrada.nextDouble();
		double media ;
		 media = (nota1 + nota2) / 2.0;
		 System.out.println("la nota media es: " + media);
		
	}
}
*/

/////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////
//CALCULAMOS LA MEDIA ENTERA DE 3 NOTAS
/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("primera nota: ");
		int nota1 = entrada.nextInt();
		System.out.println("segunda nota: ");
		int nota2 = entrada.nextInt();
		System.out.println("tercera nota: ");
		int nota3 = entrada.nextInt();
		int media ;
		 media = (int) ((nota1 + nota2 + nota3) / 2.0);
		 System.out.println("la nota media es: " + media);
	}
}
*/

/////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////
//MUESTRA EN PANTALLA EL NUMERO DECIMAL ESCRITO REDONDEADO A UN NUMERO ENTERO 
/*
package estructurasdecontrol;
import java.util.Locale;
import java.util.Scanner;

public class AprendiendoJava1 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		System.out.println("escribe un numero decimal(con punto)");
		double num = entrada.nextDouble();
		float truncado = (float) 0.5;
		int redondeo;
	
		redondeo = (int) (num + 0.5);
		System.out.println(num + " redondeado es: " + redondeo);
	}
}
*/

//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
//CALCULAR LA VENTA ANUAL DE FRUTAS CON PRECIO ESTABLECICO
/*

package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe los kilos de los 4 trimestres de manzanas: ");
		double manzana1 = entrada.nextDouble();
		double manzana2 = entrada.nextDouble();
		double manzana3 = entrada.nextDouble();
		double manzana4 = entrada.nextDouble();
		System.out.println("escribe los kilos de los 4 trimestres de peras: ");
		double pera1 = entrada.nextDouble();
		double pera2 = entrada.nextDouble();
		double pera3 = entrada.nextDouble();
		double pera4 = entrada.nextDouble();
		double finalManzana = (manzana1 + manzana2 + manzana3 + manzana4) * 2.35;
		System.out.println("se gano con las manzanas: " + finalManzana + " euros");
		double finalPera = (pera1 + pera2 + pera3 + pera4) *1.95;
		System.out.println("se gano con las peras: " + finalPera + " euros");
		double ganancias = finalManzana + finalPera;
		System.out.println("las ganacias anales son de: " + ganancias + " euros");
		
		
	}
}	
*/
		
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
// CALCULAMOS LAS GANANCIAS ANUALES, ESCRIBIENDO NOSOTROS EL PRECIO DEL KILO

/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe los kilos de los 4 trimestres de manzanas: ");
		double manzana1 = entrada.nextDouble();
		double manzana2 = entrada.nextDouble();
		double manzana3 = entrada.nextDouble();
		double manzana4 = entrada.nextDouble();
		System.out.println("con que importe se vendera el kilo: ");
		float precioP = entrada.nextFloat();
		System.out.println("escribe los kilos de los 4 trimestres de peras: ");
		double pera1 = entrada.nextDouble();
		double pera2 = entrada.nextDouble();
		double pera3 = entrada.nextDouble();
		double pera4 = entrada.nextDouble();
		System.out.println("con que importe se vendera el kilo: ");
		float precioM = entrada.nextFloat();
		double finalManzana = (manzana1 + manzana2 + manzana3 + manzana4) * precioM;
		System.out.println("se gano con las manzanas: " + finalManzana + " euros");
		double finalPera = (pera1 + pera2 + pera3 + pera4) * precioP;
		System.out.println("se gano con las peras: " + finalPera + " euros");
		double ganancias = finalManzana + finalPera;
		System.out.println("las ganacias anales son de: " + ganancias + " euros");
		
		
	}
}	
*/

/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/*   // AREA Y LONGITUD DE UNA CIRCUNFERENCIA 

package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el radio");
		int radio = entrada.nextInt();
		double longitud = (2*3.14) * radio;
		double area = 3.14 * (radio * radio);
		System.out.println("la longitud de la circunfencia es de:  " + longitud);
		System.out.println("el area de la circunfencia es de: " + area);
		
	
	}
}
*/
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
//NUMERO PAR O IMPAR

/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe un numero: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			System.out.println("el numero " + num + " es par");
		} else {
			System.out.println("el numero " + num + " es impar");
		}	
	}
}
*/

/////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
// COMPROBAR SI DOS NUMERO ENTEROS SON IGUALES

/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("escribe un numero entero: ");
	int num1 = entrada.nextInt();
	System.out.println("escribe otro numero entero: ");
	int num2 = entrada.nextInt();
	if (num1 == num2) {
		System.out.println("los numero son iguales");
	}else {
		System.out.println("no son iguales");
	}
		
	}
}
*/		

////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
// IMPRIMA EN PANTALLA EL NUMERO ESCRITO QUE SEA MAYOR, SIN SON IGUALES TAMBIEN LO DICE 
/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe un numero entero: ");
		int num1 = entrada.nextInt();
		System.out.println("escribe un numero entero: ");
		int num2 = entrada.nextInt();
		if (num1 == num2) {
			System.out.println("son iguales");
		}else {
			if (num1 < num2) {
				System.out.println("el numero mayor es: " + num2);
			}else {
				System.out.println("el numero mayor es: " + num1);
			}
		}
	}
}
*/

///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
// ESCRIBIMOS UN NUMERO DECIMAL Y COMPROBAMOS SIN ESTA CERCA DE CASI SER CERO
/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe un numero decimal: ");
		float num = entrada.nextFloat();
		if( num > -1 && num < 1 && num != 0) {
			System.out.println("es casi cero");
		}else {
			System.out.println("no es casi cero");
		}
	}
}		
*/		

/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
// ESCRIBIMOS 3 NUMEROS ENTEROS Y IMPRIMOS POR PANTALLA SU ORDEN DE MAYOR A MENOR

/*
package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe 3 numeros enteros diferentes");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + "," + num2 + "," + num3);
		}else if (num1 > num3 && num3 > num2) {
			System.out.println(num1 + "," + num3 + "," + num2);
		}else if (num2 > num3 && num3 > num1) {
			System.out.println(num2 + "," + num3 + "," + num1);
		}else if (num2 > num1 && num1 > num3) {
			System.out.println(num2 + "," + num1 + "," + num3);
		}else if ( num3 > num2 && num2 > num1) {
			System.out.println(num3 + "," + num2 + "," + num1);
		}else {
			System.out.println(num3 + "," + num1 + "," + num2);
		}
		
		
	}
}
*/

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
/*

package estructurasdecontrol;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe numeros para a, b, c");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		double d;
		double e;
		double f;
		
		
		if (a == 0 && b == 0) {
			System.out.println("ERROR ES UNA ECUACION DE PRIMER GRADO");
		}else if ( a == 0) {
			System.out.println("a no puede ser 0");
		}else {
			d = (b * b - 4 * a * c);
			e = (-b + Math.sqrt(d)) / (2*a);
			System.out.println("solucion 1: " + e);
			f = (-b - Math.sqrt(d)) / (2*a);
			System.out.println("solucion 2: " + f);
		}
	}
}


////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
//triangulo pitagorico

/*
package estructurasdecontrol;
import java.io.IOException;
import java.util.Scanner;

public class AprendiendoJava1 {
	
	public static void main(String args[]) throws IOException 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe una letra: ");
		char car = (char)System.in.read();
		System.out.println("escribe una altura: ");
		int altura = entrada.nextInt();
		
		for (int linea = 1; linea <= altura; linea++) 
		{
			for (int contacar = 1; contacar <= linea; contacar++)
			{
				System.out.print(car);
			}
			System.out.println();			
		}
		
	}
}
*/
///////////////////////////////////////////////////////////////////////////////////
//////////////////////PROGRAMACION MODULAR//////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
//////FACTORIAL
/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 
{
	public static void main(String[] args) 
	{
		int numero=pedirNumero();
		int factorial= calcularFactorial(numero);
		verResultado(numero,factorial);
		for(int i= 1; i<= 5; i++)
			System.out.println(calcularFactorial(i));
	}
	///////////////////////////////////////////////////////////////////
	public static int pedirNumero()
	{
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Dime un numero");
		return entrada.nextInt();
	}
	//////////////////////////////////////////////////////////////////////
	public static int calcularFactorial(int numero)
	{
		int factorial = 1;
		for (int i=1;i <= numero ;i++)
			factorial = factorial * i;
		return factorial;
	}
	//////////////////////////////////////////////////////////////////////////
	public static void verResultado(int numero,int factorial)
	{
		System.out.println("El factorial de " + numero + " es " + factorial);
	}
	////////////////////////////////////////////////////////////////////////
}
*/

///////////////////////////////////////////////////////////////////////////////////
///FACTORIAL RECURSIVO

/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {

	
		public static void main(String[] args) 
		{
			int numero=pedirNumero();
			int factorial= calcularFactorial(numero);
			verResultado(numero,factorial);
			
		}
		///////////////////////////////////////////////////////////////////
		public static int pedirNumero()
		{
			Scanner entrada = new Scanner(System.in);		
			System.out.println("Dime un numero");
			return entrada.nextInt();
		}
		////////////////////////////////////////////
		public static int calcularFactorial(int num)
		{
			if(num == 0)
				return 1;
			else
				return num * calcularFactorial(num - 1);
				
		}
//////////////////////////////////////////////////////////////////////////
		public static void verResultado(int numero,int factorial)
		{
		System.out.println("El factorial de " + numero + " es " + factorial);
		}
			
}
*/

///////////////////////////////////////////////////////////////////////////////
///CALCULADORA MODULAR

/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 
{
	public static void main(String[] args) 
	{
		boolean salir=false;
		do {
			int opcion=verMenu();
			if(opcion==5) 
			{
				salir=true;
				System.out.println("Fin de programa");
			}
			else
				hacerOperaciones(opcion);
		}while(!salir);
	}
	///////////////////////////////////////////////////////////////
	public static int verMenu()
	{
		Scanner entrada = new Scanner(System.in);
		int opcion;
		System.out.println("MENU DE CALCULADORA");
		System.out.println("[1]-Suma");
		System.out.println("[2]-Resta");
		System.out.println("[3]-Multiplicacion");
		System.out.println("[4]-Division");
		System.out.println("[5]-Salir");
		System.out.println("Elige una opcion:");
		do{		
			opcion = entrada.nextInt();
			if(opcion < 1 || opcion > 5)
			{
				System.out.println("Error,elige una opcion valida:");
			}
		}while (opcion < 1 || opcion > 5);
		return opcion;
	}
	//////////////////////////////////////////////////////////////
	public static void hacerOperaciones(int opcion)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime los numeros");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		while (opcion == 4 && num2 ==0) 
		{
			System.out.println("El segundo numero no puede ser 0,prueba otro");
			num2 = entrada.nextDouble();
		}
		double resultado=0;
		switch (opcion)
		{
		case 1:resultado=hacerSuma(num1,num2);
			break;                                                                                       
		case 2:resultado=hacerResta(num1,num2);
			break;
		case 3:resultado=hacerMultiplicacion(num1,num2);
			break;
		case 4:resultado=hacerDivision(num1,num2);
			break;
		}
		verResultado(resultado);
	}
	//////////////////////////////////////////////////////
	public static double hacerSuma(double num1,double num2)
	{
		return num1+num2;	
	}
	//////////////////////////////////////////////////////
	public static double hacerResta(double num1,double num2)
	{
		return num1 - num2;
	}
	//////////////////////////////////////////////////////
	public static double hacerMultiplicacion(double num1,double num2)
	{
		return num1 * num2;
	}
	//////////////////////////////////////////////////////
	public static double hacerDivision(double num1,double num2)
	{
		return num1 / num2;
	}
	//////////////////////////////////////////////////////
	public static void verResultado(double resultado)
	{
		System.out.println(resultado);
	}
}
*/
///////////////////////////////////////////////////////////////////////////
/* programa que calcule el area y el perimetro del rectangulo

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1{

	public static  void main(String[] args)
	{
		double base = pedirBase();
		double altura = pedirAltura();
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro(base, altura);
		verResultado(area, perimetro);
		
	}
	///////////////////////////////////////////////////
	public static double pedirBase()
	{
		Scanner entrada = new Scanner (System.in);		
		System.out.println("Introduce la base: ");
		return entrada.nextDouble();
		
	}
//////////////////////////////////////////////////////////
	public static double pedirAltura() {
		Scanner entrada = new Scanner (System.in);		
		System.out.println("Introduce la altura: ");
		return entrada.nextDouble();
		
	}
//////////////////////////////////////////////////////////
	public static double calcularArea(double base, double altura)
	{
		return base * altura;
	}
//////////////////////////////////////////////////////////
	public static double calcularPerimetro(double base, double altura)
	{
		return 2 * (base + altura);
	}
//////////////////////////////////////////////////////////
	public static void verResultado(double area, double perimetro) {
		System.out.println("El area es: " + area + perimetro);
	}
}
*/


///////////////////////////////////////////////////////////////////
///// CAMBIO DE BASE


/*
package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//aplicacion para pasar un numero de base 10 a base 2
		arrancarAplicacion();
	}
	/////////////////////////////////////////////////////
	public static void arrancarAplicacion()
	{
		int numero = pedirNum();
		int base = pedirBase(numero);
		cambioBase(numero, base);
	}
	//////////////////////////////////////////////////////
	public static int pedirNum()
	{
		boolean numValido;
		int num;
		System.out.println("Introdue un numero: ");
		do{
			num = entrada.nextInt();
			numValido = (num > 0);
			if(!numValido)
				System.err.println("Error introduce un numero valido, mayor que 0");
			
		}while(!numValido);
		return num;
	}
	//////////////////////////////////////////////////////
	private static int pedirBase(int num)
	{
		boolean baseValida;
		int base = 0;
		System.out.println("Introduce la base: ");
		base = entrada.nextInt();
		if(num <= base)
		{
			System.out.println(num);
			return num;
		}
			
		
		else 
			do {
				base = entrada.nextInt();
				
				
				baseValida = (num >= base);
				
				if(!baseValida)
					System.err.println("Introduce una base valida. ");
				
			}while(!baseValida);	
		
		return base;
	}
	/////////////////////////////////////////////////////
	private static void cambioBase(int numero, int base)
	{
		if(numero < base)
			System.out.print(numero + " ");
		else
		{
			cambioBase(numero / base,base);
			System.out.print(numero % base + " ");
		}	
	}
}

*/
//////////////////////////////////////////////////////////////////////

/*
package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int m = pedirM();
		int n = pedirN(m);
		int combinacion = calcularCombinacion(m, n);
		verResultado(m, n, combinacion);
	}
	////////////////////////////////////////
	
	public static int pedirM() {
		boolean mValida;
		int m;
		System.out.println("Introduce un número m mayor o igual que 0");
		do {
			m = entrada.nextInt();
			//comprobamos si es valida
			mValida = (m>=0);
			if(!mValida) {
				System.out.println("ERROR");
			}
		}while(!mValida);
		return m;
	}
	////////////////////////////////////////
	public static int pedirN(int m) {
		boolean nValida;
		int n;
		System.out.println("Introduce un número n mayor o igual que 0 y menor o igual que m");
		do {
			n = entrada.nextInt();
			//comprobamos cuando es valida
			nValida = (n>=0 && n<=m);
			if(!nValida) {
				System.out.print("ERROR. Introduce un número n mayor o igual que 0 y menor o igual que m");
			}
		}while(!nValida);
		return n;
	}
	///////////////////////////////////////////////
	public static int calcularFactorial(int numero){
		if(numero == 0) {
			return 1;
		}else {
			return numero * calcularFactorial(numero-1);
		}
	}
	////////////////////////////////////////

	public static int calcularCombinacion(int m, int n) {
		return calcularFactorial(m)/(calcularFactorial(n)*calcularFactorial(m-n));
	}
	////////////////////////////////////////

	public static void verResultado(int m, int n, int combinacion) {
		System.out.println("La combinación es " + combinacion);

	}
	

}
*/

/////////////////////////////////////////////////////////////
///FECHAS
/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int mes = pedirMes();
		int anno = pedirAnno();
		int dia;
		boolean diaValido;
		do {
			dia = pedirDia();
			diaValido = validarDia(dia, mes, anno);
		}while(!diaValido);
		imprimirFecha(dia, mes, anno);
		

	}
	
	///////////////////////////////////////////////////
	
	public static int pedirMes(){
		boolean mesValido = false;
		int mes;
		System.out.println("Introduce el mes");
		do {
			mes = entrada.nextInt();
			mesValido = (mes>=1 && mes<=12);
			if(!mesValido) {
				System.out.println("ERROR. Introduce un mes correcto (entre 1 y 12)");
			}
		}while(!mesValido);
		return mes;
	}
	
	///////////////////////////////////////////////////

	public static int pedirAnno(){
		boolean annoValido;
		int anno;
		System.out.println("Introduce un año");
		do {
			anno = entrada.nextInt();
			annoValido = (anno >= 1582);
			if(!annoValido) {
				System.out.println("ERROR. Introduce un año correcto (mayor o igual que 1582)");
			}
		}while(!annoValido);
		return anno;
	}
	///////////////////////////////////////////////////

	public static int pedirDia(){
		System.out.println("Introduce el día");
		return entrada.nextInt();
		
	}
	///////////////////////////////////////////////////

	public static boolean validarDia(int dia, int mes, int anno){
		boolean diaValido = false;
		switch(mes)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				diaValido = (dia>1 && dia<=30);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 30");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diaValido = (dia>1 && dia<=31);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 31");
				}
				break;
			case 2:
				if(esBisiesto(anno)) {
					diaValido = (dia>1 && dia<=29);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 29");
					}
				}else {
					diaValido = (dia>1 && dia<=28);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 28");
					}
				}
				
		}
		return diaValido;
		
	}
	///////////////////////////////////////////////////

	public static boolean esBisiesto(int anno) {
		return ((anno%4 == 0)&&(anno%100!=0)||(anno%400==0));
	}
	///////////////////////////////////////////////////

	public static void imprimirFecha(int dia, int mes, int anno) {
		System.out.println("La fecha es " + dia + "/" + mes + "/" + anno);
	}

}
*/
////////////////////////////////////////////////////////////////////////
///MCD

/*
package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {

	public static void main(String[] args) {
		System.out.println("Introduce número 1");
		int numero1 = pedirNumero();
		System.out.println("Introduce número 2");
		int numero2 = pedirNumero();
		int mcd = calcularMcd(numero1, numero2);
		verResultado(numero1, numero2, mcd);
	}
///////////////////////////////////////////////
	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		return numero;
	}
	
///////////////////////////////////////////////
	public static int calcularMcd(int numero1, int numero2) {
		while(numero1 != numero2) {
			if (numero1 > numero2) {
				numero1 = numero1- numero2;
			}else {
				numero2 = numero2-numero1;
			}
		}
		return numero1;
	}
	/////////////////////////////////////////////
	public static void verResultado(int numero1, int numero2, int mcd) {
		System.out.println("El mCd de " + numero1 + " y " + numero2 + " es " + mcd);
	}
}
*/

//////////////////////////////////////////////////////////////////////////
////MAXIMO COMUN DIVISOR
/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {

	public static void main(String[] args) {
		int numero1 = pedirNumero1();
		int numero2 = pedirNumero2();
		int mcd = calcularMcd(numero1, numero2);
		verResultado(numero1, numero2, mcd);
	}
	////////////////////////////////////////////////

	public static int pedirNumero1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		return entrada.nextInt();
	}
	////////////////////////////////////////////////

	public static int pedirNumero2() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce otro número");
		return entrada.nextInt();
	}
	////////////////////////////////////////////////

	public static int calcularMcd(int numero1, int numero2) {
		if(numero1 == numero2) {
			return numero1;
		}else if (numero1 > numero2) {
				return calcularMcd(numero1-numero2, numero2);
			}else {
				return calcularMcd(numero1, numero2-numero1);
			}
		
	}
	////////////////////////////////////////////////

	public static void verResultado(int numero1, int numero2, int mcd) {
		System.out.println("El mCd de " + numero1 + " y " + numero2 + " es " + mcd);
	}
}

*/

/////////////////////////////////////////////////////////////////////
/////POTENCIA
/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {
	public static void main(String args[]) {
		int base = pedirBase();
		int expo = pedirExponente();
		int calc = calcularPotencia(base, expo);
		verResultado (base, expo, calc);
	}
	/////////////////////////////////////////////////////
	public static int pedirBase() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la base");
		return entrada.nextInt();
	}
	/////////////////////////////////////////////////////
	public static int pedirExponente() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el exponente");
		return entrada.nextInt();
	}
	////////////////////////////////////////////////////
	public static int calcularPotencia(int base, int expo) {
		int resultado = 1;
		for (int i = 0; i < expo; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
////////////////////////////////////////////////////
	public static void verResultado(int base, int expo, int calc) {
		System.out.println(base + " elevado a " + expo + " = " + calc);
	}
}

*/

////////////////////////////////////////////////////////////////////
////POTENCIA RECURSIVA 
/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {
	public static void main(String args[]) {
		int base = pedirBase();
		int expo = pedirExponente();
		int calc = calcularPotencia(base, expo);
		verResultado (base, expo, calc);
	}
	/////////////////////////////////////////////////////
	public static int pedirBase() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la base");
		return entrada.nextInt();
	}
	/////////////////////////////////////////////////////
	public static int pedirExponente() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el exponente");
		return entrada.nextInt();
	}
	////////////////////////////////////////////////////
	public static int calcularPotencia(int base, int expo) {
		if(expo == 0)
			return 1;
		
		return base * calcularPotencia(base, expo - 1);
	}
////////////////////////////////////////////////////
	public static void verResultado(int base, int expo, int calc) {
		System.out.println(base + " elevado a " + expo + " = " + calc);
	}
}
*/

/////////////////////////////////////////////////////////////////////////////
///SALARIO

/*

package estructurasdecontrol;

import java.util.Scanner;

public class AprendiendoJava1 {

	 static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
		arrancarAplicacion();
	}
	////////////////////////////////////////////////
	public static void arrancarAplicacion()
	{
		int emp = pedirEmpleados();
		double tarifa = pedirTarifa();
		calcSalario(emp,tarifa);
	}
	////////////////////////////////////////////////
	public static int pedirEmpleados()
	{
		int emp;
		System.out.println("Introduce el numero de empleados: ");
		do
		{
			emp = entrada.nextInt();
			if(emp <= 0)
				System.err.println("EL numero de empleados tiene que ser mayor que 0.");
		}while(emp <= 0);
		return emp;
	}
	///////////////////////////////////////////////
	public static double pedirTarifa()
	{
		double tarifa;
		System.out.println("Introduce la tarifa ordinaria:");
		do {
			tarifa = entrada.nextDouble();
			
			if(tarifa <= 0)
				System.err.println("La tarifa no puede ser 0");
		}while(tarifa <= 0);
		return tarifa;
	}
	/////////////////////////////////////////////////
	public static void calcSalario(int emp, double tarifa)
	{
		for(int i = 1; i <= emp; i++)
		{
			System.out.println("Empleado " + i);
			int horasTrabajadas = pedirHoras();
			double salBruto = calcSalBruto(tarifa,horasTrabajadas);
			double impuestos = calcImpuestos(salBruto);
			double neto = salBruto - impuestos;
			verResultados(salBruto, impuestos, neto);
		}
	}
	//////////////////////////////////////////////////
	public static int pedirHoras()
	{
		int horas;
		System.out.println("Introduce las horas trabajadas: ");
		
		do {
			horas = entrada.nextInt();
			
			if(horas < 38)
				System.out.println("Las horas tienen que ser 38 o mas");
		}while(horas < 38);
		return horas;
	}
	/////////////////////////////////////////////////////
	public static double calcSalBruto(double tarifa, int horasTrabajadas)
	{
		//declaramos una constante
		final double salarioFijo = 38 * tarifa;
		int horasExtras = horasTrabajadas - 38;
		double bruto = (horasExtras * 1.5) + salarioFijo;
		return bruto;
	}
	/////////////////////////////////////////////////////////////
	public static double calcImpuestos(double bruto)
	{
		final double tramo1 = (bruto - 600);
		final double tramo2 = (bruto - 1200);
		
		double impuestos;
		
		if(bruto <= 600)
			impuestos = 0;
		else if (bruto <= 1200)
			impuestos = tramo1 * 0.25;
		else
			impuestos = 600 * 0.25 + tramo2 * 0.45;
	
		return impuestos;
			
		}
	//////////////////////////////////////////////////////
	public static void verResultados(double salBruto, double impuestos, double neto)
	{
		System.out.println("El salario bruto es: " + salBruto);
		System.out.println("Impuestos: " + impuestos);
		System.out.println("El salario neto es: " + neto);
	}
	}

*/



