/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author Dell
 */
public class InsertSort {
     public long tInicio;
    public long tFinal;
    public long tTotal;

    public InsertSort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void ordenar(int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
     
    public void ordenarM_m(int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatosM_m(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }

    private void ordenarDatos(int[] datos) {
        int n = datos.length;  
        for (int j = 1; j < n; j++) {  
            int aux = datos[j];  
            int i = j-1;  
            while ( (i > -1) && ( datos [i] > aux ) ) {  
                datos [i+1] = datos [i];  
                i--;  
            }  
            datos[i+1] = aux;  
        }  
      
      }
     public int[] ordenarDatosM_m(int[] datos) {// mejor de los casos 2 + 3n + 7n^2
  int n = datos.length;  
        for (int j = 1; j < n; j++) {  
            int aux = datos[j];  
            int i = j-1;  
while (j > 0 && datos[j - 1] < aux) {
    datos [i+1] = datos [i];
 
                i--;  
            }  
            datos[i+1] = aux;  
        }  
     return datos;
      }
}
