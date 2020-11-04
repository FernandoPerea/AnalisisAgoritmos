/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

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
       System.out.println(num1);
        
        for (int i = 1; i <= serie; i++) {
            
            System.out.println(suma);
            
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
}
