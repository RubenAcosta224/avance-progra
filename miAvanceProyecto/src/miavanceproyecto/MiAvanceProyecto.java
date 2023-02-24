/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miavanceproyecto;

/**
 *
 * @author dell
 */
public class MiAvanceProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Por ahora asi de sencillo, solo formulas, luego mas funciones e interfaz
        


        //Formula principal c=L V
        
        double c=3*(Math.pow(10, 8));//velocidad luz m/s
        double l;//long onda
        double v;//frecuencia radiacion
//        double res;





        
//        System.out.println(c);
        
//        sacar long onda L
        //L = c/v
        
        {
            v=1.2*(Math.pow(10, 13));
            
            l=c/v;
            System.out.println("Long onda: "+l);
        }
        
        
//sacer frecuencia radiacion
        //v= c/L
        {
            l=5.3*(Math.pow(10, -7));
            
            v=c/l;
            System.out.println("Frecc radiacion: "+v);
        }
    }
    
}
