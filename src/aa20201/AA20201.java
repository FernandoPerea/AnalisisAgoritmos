/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import Grafcas.GraficaTiempo;
import Ordenamiento.Burbuja;
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

//        int limite = 250000;
//        int[] auxpeor;
//        int[] tiempopeor = new int[limite];
//        int[] auxmejor;
//        int[] tiempomejor = new int[limite];
//        int[] auxmedio;
//        int[] tiempomedio = new int[limite];
//        BusquedaSecuencial b1 = new BusquedaSecuencial();
// BusquedaSecuencial b2 = new BusquedaSecuencial();
//  BusquedaSecuencial b3 = new BusquedaSecuencial();
//        for (int j = 0; j < limite; j++) {
//             auxpeor = GeneradorDatos.generarArregloIntPeorCaso(6, j + 1, 1000);
//             auxmejor = GeneradorDatos.generarArregloIntMejorCaso(6, j + 1, 1000);
//             auxmedio = GeneradorDatos.generarArregloIntMedioCaso(6, j + 1, 1000);
//             int pos = b1.buscar(auxpeor, 6);
//             int pos1 = b2.buscar(auxmejor, 6);
//             int pos2 = b3.buscar(auxmedio, 6);
//              tiempopeor[j] = (int) b1.gettTotal();
//              tiempomejor[j] = (int) b2.gettTotal();
//              tiempomedio[j] = (int) b3.gettTotal();
//        }

       int n = 10000;
        int[] aux;
        double[] tiempos = new double[n];
        Burbuja b = new Burbuja();
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
            //System.out.println("j= "+j+" :"+tiempos[j]);
        }  
      GraficaTiempo miGraficador = new GraficaTiempo(tiempos, "Peor");
        miGraficador.pack();
        RefineryUtilities.centerFrameOnScreen(miGraficador);
        miGraficador.setVisible(true);
       
       
    }

      

//        GraficaTiempo miGraficador1 = new GraficaTiempo(tiempomejor, "Mejor");
//        miGraficador1.pack();
//        RefineryUtilities.centerFrameOnScreen(miGraficador1);
//        miGraficador1.setVisible(true);
//
//        GraficaTiempo miGraficador2 = new GraficaTiempo(tiempomedio, "Medio");
//        miGraficador2.pack();
//        RefineryUtilities.centerFrameOnScreen(miGraficador2);
//        miGraficador2.setVisible(true);
//
//    }

}
