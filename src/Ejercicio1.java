/*
EJERCICIO 1: Ordenar un array de números de menor a mayor
 
Array de 5 elementos
Visualizar el array antes de ordenar
Ordenar
Visualizar el array después de ordenar
*/import java.util.Arrays;
public class Ejercicio1 {
	public static void main (String args[]) {
    	int[] numeros = {-2, 5, 1, 9, -6};
    	int[] ordenados = new int[5];
    	System.out.println("Contenido del array");
    	for (int i=0; i<numeros.length;i++){
    	    System.out.print(" "+numeros[i]+" ");
    	}
    	System.out.println();/*
    	int comodin = -100;
    	int pos=0;
    	for (int n=0; n<ordenados.length;n++){
        	for (int i=0; i<numeros.length;i++){
        	    if (numeros[i]>=comodin){
        	        comodin=numeros[i];
        	        pos=i;
        	    }  
        	}
    	    ordenados[n]=comodin;
    	    numeros[pos]=-100;
    	    comodin=-100;
    	}  
    	for (int i=0; i<ordenados.length;i++){
    	    System.out.print(" "+ordenados[i]+" ");
    	}*/
    	System.out.println("Array ordenado:");
    	Arrays.sort(numeros);    	
    	for (int i=0; i<numeros.length;i++){
    	    System.out.print(" "+numeros[i]+" ");
    	}
    	System.out.println();    	
	}
}		    