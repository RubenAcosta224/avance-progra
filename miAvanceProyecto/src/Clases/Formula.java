/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author dell
 */
public abstract class Formula {
    //clase principal
    
    private double numEntrada;

    public Formula(double numEntrada) {
        this.numEntrada = numEntrada;
    }
    
        public Formula() {
        this.numEntrada = 0;
    }

    public double getNumEntrada() {
        return numEntrada;
    }

    public void setNumEntrada(double numEntrada) {
        this.numEntrada = numEntrada;
    }

    


   
    
    
    
    
    public abstract double evaluarSalida();

    

    
}
