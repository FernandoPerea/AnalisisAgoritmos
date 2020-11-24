/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import Fibonacci.Fibonacci;
import Grafcas.GraficaTiempo;
import TSP.AlgoritmoDijkstra;
import TSP.Camino;

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

        int n = 10000;

     /*   double[] tiemposbmej = new double[n];
        double[] tiemposbmed = new double[n];
        double[] tiemposbpeo = new double[n];

        double[] tiemposismej = new double[n];
        double[] tiemposismed = new double[n];
        double[] tiemposispeo = new double[n];

        double[] tiemposmsmej = new double[n];
        double[] tiemposmsmed = new double[n];
        double[] tiemposmspeo = new double[n];

        Burbuja bmej = new Burbuja();
        InsertSort ismej = new InsertSort();
        MergeSort msmej = new MergeSort();

        Burbuja bmed = new Burbuja();
        InsertSort ismed = new InsertSort();
        MergeSort msmed = new MergeSort();

        Burbuja bpeo = new Burbuja();
        InsertSort ispeo = new InsertSort();
        MergeSort mspeo = new MergeSort();

        Burbuja bM_m = new Burbuja();
        InsertSort ism_M = new InsertSort();

        for (int j = 0; j < n; j++) {
            int[] arreglogen = GeneradorDatos.generarArregloIntMedioCasoOrd(j, 1000);

            //Mejor de los casos
            int[] auxbmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bmej.ordenar(ism_M.ordenarDatos(auxbmej));
            tiemposbmej[j] = (int) bmej.gettTotal();

            int[] auxismej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            ismej.ordenar(ism_M.ordenarDatos(auxismej));
            tiemposismej[j] = (int) ismej.gettTotal();

            int[] auxmsmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            msmej.ordenar(ism_M.ordenarDatos(auxmsmej));
            tiemposmsmej[j] = (int) msmej.gettTotal();
            //Medio de los casos
            int[] auxbmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bmed.ordenar(auxbmed);
            tiemposbmed[j] = (int) bmed.gettTotal();

            int[] auxismed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            ismed.ordenar(auxismed);
            tiemposismed[j] = (int) ismed.gettTotal();

            int[] auxmsmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            msmed.ordenar(auxmsmed);
            tiemposmsmed[j] = (int) msmed.gettTotal();
            //Peor de los casos
            int[] auxbpeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bpeo.ordenar(bM_m.ordenarDatosM_m(auxbpeo));
            tiemposbpeo[j] = (int) bpeo.gettTotal();

            int[] auxispeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            ispeo.ordenar(bM_m.ordenarDatosM_m(auxispeo));
            tiemposispeo[j] = (int) ispeo.gettTotal();

            int[] auxmspeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            mspeo.ordenar(bM_m.ordenarDatosM_m(auxmspeo));
            tiemposmspeo[j] = (int) mspeo.gettTotal();

        }

        GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Mejor");

        g1.agregarSerie(tiemposmsmej, "MergeSort");
        g1.agregarSerie(tiemposismej, "InsertSort");
        g1.agregarSerie(tiemposbmej, "Burbuja");

        g1.creaYmuestraGrafica();

        GraficaTiempo g1med = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Medio");

        g1med.agregarSerie(tiemposmsmed, "MergeSort");
        g1med.agregarSerie(tiemposismed, "InsertSort");
        g1med.agregarSerie(tiemposbmed, "Burbuja");

        g1med.creaYmuestraGrafica();
        GraficaTiempo g1peo = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor");

        g1peo.agregarSerie(tiemposmspeo, "MergeSort");
        g1peo.agregarSerie(tiemposispeo, "InsertSort");
        g1peo.agregarSerie(tiemposbpeo, "Burbuja");

        g1peo.creaYmuestraGrafica();
        */
     
     /*
        double[] tiemposbmej = new double[n];
        double[] tiemposbmed = new double[n];
        double[] tiemposbpeo = new double[n];

        double[] tiemposismej = new double[n];
        double[] tiemposismed = new double[n];
        double[] tiemposispeo = new double[n];

        double[] tiemposmsmej = new double[n];
        double[] tiemposmsmed = new double[n];
        double[] tiemposmspeo = new double[n];
        
        double[] tiemposbomej = new double[n];
        double[] tiemposbomed = new double[n];
        double[] tiemposbopeo = new double[n];

        double[] tiemposqsmej = new double[n];
        double[] tiemposqsmed = new double[n];
        double[] tiemposqspeo = new double[n];
        
        Burbuja bmej = new Burbuja();
        InsertSort ismej = new InsertSort();
        MergeSort msmej = new MergeSort();
        BurbujaOptimizado bomej = new BurbujaOptimizado();
        QuickSort qsmej = new QuickSort();

        Burbuja bmed = new Burbuja();
        InsertSort ismed = new InsertSort();
        MergeSort msmed = new MergeSort();
        BurbujaOptimizado bomed = new BurbujaOptimizado();
        QuickSort qsmed = new QuickSort();

        Burbuja bpeo = new Burbuja();
        InsertSort ispeo = new InsertSort();
        MergeSort mspeo = new MergeSort();
        BurbujaOptimizado bopeo = new BurbujaOptimizado();
        QuickSort qspeo = new QuickSort();
    
        
        Burbuja bM_m = new Burbuja();
        InsertSort ism_M = new InsertSort();

        for (int j = 0; j < n; j++) {
            int[] arreglogen = GeneradorDatos.generarArregloIntMedioCasoOrd(j, 1000);

            //Mejor de los casos
            int[] auxbmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bmej.ordenar(ism_M.ordenarDatos(auxbmej));
            tiemposbmej[j] = (int) bmej.gettTotal();

            int[] auxismej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            ismej.ordenar(ism_M.ordenarDatos(auxismej));
            tiemposismej[j] = (int) ismej.gettTotal();

            int[] auxmsmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            msmej.ordenar(ism_M.ordenarDatos(auxmsmej));
            tiemposmsmej[j] = (int) msmej.gettTotal();
            
            int[] auxbomej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bomej.ordenar(ism_M.ordenarDatos(auxbomej));
            tiemposbomej[j] = (int) bomej.gettTotal();
            
            int[] auxqsmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            qsmej.ordenar(ism_M.ordenarDatos(auxqsmej));
            tiemposqsmej[j] = (int) qsmej.gettTotal();
            
            //Medio de los casos
            int[] auxbmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bmed.ordenar(auxbmed);
            tiemposbmed[j] = (int) bmed.gettTotal();

            int[] auxismed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            ismed.ordenar(auxismed);
            tiemposismed[j] = (int) ismed.gettTotal();

            int[] auxmsmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            msmed.ordenar(auxmsmed);
            tiemposmsmed[j] = (int) msmed.gettTotal();
           
            int[] auxbomed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bomed.ordenar(auxbomed);
            tiemposbomed[j] = (int) bomed.gettTotal();
            
            int[] auxqsmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            qsmed.ordenar(auxqsmed);
            tiemposqsmed[j] = (int) qsmed.gettTotal();
            
            
           //Peor de los casos
            int[] auxbpeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bpeo.ordenar(bM_m.ordenarDatosM_m(auxbpeo));
            tiemposbpeo[j] = (int) bpeo.gettTotal();

            int[] auxispeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            ispeo.ordenar(bM_m.ordenarDatosM_m(auxispeo));
            tiemposispeo[j] = (int) ispeo.gettTotal();

            int[] auxmspeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            mspeo.ordenar(bM_m.ordenarDatosM_m(auxmspeo));
            tiemposmspeo[j] = (int) mspeo.gettTotal();
            
            int[] auxbopeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            bopeo.ordenar(bM_m.ordenarDatosM_m(auxbopeo));
            tiemposbopeo[j] = (int) bopeo.gettTotal();
            
            int[] auxqspeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            qspeo.ordenar(bM_m.ordenarDatosM_m(auxqspeo));
            tiemposqspeo[j] = (int) qspeo.gettTotal();
        }

        GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Mejor");

        g1.agregarSerie(tiemposmsmej, "MergeSort");
        g1.agregarSerie(tiemposismej, "InsertSort");
        g1.agregarSerie(tiemposqsmej, "QuickSort");
        g1.agregarSerie(tiemposbmej, "Burbuja");
        g1.agregarSerie(tiemposbomej, "BurbujaOptimizado");

        g1.creaYmuestraGrafica();

        GraficaTiempo g1med = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Medio");

        g1med.agregarSerie(tiemposmsmed, "MergeSort");
        g1med.agregarSerie(tiemposismed, "InsertSort");
        g1med.agregarSerie(tiemposqsmed, "QuickSort");
        g1med.agregarSerie(tiemposbmed, "Burbuja");
        g1med.agregarSerie(tiemposbomed, "BurbujaOptimizado");
        g1med.creaYmuestraGrafica();
        
        GraficaTiempo g1peo = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor");

        g1peo.agregarSerie(tiemposmspeo, "MergeSort");
        g1peo.agregarSerie(tiemposispeo, "InsertSort");
        g1peo.agregarSerie(tiemposqspeo, "QuickSort");
        g1peo.agregarSerie(tiemposbpeo, "Burbuja");
        g1peo.agregarSerie(tiemposbopeo, "BurbujaOptimizado");
        g1peo.creaYmuestraGrafica();

*/
     
