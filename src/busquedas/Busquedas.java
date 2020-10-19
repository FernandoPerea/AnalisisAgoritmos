/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author working
 */
public class Busquedas {
    
    public static int busquedaLineal (int[] datos, int x){
    
    int[] lista = datos;	// Lista de números enteros que supondremos llena.
		boolean encontrado = false;	// Declaramos e inicializamos una bandera.
		int i = 0;			// Declaramos e inicializamos un índice.
		
		while ( (i < lista.length) && !encontrado ){
			if (lista[i++] == x)		// Incrementamos el índice después de la comparación
				encontrado = true;
                }
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		
	  return i;
        
    }
  
}
