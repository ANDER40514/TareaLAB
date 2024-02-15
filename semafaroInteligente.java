/*
	Especificacion:

	El programa debe implementar un semáforo simple que tenga tres estados: rojo, amarillo y verde. 
	El semáforo debe cambiar de estado cada segundo.


	Requisitos:

	* El semáforo debe tener tres estados: rojo, amarillo y verde.
	* El semáforo debe cambiar de estado cada vez que el usuario presione enter.
	* El programa terminará cuando el usuario escriba la palabra FIN.

*/

import java.util.Scanner;
	
public class semafaroInteligente  {

	public static void main(String args[]) 
	{

	//Creando Variable responsable donde el usuario ingresara la palabra
	Scanner guardarEntradas = new Scanner(System.in);

    //Bienvenida al Programa al usuario
	System.out.println("\n\n**************************************************");
	System.out.println("Estudiante: Anderson Castillo");
	System.out.println("Matricula: 100631535");
	System.out.println("**************************************************");
	
	System.out.println("\nBienvenido al Semafaro Inteligente");


	//Mostrando al usuario las dos principales opciones del Programa
	System.out.println("\n1-) Presione Enter para comenzar el Semafaro Inteligente");
	System.out.println("2-) Ingrese 'FIN' o 'fin' para finalizar la ejecucion del programa");

	//Solicitando que ingrese un valor
	System.out.println("\nIngresa una de las opciones para continuar:");
	String entradaUsuario  = guardarEntradas.nextLine();



	// Con el "\n" -> Es posible determinar las veces que el usuario da enter
	//Ciclo While para mantener el cambio de estado del semafaro cada vez que se presione enter 

	//En el ciclo while estaria utilizando .equals(), ya que este compara los valores de la Cadena y != verifica las referencias
 	while(!entradaUsuario.equals("FIN") || !entradaUsuario.equals("fin")) // OPCIONAL: (entradaUsuario != "FIN" || entradaUsuario != "fin")

 	{
 		//SEMAFARO ROJO (MENSAJE MOSTRADO CUANDO EL SEMAFARO SE ENCUENTRE EN ROJO)
 		System.out.println("Estado del Semafaro: Estado Rojo -> STOP");
 		entradaUsuario  = guardarEntradas.nextLine();  // Entrada que se le solicita al usuario para determinar si continua el ciclo o no


 		//SEMAFARO AMARILLO (MENSAJE MOSTRADO CUANDO EL SEMAFARO SE ENCUENTRE EN AMARILLO)
 		System.out.println("Estado del Semafaro: Estado Amarillo -> Reduzca la Velocidad");
 		entradaUsuario  = guardarEntradas.nextLine(); // Entrada que se le solicita al usuario para determinar si continua el ciclo o no

 		//SEMAFARO VERDE (MENSAJE MOSTRADO CUANDO EL SEMAFARO SE ENCUENTRE EN VERDE)
 		System.out.println("Estado del Semafaro: Estado Verde -> Adelante");
 		entradaUsuario  = guardarEntradas.nextLine(); // Entrada que se le solicita al usuario para determinar si continua el ciclo o no

 		/*En el IF se estaria comparando si el dato ingresado por el usuario es FIN.

 		se utiliza .equals(), ya que este compara los valores de la cadena

 		Si se utiliza (==), este solo compara si los objetos son del mismo objeto en memoria, estuve probando con ==, pero este 
 		para lo que se solicita en el ejercicio, no resolvia la comparacion

 		Si se quiere comparar cadena .equals() fue mi solucion
 		*/
 		if (entradaUsuario.equals("FIN") || entradaUsuario.equals("fin") || entradaUsuario.equals("Fin")) { 	
  		System.out.println("\n\n*************************************************");
 		System.out.println("\n\nEjecucion Finalizada con Exito!!");
  		System.out.println("*************************************************");
 		System.exit(0);
 	  }
	}
  }
}
