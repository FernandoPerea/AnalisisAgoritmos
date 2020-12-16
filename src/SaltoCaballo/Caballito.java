/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaltoCaballo;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Caballito {
    double [][] tablero ; 
    int tamtab;
    int x;
    int y;
    Coordenadas[] T= {new Coordenadas(new double[] {2,1}),
                      new Coordenadas(new double[] {2,-1}),
                      new Coordenadas(new double[] {1,-2}),
                      new Coordenadas(new double[] {-1,-2}),
                      new Coordenadas(new double[] {-2,-1}),
                      new Coordenadas(new double[] {-2,1}),
                      new Coordenadas(new double[] {-1,2}),
                      new Coordenadas(new double[] {1,2})};
    
     public Caballito(int l, int ix , int iy ) {
        this.tablero =  new double[l][l];
        this.tamtab = l*l;
        this.x=ix;
        this.y=iy;
     }
    
     public void recorrido(){
         int cont=1;
       tablero[x][y]=cont;
       
       
       formaavanza(x,y);
       tablero[x][y]=cont;
       
       
       System.out.println(); 
     }

     public void formaavanza(int x, int y){
      double nx = x;
      double ny = y;
      int Mvs=0;
   
      for(int i = 0 ;i<T.length;i++){
          nx = nx+T[i].getVector()[0];
          ny = ny + T[i].getVector()[1];
          if(tablero[(int)nx][(int)ny] == 0 && nx>=0 && ny>=0){
                if(numMovs(nx,ny)>Mvs){
                    Mvs=numMovs(nx,ny);
                    this.x = (int)nx;
                    this.y = (int)ny;
                
                }
          }
      }
     }
      public int numMovs(double x , double y){
     
       int mvs=0;
         for(int i = 0 ;i<T.length;i++){
          x = x+ T[i].getVector()[0];
          y = y + T[i].getVector()[1];
          if(tablero[(int)x][(int)y] == 0 && x>=0 && y>=0){
                mvs++;
          }

}
             return mvs;

}
    
    

}

