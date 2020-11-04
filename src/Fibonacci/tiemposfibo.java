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
public class tiemposfibo {
     public long tInicio;
    public long tFinal;
    public long tTotal;

    public tiemposfibo() {

    }

    public double doitrecur(int x) {
        this.tInicio = System.currentTimeMillis();
        double pos = Fibonacci.fibonacciRecursivo(x);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return pos;
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
    
}