/*
        double[] tiemposmsmej = new double[n];
        double[] tiemposmsmed = new double[n];
        double[] tiemposmspeo = new double[n];
        
      

        double[] tiemposqsmej = new double[n];
        double[] tiemposqsmed = new double[n];
        double[] tiemposqspeo = new double[n];
        
      
        MergeSort msmej = new MergeSort();
        QuickSort qsmej = new QuickSort();

       
        MergeSort msmed = new MergeSort();
        QuickSort qsmed = new QuickSort();

        
        MergeSort mspeo = new MergeSort();
        QuickSort qspeo = new QuickSort();
    
        
        Burbuja bM_m = new Burbuja();
        InsertSort ism_M = new InsertSort();

        for (int j = 0; j < n; j++) {
            int[] arreglogen = GeneradorDatos.generarArregloIntMedioCasoOrd(j, 1000);

            //Mejor de los casos
           

            int[] auxmsmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            msmej.ordenar(ism_M.ordenarDatos(auxmsmej));
            tiemposmsmej[j] = (int) msmej.gettTotal();
            
           
            
            int[] auxqsmej = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            qsmej.ordenar(ism_M.ordenarDatos(auxqsmej));
            tiemposqsmej[j] = (int) qsmej.gettTotal();
            
            //Medio de los casos
            

            int[] auxmsmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            msmed.ordenar(auxmsmed);
            tiemposmsmed[j] = (int) msmed.gettTotal();
           
                    
            int[] auxqsmed = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            qsmed.ordenar(auxqsmed);
            tiemposqsmed[j] = (int) qsmed.gettTotal();
            
            
           //Peor de los casos
           

            int[] auxmspeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            mspeo.ordenar(bM_m.ordenarDatosM_m(auxmspeo));
            tiemposmspeo[j] = (int) mspeo.gettTotal();
          
            
            int[] auxqspeo = Arrays.copyOfRange(arreglogen, 0, arreglogen.length);
            qspeo.ordenar(bM_m.ordenarDatosM_m(auxqspeo));
            tiemposqspeo[j] = (int) qspeo.gettTotal();
        }

        GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Mejor");

        g1.agregarSerie(tiemposmsmej, "MergeSort");
       
        g1.agregarSerie(tiemposqsmej, "QuickSort");
        

        g1.creaYmuestraGrafica();

        GraficaTiempo g1med = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Medio");

        g1med.agregarSerie(tiemposmsmed, "MergeSort");
        g1med.agregarSerie(tiemposqsmed, "QuickSort");
       
        g1med.creaYmuestraGrafica();
        
        GraficaTiempo g1peo = new GraficaTiempo("N", "Tiempo", "Tiempos Ordenar Menor a Mayor, Peor");

        g1peo.agregarSerie(tiemposmspeo, "MergeSort");
        g1peo.agregarSerie(tiemposqspeo, "QuickSort");
               g1peo.creaYmuestraGrafica();*/

