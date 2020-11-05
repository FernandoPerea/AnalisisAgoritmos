/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import Fibonacci.Fibonacci;
import Fibonacci.tiemposfibo;
import Grafcas.GraficaTiempo;
import Ordenamiento.Burbuja;
import Ordenamiento.InsertSort;
import Ordenamiento.MergeSort;
import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author working
 */
public class AA20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


       int n = 5000;
        int[] aux;
        
        double[] tiempos = new double[n];
        double[] tiempos2 = new double[n];
        double[] tiempos3 = new double[n];
        
        Burbuja b = new Burbuja();
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
        }  
                InsertSort is = new InsertSort();

          for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            is.ordenar(aux);
            tiempos2[j] = (int) is.gettTotal();
        }  
        
        MergeSort ms = new MergeSort();
         for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            ms.ordenar(aux);
            tiempos3[j] = (int) ms.gettTotal();
        }  
      GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Caso Medio");
         g1.agregarSerie(tiempos3, "MergeSort");
         g1.agregarSerie(tiempos2, "InsertSort");
         g1.agregarSerie(tiempos, "Burbuja");
        g1.creaYmuestraGrafica();
       
        double[] tiempos4 = new double[n];
        double[] tiempos5 = new double[n];
        double[] tiempos6 = new double[n];
        
        Burbuja b2 = new Burbuja();
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloIntM_m(j,1000);
            b2.ordenar(aux);
            tiempos4[j] = (int) b2.gettTotal();
        }  
                InsertSort is2 = new InsertSort();

          for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloIntM_m(j,1000);
            is2.ordenar(aux);
            tiempos5[j] = (int) is2.gettTotal();
        }  
        
        MergeSort ms2 = new MergeSort();
         for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloIntM_m(j,1000);
            ms2.ordenar(aux);
            tiempos6[j] = (int) ms2.gettTotal();
        }  
      GraficaTiempo g2 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor Caso");
         g2.agregarSerie(tiempos6, "MergeSort");
         g2.agregarSerie(tiempos5, "InsertSort");
         g2.agregarSerie(tiempos4, "Burbuja");
         g2.creaYmuestraGrafica();
       
   
   /*int serie=50;
       
       
         double[] tiempos = new double[serie+1];
       Fibonacci fibo = new Fibonacci();
       
       System.out.println("Fibo Iterativo: ");
         for (int i = 0; i <= serie; i++) {
            fibo.doititera(i, 0, 1, 1);
            tiempos[i] = (int)fibo.gettTotal();
            System.out.println("Para  "+i+ " = "+tiempos[i]);
          }
         
         
       double[] tiempos2 = new double[serie+1];
       Fibonacci fibo2 = new Fibonacci();
      
       System.out.println("Fibo Recursivo: ");
       for(int j=0; j<= serie;j++){
                fibo2.doitrecur(j);
                tiempos2[j] = (int)fibo2.gettTotal();
       System.out.println("Para  "+j+ " = "+ tiempos2[j]);
       
            
       }
        GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos");
        g1.agregarSerie(tiempos, "Iterativo");
        g1.agregarSerie(tiempos2, "Recursivo");
        g1.creaYmuestraGrafica();*/
    }

      



}
