/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public class MochilaDinamica {

    private ArrayList<Articulo> articulos;
    private ArrayList<Articulo> artSolucion;
    private int[][] mBeneficios;
    private int _W;

    public MochilaDinamica(ArrayList<Articulo> articulos, int _W) { //Constructor de la clase con el tamaño _W y los articulos
        this.articulos = articulos;
        this._W = _W;
        generadorMatriz();

    }
 public void imprimirArticulos() {
        System.out.println("Articulo   Valor    Peso  ");
        for (int i = 0; i < articulos.size(); i++) {

            System.out.println("    " + i + "      " + articulos.get(i).getValor() + "      " + articulos.get(i).getPeso());

        }
    }
    private void generadorMatriz() {

        this.mBeneficios = new int[this.articulos.size() + 1][this._W + 1]; 

        for (int i = 0; i <= this.articulos.size(); i++) 
        {
            this.mBeneficios[i][0] = 0;
        }

        for (int x = 0; x <= this._W; x++) 
        {
            this.mBeneficios[0][x] = 0;
        }

    }

    public void buscarSolucion() {

        for (int i = 1; i <= this.articulos.size(); i++) {
            for (int w = 0; w <= this._W; w++) {

                if (this.articulos.get(i - 1).getPeso() <= w) {  

                    if ((this.articulos.get(i - 1).getValor() + this.mBeneficios[i - 1][w - this.articulos.get(i - 1).getPeso()]) > this.mBeneficios[i - 1][w]) 
                            {
                        this.mBeneficios[i][w] = (int) this.articulos.get(i - 1).getValor() + this.mBeneficios[i - 1][w - this.articulos.get(i - 1).getPeso()]; 

                    } else {

                        this.mBeneficios[i][w] = this.mBeneficios[i - 1][w]; 

                    }

                } else {
                    this.mBeneficios[i][w] = this.mBeneficios[i - 1][w]; 
                }

            }
        }

        this.artSolucion = new ArrayList<>();

        int i = this.articulos.size();
        int j = this._W;
        System.out.println("Matriz de Beneficios");
        for (int k = 0; k < i + 1; k++) {
            for (int l = 0; l < j + 1; l++) {
                System.out.print(this.mBeneficios[k][l] + ", ");
            }
            System.out.println();
        }
        
    

        }
     public void CUPO(){
         
         int i=this.articulos.size();
         int j=this._W;
         int cont = 0;
         
         System.out.println("El valor máximo que puede llevar es:"+mBeneficios[i][j]+"\nLos articuos agregados son:");
       while(i >0 && j>0){
              if(this.mBeneficios[i][j] != this.mBeneficios[i-1][j] ){
              this.artSolucion.add(this.articulos.get(i-1));
               System.out.println("Art# "+(i-1)+" con peso : "+this.artSolucion.get(cont).getPeso()+" y valor : "+this.artSolucion.get(cont).getValor());
              i=i-1;
              j=j-this.articulos.get(i).getPeso();
              cont++;
              }
              else{
              i=i-1;
              }
            }

       
     }




    
    
}