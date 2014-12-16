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
		ArrayList<Integer> al_numeros = new ArrayList<Integer>(1);
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
					int num = sc.nextInt();
					al_numeros.add(num); 
					break;
				}//case 1
				case 2: {
					System.out.println("2.  Modificar dato (pedir el dato a modificar y el nuevo dato)");
					System.out.println(" Introduce el dato a modificar");
					int busqueda = sc.nextInt();
					for (int i=0; i<al_numeros.size();i++){
						if (al_numeros.get(i)==busqueda){
	    	    			System.out.println(" casilla: "+i+" contenido: "+al_numeros.get(i)+" ");
	    	    			System.out.println(" Introduce el dato modificado");
	    	    			int num = sc.nextInt();
	    	    			al_numeros.set(i,num);
	    	    			break;
						}	/*
						else{
							System.out.println(" el dato no esta en el arraylist");
						}	*/					
	    			}
					break;
				}//case 2
				case 3: {
					System.out.println("3.  Eliminar dato");
					System.out.println(" Introduce el dato a borrar");
					int busqueda = sc.nextInt();
					for (int i=0; i<al_numeros.size();i++){
						if (al_numeros.get(i)==busqueda){
	    	    			System.out.println(" casilla: "+i+" contenido: "+al_numeros.get(i)+" ");
							int num = sc.nextInt();
							al_numeros.remove(num);
	    	    			break;
						}/*
						else{
							System.out.println(" el dato no esta en el arraylist");
						}*/
	    			}

					break;
				}//case 3
					case 4: {
					System.out.println("4.  Buscar dato");
					System.out.println(" Introduce el dato a buscar");
					int busqueda = sc.nextInt();
					for (int i=0; i<al_numeros.size();i++){
						if (al_numeros.get(i)==busqueda){
	    	    			System.out.println(" casilla: "+i+" contenido: "+al_numeros.get(i)+" ");
	    	    			break;
						}	
						/*else{
							System.out.println(" el dato no esta en el arraylist");
						}		*/				
	    			}
					break;
				}//case 4
					case 5: {
					System.out.println("5.  Mostrar datos");
					for (int i=0; i<al_numeros.size();i++){
	    	    		System.out.print(" "+al_numeros.get(i)+" ");
	    	    	}
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