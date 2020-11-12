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
import Ordenamiento.BurbujaOptimizado;
import Ordenamiento.InsertSort;
import Ordenamiento.MergeSort;
import Ordenamiento.QuickSort;
import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;
import java.util.Arrays;
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

        
       primero(6000);



       
  }
    public static void primero(int n){
      int[] arreglogen;
       int[] auxb;
       int[] auxis;
       int[] auxms;
       
        double[] tiemposb = new double[n];
        double[] tiemposis = new double[n];
        double[] tiemposms = new double[n];
        
        Burbuja b = new Burbuja();
        InsertSort is = new InsertSort();
        MergeSort ms = new MergeSort();

        for (int j = 0; j < n; j++){
          arreglogen = GeneradorDatos.generarArregloIntMejorCasoOrd(j,1000);
          auxb = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxis = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxms = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          
          b.ordenar(auxb);
          is.ordenar(auxis);
          ms.ordenar(auxms);
          
            tiemposb[j] =  b.gettTotal();
            tiemposis[j] =  is.gettTotal();
            tiemposms[j] = ms.gettTotal();
        }  
              
     GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Mejor");
         g1.agregarSerie(tiemposms, "MergeSort");
         g1.agregarSerie(tiemposis, "InsertSort");
         g1.agregarSerie(tiemposb, "Burbuja");
         g1.creaYmuestraGrafica();
         
         
       int[] arreglogenmed;
       int[] auxbmed;
       int[] auxismed;
       int[] auxmsmed;
       
        double[] tiemposbmed = new double[n];
        double[] tiemposismed = new double[n];
        double[] tiemposmsmed = new double[n];
        
        Burbuja bmed = new Burbuja();
        InsertSort ismed = new InsertSort();
        MergeSort msmed = new MergeSort();

        for (int j = 0; j < n; j++){
          arreglogenmed = GeneradorDatos.generarArregloIntMedioCasoOrd(j,1000);
          auxbmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxismed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxmsmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          
          bmed.ordenar(auxbmed);
          ismed.ordenar(auxismed);
          msmed.ordenar(auxmsmed);
          
            tiemposbmed[j] =  bmed.gettTotal();
            tiemposismed[j] =  ismed.gettTotal();
            tiemposmsmed[j] = msmed.gettTotal();
        }  
              

       
      GraficaTiempo g1med = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Medio");
         g1med.agregarSerie(tiemposmsmed, "MergeSort");
         g1med.agregarSerie(tiemposismed, "InsertSort");
         g1med.agregarSerie(tiemposbmed, "Burbuja");
         g1med.creaYmuestraGrafica();
         
       int[] arreglogenpeo;
       int[] auxbpeo;
       int[] auxispeo;
       int[] auxmspeo;
       
        double[] tiemposbpeo = new double[n];
        double[] tiemposispeo = new double[n];
        double[] tiemposmspeo = new double[n];
        
        Burbuja bpeo = new Burbuja();
        InsertSort ispeo = new InsertSort();
        MergeSort mspeo = new MergeSort();

        for (int j = 0; j < n; j++){
          arreglogenpeo = GeneradorDatos.generarArregloIntMedioCasoOrd(j,1000);
          auxbpeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxispeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxmspeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          
          bpeo.ordenar(auxbpeo);
          ispeo.ordenar(auxispeo);
          mspeo.ordenar(auxmspeo);
          
            tiemposbpeo[j] =  bpeo.gettTotal();
            tiemposispeo[j] =  ispeo.gettTotal();
            tiemposmspeo[j] = mspeo.gettTotal();
        }  
              

       
      GraficaTiempo g1peo = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor");
         g1peo.agregarSerie(tiemposmspeo, "MergeSort");
         g1peo.agregarSerie(tiemposispeo, "InsertSort");
         g1peo.agregarSerie(tiemposbpeo, "Burbuja");
         g1peo.creaYmuestraGrafica();
    }
    public static void segundo(int n){
    
       int[] arreglogen;
       int[] auxb;
       int[] auxis;
       int[] auxms;
       int[] auxbo;
       
        double[] tiemposb = new double[n];
        double[] tiemposis = new double[n];
        double[] tiemposms = new double[n];
        double[] tiemposbo = new double[n];

        Burbuja b = new Burbuja();
        InsertSort is = new InsertSort();
        MergeSort ms = new MergeSort();
        BurbujaOptimizado bo = new BurbujaOptimizado();
        
        for (int j = 0; j < n; j++){
          arreglogen = GeneradorDatos.generarArregloIntMejorCasoOrd(j,1000);
          auxb = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxis = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxms = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxbo = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          
          b.ordenar(auxb);
          is.ordenar(auxis);
          ms.ordenar(auxms);
          bo.ordenar(auxbo);
          
            tiemposb[j] =  b.gettTotal();
            tiemposis[j] =  is.gettTotal();
            tiemposms[j] = ms.gettTotal();
            tiemposbo[j] = bo.gettTotal();
        }  
              
     GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Mejor");
         g1.agregarSerie(tiemposbo, "BurbujaOptimizado");
         g1.agregarSerie(tiemposms, "MergeSort");
         g1.agregarSerie(tiemposis, "InsertSort");
         g1.agregarSerie(tiemposb, "Burbuja");
         g1.creaYmuestraGrafica();
         
         
       int[] arreglogenmed;
       int[] auxbmed;
       int[] auxismed;
       int[] auxmsmed;
       int[] auxbomed;
       
        double[] tiemposbmed = new double[n];
        double[] tiemposismed = new double[n];
        double[] tiemposmsmed = new double[n];
        double[] tiemposbomed = new double[n];

        Burbuja bmed = new Burbuja();
        InsertSort ismed = new InsertSort();
        MergeSort msmed = new MergeSort();
        BurbujaOptimizado bomed = new BurbujaOptimizado();

        for (int j = 0; j < n; j++){
          arreglogenmed = GeneradorDatos.generarArregloIntMedioCasoOrd(j,1000);
          auxbmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxismed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxmsmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxbomed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);

          bmed.ordenar(auxbmed);
          ismed.ordenar(auxismed);
          msmed.ordenar(auxmsmed);
          bomed.ordenar(auxbomed);
          
            tiemposbmed[j] =  bmed.gettTotal();
            tiemposismed[j] =  ismed.gettTotal();
            tiemposmsmed[j] = msmed.gettTotal();
            tiemposbomed[j] = bomed.gettTotal();
        }  
              

       
      GraficaTiempo g1med = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Medio");
          g1med.agregarSerie(tiemposbomed, "BurbujaOptimizado");
         g1med.agregarSerie(tiemposmsmed, "MergeSort");
         g1med.agregarSerie(tiemposismed, "InsertSort");
         g1med.agregarSerie(tiemposbmed, "Burbuja");
         g1med.creaYmuestraGrafica();
         
       int[] arreglogenpeo;
       int[] auxbpeo;
       int[] auxispeo;
       int[] auxmspeo;
       int[] auxbopeo;
       
        double[] tiemposbpeo = new double[n];
        double[] tiemposispeo = new double[n];
        double[] tiemposmspeo = new double[n];
        double[] tiemposbopeo = new double[n];

        Burbuja bpeo = new Burbuja();
        InsertSort ispeo = new InsertSort();
        MergeSort mspeo = new MergeSort();
        BurbujaOptimizado bopeo = new BurbujaOptimizado();

        for (int j = 0; j < n; j++){
          arreglogenpeo = GeneradorDatos.generarArregloIntMedioCasoOrd(j,1000);
          auxbpeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxispeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxmspeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxbopeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          
          bpeo.ordenar(auxbpeo);
          ispeo.ordenar(auxispeo);
          mspeo.ordenar(auxmspeo);
          bopeo.ordenar(auxbopeo);
          
            tiemposbpeo[j] =  bpeo.gettTotal();
            tiemposispeo[j] =  ispeo.gettTotal();
            tiemposmspeo[j] = mspeo.gettTotal();
            tiemposbopeo[j] = bopeo.gettTotal();

        }  
              
       
      GraficaTiempo g1peo = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor");
         g1peo.agregarSerie(tiemposbopeo, "BurbujaOptimizado");
         g1peo.agregarSerie(tiemposmspeo, "MergeSort");
         g1peo.agregarSerie(tiemposispeo, "InsertSort");
         g1peo.agregarSerie(tiemposbpeo, "Burbuja");
         g1peo.creaYmuestraGrafica();
    
    }
    
    public static void tercero(int n){
    
       int[] arreglogen;
       int[] auxb;
       int[] auxis;
       int[] auxms;
       int[] auxqs;
       
        double[] tiemposb = new double[n];
        double[] tiemposis = new double[n];
        double[] tiemposms = new double[n];
        double[] tiemposqs = new double[n];

        Burbuja b = new Burbuja();
        InsertSort is = new InsertSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        
        for (int j = 0; j < n; j++){
          arreglogen = GeneradorDatos.generarArregloIntMejorCasoOrd(j,1000);
          auxb = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxis = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxms = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          auxqs = Arrays.copyOfRange(arreglogen,0,arreglogen.length);
          
          b.ordenar(auxb);
          is.ordenar(auxis);
          ms.ordenar(auxms);
          qs.ordenar(auxqs);
          
            tiemposb[j] =  b.gettTotal();
            tiemposis[j] =  is.gettTotal();
            tiemposms[j] = ms.gettTotal();
            tiemposqs[j] = qs.gettTotal();
        }  
              
     GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Mejor");
         g1.agregarSerie(tiemposqs, "QuickSort");
         g1.agregarSerie(tiemposms, "MergeSort");
         g1.agregarSerie(tiemposis, "InsertSort");
         g1.agregarSerie(tiemposb, "Burbuja");
         g1.creaYmuestraGrafica();
         
         
       int[] arreglogenmed;
       int[] auxbmed;
       int[] auxismed;
       int[] auxmsmed;
       int[] auxqsmed;
       
        double[] tiemposbmed = new double[n];
        double[] tiemposismed = new double[n];
        double[] tiemposmsmed = new double[n];
        double[] tiemposqsmed = new double[n];

        Burbuja bmed = new Burbuja();
        InsertSort ismed = new InsertSort();
        MergeSort msmed = new MergeSort();
        QuickSort qsmed = new QuickSort();

        for (int j = 0; j < n; j++){
          arreglogenmed = GeneradorDatos.generarArregloIntMedioCasoOrd(j,1000);
          auxbmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxismed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxmsmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);
          auxqsmed = Arrays.copyOfRange(arreglogenmed,0,arreglogenmed.length);

          bmed.ordenar(auxbmed);
          ismed.ordenar(auxismed);
          msmed.ordenar(auxmsmed);
          qsmed.ordenar(auxqsmed);
          
            tiemposbmed[j] =  bmed.gettTotal();
            tiemposismed[j] =  ismed.gettTotal();
            tiemposmsmed[j] = msmed.gettTotal();
            tiemposqsmed[j] = qsmed.gettTotal();
        }  
              

       
      GraficaTiempo g1med = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Medio");
          g1med.agregarSerie(tiemposqsmed, "QuickSort");
         g1med.agregarSerie(tiemposmsmed, "MergeSort");
         g1med.agregarSerie(tiemposismed, "InsertSort");
         g1med.agregarSerie(tiemposbmed, "Burbuja");
         g1med.creaYmuestraGrafica();
         
       int[] arreglogenpeo;
       int[] auxbpeo;
       int[] auxispeo;
       int[] auxmspeo;
       int[] auxqspeo;
       
        double[] tiemposbpeo = new double[n];
        double[] tiemposispeo = new double[n];
        double[] tiemposmspeo = new double[n];
        double[] tiemposqspeo = new double[n];

        Burbuja bpeo = new Burbuja();
        InsertSort ispeo = new InsertSort();
        MergeSort mspeo = new MergeSort();
        QuickSort qspeo = new QuickSort();

        for (int j = 0; j < n; j++){
          arreglogenpeo = GeneradorDatos.generarArregloIntMedioCasoOrd(j,1000);
          auxbpeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxispeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxmspeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          auxqspeo = Arrays.copyOfRange(arreglogenpeo,0,arreglogenpeo.length);
          
          bpeo.ordenar(auxbpeo);
          ispeo.ordenar(auxispeo);
          mspeo.ordenar(auxmspeo);
          qspeo.ordenar(auxqspeo);
          
            tiemposbpeo[j] =  bpeo.gettTotal();
            tiemposispeo[j] =  ispeo.gettTotal();
            tiemposmspeo[j] = mspeo.gettTotal();
            tiemposqspeo[j] = qspeo.gettTotal();

        }  
              
       
      GraficaTiempo g1peo = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor");
         g1peo.agregarSerie(tiemposqspeo, "QuickSort");
         g1peo.agregarSerie(tiemposmspeo, "MergeSort");
         g1peo.agregarSerie(tiemposispeo, "InsertSort");
         g1peo.agregarSerie(tiemposbpeo, "Burbuja");
         g1peo.creaYmuestraGrafica();
    
    
    
    
    }
}
