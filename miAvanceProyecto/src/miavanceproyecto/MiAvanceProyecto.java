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
        //        Por ahora asi de sencillo, solo formulas, luego mas funciones e interfaz
{        


        //Formula principal c=L V
        
        double c=3*(Math.pow(10, 8));//velocidad luz m/s
        double l;//long onda
        double v;//frecuencia radiacion
//        double res;




//teoria ondulatoria
        
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
{
//Energia cuantizada
//E=hv

    double h=6.626*(Math.pow(10, -34));
    double e;
    double v;

//E
{
    v=2.72*(Math.pow(10, 13));
    
    e=h*v;
    
    System.out.println("Energia: "+e);
}

//v
{
    e=7.84*(Math.pow(10, -18));
    
    v=e/h;
    
    System.out.println("Frecuencia: "+v);
}

}
        
        









{
   Scanner leer = new Scanner(System.in);
 
    double RH =2.18*Math.pow(10,-18);
    double nI,nF;
//   
    System.out.println("Nivel inicial:");
    nI = leer.nextInt();
    
    System.out.println("Nivel final:");
     nF = leer.nextInt();
//     
    double  E1 = (1/(nI*nI))-(1/(nF*nF));
    double E2 = RH*E1;
//

    System.out.println("La energia es de: " +E2+ " Joules");
    
     if (nI<nF){
         System.out.println("Absorbe energía.");       
     } else if (nI>nF){
         System.out.println("Libera energía.");     
     }
   
 
}

   
    
    
   
    }
    
}
