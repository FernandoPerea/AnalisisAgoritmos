/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class Fibonacci {
   
    public long tInicio;
    public long tFinal;
    public long tTotal;
public Fibonacci() {
        this.tInicio = 0;
        this.tFinal = 0;
        this.tTotal = 0 ;
    }

 public void doitrecur(int x) {
        this.tInicio = System.currentTimeMillis();
         for (int i = 0; i <= x; i++) {
       Fibonacci.fibonacciRecursivo(i);
         }
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
  public void doititera(int serie, double num1, double num2, double suma) {
        this.tInicio = System.currentTimeMillis();
        Fibonacci.FiboIterativo(serie, num1, num2, suma);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
       
    }
  
   public void doitrecurdina(int x) {
        this.tInicio = System.currentTimeMillis();
         for (int i = 0; i <= x; i++) {
    Fibonacci.fibonacciRecursivoDinamico(i);
         }
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
  public void doititeradina(int serie) {
        this.tInicio = System.currentTimeMillis();
       Fibonacci.FiboIterativoDinamico(serie);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
       
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }

    public long gettTotal() {
        return tTotal;
    }
    

public static void FiboIterativo(int serie, double num1, double num2, double suma){

       
        
        for (int i = 0; i < serie; i++) {
            
            
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            
          }
    }
public  static double fibonacciRecursivo(int n) {
 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tamvien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
    }
public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

  public static int FiboIterativoDinamico(int n) {
    hm.put(0, 0);
    hm.put(1, 1);
            
    for(int i = 2; i <= n; i++) {
         
      hm.put(i, hm.get(i - 1) + hm.get(i - 2));
    }

    return hm.get(n);
  }
  
  public static int fibonacciRecursivoDinamico(int n) {
    if(hm.containsKey(n)) return hm.get(n);
    if(n == 0) return 0;
    if(n == 1) return 1;
    int nthValue = fibonacciRecursivoDinamico(n - 1) + fibonacciRecursivoDinamico(n - 2);
    hm.put(n, nthValue);
    return nthValue;
  }
}
