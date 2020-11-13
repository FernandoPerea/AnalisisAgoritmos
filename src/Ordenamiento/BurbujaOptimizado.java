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
public class BurbujaOptimizado {
      
   
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public BurbujaOptimizado() {
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
  
      int AUX;
      int N=0;
      int bandera=1;

      for(int paso=0 ; paso< (datos.length-1) && bandera==1 ;paso++) {
	bandera=0;
	for(int j=0;j<(datos.length-paso-1) ;j++){
		if(datos[j]>datos[j+1])
		  {
			bandera=1; /* indica si se han realizados cambios o no */
			AUX=datos[j];
			datos[j]=datos[j+1];
			datos[j+1]=AUX;
		  }
	  }
         }
    }   
  
}
