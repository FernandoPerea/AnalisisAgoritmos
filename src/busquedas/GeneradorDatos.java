/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import Ordenamiento.Burbuja;
import java.util.Random;

/**
 *
 * @author working
 */
public class GeneradorDatos {
    
    // "aleatorio"
    public static int[] generarArregloInt(int x, int dim, int bound){
        int[] arreglo = new int[dim];
        Random ran = new Random();
       
        for(int y=0; y < dim; y++){
            arreglo[y] =ran.nextInt(bound);
        }
        int pos = ran.nextInt(dim);
        
        System.out.println("Se guardó: "+pos);
        
        arreglo[pos] = x;
        
       return arreglo;
    }
    
    // "peor de los casos unico elemento"
    public static int[] generarArregloIntPeorCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
       
       
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x,bound);
            arreglo[y] =j;
        }
      arreglo[dim-1] = x;
        
       return arreglo;
    }
        public static int[] generarArregloIntMejorCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
       
       
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x,bound);
            arreglo[y] =j;
        }
      arreglo[0] = x;
        
       return arreglo;
    }    public static int[] generarArregloIntMedioCaso(int x, int dim, int bound){
        int[] arreglo = new int[dim];
       
       
        for(int y=0; y < dim; y++){
            int j = generarNumeroAleatorioControlado(x,bound);
            arreglo[y] =j;
        }
      arreglo[(dim-1)/2] = x;
        
       return arreglo;
    }
    

    //genera numeros aleatorios en base a una valor x que no queremos que se genere
    public static int generarNumeroAleatorioControlado(int x, int bound){
     Random ran = new Random();
     int aux =ran.nextInt(bound);
     while(aux==x){
         aux =ran.nextInt(bound);
     
     }
     return aux;
    }
    
      public static int[] generarArregloIntM_m(int n, int bound){
        int[] arreglo = new int[n];
        Random ran = new Random();
     
        for(int y=0; y < n; y++){
            arreglo[y] = ran.nextInt(bound);
        }
        Burbuja b = new Burbuja();
          
        int[] arreglox = new int[n];
       
        arreglox = b.ordenarDatosM_m(arreglo);
        
        return arreglox;
    }
      
       public static int[] generarArregloInt(int n, int bound){
        int[] arreglo = new int[n];
        Random ran = new Random();
     
        for(int y=0; y < n; y++){
            arreglo[y] = ran.nextInt(bound);
        }
       
        
        return arreglo;
    }
}