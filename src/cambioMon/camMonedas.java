/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambioMon;

/**
 *
 * @author Dell
 */
public class camMonedas {
    
    private int[][] posibles;
    private int[] monedas;
    private int dinero;
    private int[] cambiototal;

    public camMonedas(int dinero, int[]  monedas){
        this.dinero = dinero;
        this.monedas = monedas;
        posibles = calcularMonedas(dinero, monedas);
        cambiototal = cambio(monedas, posibles,dinero);
    }

    public int[][] calcularMonedas(int dinero, int[]  monedas){
        int[][] posibles = new int[monedas.length + 1][dinero + 1];
        for (int i = 0; i < monedas.length; i++)
            posibles[i][0] = 0;
        for (int j = 1; j <= dinero; j++)
            posibles[0][j] = 1000;

        for (int i = 1; i <= monedas.length; i++)
            for (int j = 1; j <= dinero; j++) {
                if (j < monedas[i - 1]) {
                    posibles[i][j] = posibles[i - 1][j];
                } else {
                    int minimo = 0;
                    minimo = min(posibles[i - 1][j] , posibles[i][j- monedas[i - 1]] + 1);
                    posibles[i][j] = minimo;
                }
        }
        return posibles;
    }

    public int[] cambio( int[] monedas, int[][]tabla,int dinero ){
        int mon,j;
        int[] cambio = new int[monedas.length];
        
        for(int i = 0; i< monedas.length; i++){           
            cambio[i]=0;    
        } 
           mon= monedas.length;      
           j= dinero;        
        
           while(j>0){
            if(mon>=1 && tabla[mon][j]==tabla[mon-1][j]){
               mon--;
               if(mon==0){
                 System.out.println("No es posible dar cambio");
                 j=0;
                 break;
                 }
            } else{
                
                cambio[mon-1]++;
                j = j - monedas[mon-1];
            }
        }

        return cambio;
    }

    public int min(int a, int b){
        if(a<b)
            return a;

        else
            return b;
    }

public void imprimir(){
    System.out.println("Cambio para: "+dinero);
    for(int i = 0 ;i<monedas.length;i++){
 
        System.out.println("Da la moneda de "+monedas[i]+", "+cambiototal[i]+" veces");

 
}
		
	}
}
 
	
 
	