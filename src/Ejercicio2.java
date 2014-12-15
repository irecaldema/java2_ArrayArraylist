/*
EJERCICIO 2: Ordenar un arrayList de menor a mayor

ArrayList de 5 elementos
Visualizar el ArrayList antes de ordenar (utilizando el for parecido al foreach) 
Ordenar
Visualizar el array después de ordenar
*/
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio2 {
	public static void main (String args[]) {
	        ArrayList<Integer> al_numeros = new ArrayList<Integer>(5);
	        //-2, 5, 1, 9, -6
	        al_numeros.add(-2); 
			al_numeros.add(5);
			al_numeros.add(1);
			al_numeros.add(9);
			al_numeros.add(-6);
			
			for (int i=0; i<al_numeros.size();i++){
	    	    System.out.print(" "+al_numeros.get(i)+" ");
	    	}
	    	System.out.println();
	    	System.out.println("version ordenada: ");
	    	
	    	Collections.sort(al_numeros);
	    	for (int i=0; i<al_numeros.size();i++){
	    	    System.out.print(" "+al_numeros.get(i)+" ");
	    	}
	    	System.out.println();
	}
}		    