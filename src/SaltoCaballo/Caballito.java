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
    int Mmovpos=1;

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
     int cont=1;
     public void recorrido(){
         for (int i=0;i<tablero.length;i++){
             for(int j = 0;j<tablero.length;j++){
                tablero[i][j] = 0;
             }
         }
        
       tablero[x][y]=cont;
              cont = cont+1;

       while(cont <=this.tamtab && this.Mmovpos!=0 ){
       formaavanza(x,y);
       cont = cont+1;}
       
       
       System.out.println(); 
     }

     public void formaavanza(int x, int y){
     Coordenadas[] posibles= {new Coordenadas(new double[] {x+2,y+1}),
                              new Coordenadas(new double[] {x+2,y-1}),
                              new Coordenadas(new double[] {x+1,y-2}),
                              new Coordenadas(new double[] {x-1,y-2}),
                              new Coordenadas(new double[] {x-2,y-1}),
                              new Coordenadas(new double[] {x-2,y+1}),
                              new Coordenadas(new double[] {x-1,y+2}),
                              new Coordenadas(new double[] {x+1,y+2})};
     int movpos=0;
     this.Mmovpos=0;
     double xaux=x,yaux=y;
     for(int i = 0;i<posibles.length;i++){
     if(posibles[i].getVector()[0]<tablero.length && posibles[i].getVector()[1]<tablero.length &&  posibles[i].getVector()[0]>=0 &&  posibles[i].getVector()[1]>=0){
          if(tablero[(int)posibles[i].getVector()[0]][(int) posibles[i].getVector()[1]] == 0 ){
                    movpos = numMovs(posibles[i].getVector()[0],posibles[i].getVector()[1]);
                    if(Mmovpos<movpos){
                    Mmovpos = movpos;
                    xaux=posibles[i].getVector()[0];
                    yaux=posibles[i].getVector()[1];
                    }else if(Mmovpos ==0){
                     xaux=posibles[i].getVector()[0];
                    yaux=posibles[i].getVector()[1];
                    }
          }
          }
     
     }
     this.x = (int)xaux;
     this.y = (int)yaux;
     this.tablero[this.x][this.y]=cont;
         System.out.println("x: "+xaux+" y: "+yaux+" Movs: "+Mmovpos);
     }
     public int numMovs(double x , double y){
     Coordenadas[] posibles= {new Coordenadas(new double[] {x+2,y+1}),
                              new Coordenadas(new double[] {x+2,y-1}),
                              new Coordenadas(new double[] {x+1,y-2}),
                              new Coordenadas(new double[] {x-1,y-2}),
                              new Coordenadas(new double[] {x-2,y-1}),
                              new Coordenadas(new double[] {x-2,y+1}),
                              new Coordenadas(new double[] {x-1,y+2}),
                              new Coordenadas(new double[] {x+1,y+2})};
       int mvs=0;
       
         for(int i = 0 ;i<T.length;i++){
              if(posibles[i].getVector()[0]<tablero.length && posibles[i].getVector()[1]<tablero.length && posibles[i].getVector()[0]>=0 &&  posibles[i].getVector()[1]>=0){
              if(tablero[(int)posibles[i].getVector()[0]][(int)posibles[i].getVector()[1]] == 0 ){
                mvs++;}
          }
}    System.out.println("Para coordenada:"+x+","+y+"Tiene: "+mvs);
             return mvs;

}
     public void imprimirtablero(){
     for (int i=0;i<tablero.length;i++){
         for(int j = 0;j<tablero.length;j++){
             if(tablero[j][i]<10){
            System.out.print(tablero[j][i]+"  | ");}
             else if(tablero[j][i]>=10 &&tablero[j][i]<=99){
              System.out.print(tablero[j][i]+" | ");
             }
            else if(tablero[j][i]>99){
             System.out.print(tablero[j][i]+"| ");
             }
            }
          System.out.println();
         }
    
    }
    

}

