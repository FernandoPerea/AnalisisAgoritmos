/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class AlgoritmoDijkstra {
    
    
    private LinkedList<Integer> ciudadesDisponibles;
    private int numCiudades;

    public AlgoritmoDijkstra(int numCiudades) {
        this.numCiudades = numCiudades;
        this.ciudadesDisponibles = new LinkedList<>();
        for(int x= 0 ; x < numCiudades;x++ )
            this.ciudadesDisponibles.add(x);
        Camino.md = Mapa.generarMatrixDeDistancias(numCiudades);
        
    }
    
    public Camino buscarCamino (int ciudadInicial){
        
        Camino caminoSolucion = new Camino();
        caminoSolucion.agregarCiudad(ciudadInicial);
        this.ciudadesDisponibles.remove(ciudadInicial);
     
        while (!this.ciudadesDisponibles.isEmpty()){
          
        
        int ciudadUltima =  caminoSolucion.getCamino().getLast();
        int distMenor = Camino.md[ciudadUltima][this.ciudadesDisponibles.getFirst()]; 
        int iM = 0;
        for (int x = 1; x < this.ciudadesDisponibles.size();x++){
           if (Camino.md[this.ciudadesDisponibles.get(x)][ciudadUltima]<distMenor){
           distMenor = Camino.md[this.ciudadesDisponibles.get(x)][ciudadUltima];
           iM = x;
           }
         
         }
        caminoSolucion.agregarCiudad(this.ciudadesDisponibles.get(iM));
        this.ciudadesDisponibles.remove(iM);
        
        }
        
        caminoSolucion.agregarCiudad(ciudadInicial);
       
        
        return caminoSolucion;
    
    }
}
