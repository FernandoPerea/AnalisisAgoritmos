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
public class Burbuja {
     
   
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Burbuja() {
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
  
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < datos.length; i++)
      {
        for(int j = 0;j < datos.length-i;j++)
        {
          if(datos[j] > datos[j+1])
          {
            auxiliar = datos[j];
            datos[j] = datos[j+1];
            datos[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = datos;
      }
}