/*
n=1000000;

double[] tiemposite = new double[n+1];
//double[] tiemposrec = new double[n+1];
double[] tiemposited = new double[n+1];
double[] tiemposrecd = new double[n+1];

  Fibonacci fibite = new Fibonacci();
    //Fibonacci fibrec = new Fibonacci();
  Fibonacci fibited = new Fibonacci();
  Fibonacci fibrecd = new Fibonacci();

  System.out.println("Iterativo");
  for(int i = 0 ; i<=n ; i++){
       fibite.doititera(i,0,1,1);
       tiemposite[i] = fibite.tTotal;
   }
  /*System.out.println("Recursivo");
    for(int i = 0 ; i<=n ; i++){
       fibrec.doitrecur(i);
        tiemposrec[i] = fibrec.tTotal;
    }
  System.out.println("Iterativo Dinamico");
      for(int i = 0 ; i<=n ; i++){
       fibited.doititeradina(4);
          tiemposited[i] = fibited.tTotal;
    }
  System.out.println("Recursivo Dinamico");
      for(int i = 0 ; i<=n ; i++){
       fibrecd.doitrecurdina(4);
          tiemposrecd[i] = fibrecd.tTotal;
    }
       
        GraficaTiempo g1 = new GraficaTiempo("N", "Tiempo", "Fibonacci"); 

        g1.agregarSerie(tiemposite, "Iterativo");
       
        //g1.agregarSerie(tiemposrec, "Recursivo");
         g1.agregarSerie(tiemposited, "Iterativo Dinamico");
       
        g1.agregarSerie(tiemposrecd, "Recursivo Dinamico");

        g1.creaYmuestraGrafica();*/

AlgoritmoDijkstra aux;
        for (int x=0 ; x < 5;x++){
        aux = new AlgoritmoDijkstra(5);
        Camino c = aux.buscarCamino(x);
        System.out.println("Ci= "+x+" Distancia Total: "+c.getDistanciaRecorrida());
    }
}
}
