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


   /*    int n = 5000;
        int[] aux;
        double[] tiempos = new double[n];
        double[] tiempos2 = new double[n];
        Burbuja b = new Burbuja();
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
        }  
                InsertSort b1 = new InsertSort();

        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            b1.ordenar(aux);
            tiempos2[j] = (int) b1.gettTotal();
        }  
      GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos");
        g1.agregarSerie(tiempos, "Burbuja");
        g1.agregarSerie(tiempos2, "InsertSort");
        g1.creaYmuestraGrafica();*/
       int serie=45;
       
       
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
        g1.creaYmuestraGrafica();
    }

      



}
