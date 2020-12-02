/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dell
 */
public class Articulo {  
    
    private double valor;
    private int peso;

    public Articulo(int valor, int peso) {  //Constructor de Articulo 
        this.valor = valor;
        this.peso = peso;
    }

    public int getPeso() { //getters y setters de peso
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
   public double getValor() {                //Getters y Setters de peso
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    
    
    
   /* public static ArrayList<Articulo> generador(int num, int v, int p){ //Generador de articulos
        
        ArrayList<Articulo> articulos = new ArrayList<>();                  //ArrayList de articulos
        
        for(int i =0; i<num; i++){                  //Genera n articulos con valores y pesos randoms
             Random randPeso = new Random();
             Random randValor = new Random();
             Articulo ar= new Articulo(randValor.nextInt(v)+1,randPeso.nextInt(p)+1);
             articulos.add(ar);
        }
        return articulos; //retornamos articulos
    }*/
    
}
