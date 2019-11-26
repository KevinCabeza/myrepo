package estructurasdecontrol;

 //importamos la clase Scanner

import java.util.Scanner;
class Area
{
          /*Este programa realiza el area y perimetro*/
          public static void main(String args[])
       {
           //Creamos un objeto de tipo Scanner 
           Scanner entrada = new Scanner (System.in);

           //Introducimos por teclado los numero de la base y la altura 
           System.out.println("Escribe la Base");
           int Base = entrada.nextInt();
           System.out.println("Escribe la Altura");
           int Altura = entrada.nextInt();
          
           //Calculamos el area 
           int Area = Base * Altura;

           //Enviamos a pantalla el resultado del area 
           System.out.println("El resultado del area es" + Area);

           //Ahora que tenemos el area,con el hacemos el perimetro 

           int Perimetro =(Base + Altura)*2;

           //Enviamos a pantalla el resultado del perimetro 
           System.out.println("El resultado del Perimetro es" + Perimetro);

}
       }
 
            
           
