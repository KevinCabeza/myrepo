//importamos la clase Scanner
import java.util.Scanner;
class SumaNumero 
{
      /*Este programa introduce por teclado dos numeros y visualiza en pantalla su suma*/
      public static void main(String args[])
      {
           //Creamos un objeto de tipo Scanner 
           Scanner entrada = new Scanner (System.in);

           //Introducimos por teclado los numeros 
           System.out.println("introduce numero 1");
           int num1 = entrada.nextInt();
           System.out.println("introduce numero 2");
           int num2 = entrada.nextInt();
     
           //Calculamos la suma 
           int suma = num1 + num2;

           //Enviamos a pantalla el resultado 
           System.out.println("La suma es " + suma);
      }
}
