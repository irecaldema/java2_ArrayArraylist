/*
Crea un programa, que aparezca el siguiente menu y que ejecute el código necesario.

Menu

1.  Introducir dato (pedir por teclado)
2.  Modificar dato (pedir el dato a modificar y el nuevo dato)
3.  Eliminar dato
4.  Buscar dato
5.  Mostrar datos
6.  Salir
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main (String args[])	{
		Scanner sc = new Scanner(System.in);
		int seleccion =-1;
		do {
		    System.out.println("\n	Introduce el numero correspondiente:");
			System.out.println("		1.  Introducir dato (pedir por teclado)");
			System.out.println("		2.  Modificar dato (pedir el dato a modificar y el nuevo dato)");
			System.out.println("		3.  Eliminar dato");
			System.out.println("		4.  Buscar dato");
			System.out.println("		5.  Mostrar datos");
			System.out.println("		6: salir");			
			seleccion = sc.nextInt();
			switch (seleccion){
				case 1: {
					System.out.println("1.  Introducir dato (pedir por teclado)");			
					break;
				}//case 1
				case 2: {
					System.out.println("2.  Modificar dato (pedir el dato a modificar y el nuevo dato)");
					break;
				}//case 2
				case 3: {
					System.out.println("3.  Eliminar dato");
					break;
				}//case 3
					case 4: {
					System.out.println("4.  Buscar dato");
					break;
				}//case 4
					case 5: {
					System.out.println("5.  Mostrar datos");
					break;
				}//case 5
					case 6: {
					System.out.println("6: salir");	
					break;
				}//case 6
			
				default: {
					System.out.println("\n	No has seleccionado una opcion valida:");
				}
			}	
		}	while (seleccion!=6);
	}
}	