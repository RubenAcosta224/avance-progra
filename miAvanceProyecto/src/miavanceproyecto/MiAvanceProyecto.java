/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miavanceproyecto;

import Clases.Energia_cuantizada;
import Clases.Teoria_ondulatoria_de_la_luz;
import java.util.Scanner;

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

        //530 nm
        Teoria_ondulatoria_de_la_luz FreccOnda=new Teoria_ondulatoria_de_la_luz(0.000000530);
        
        System.out.println(FreccOnda.LongOnda());
        
        //1.2*E13
        Teoria_ondulatoria_de_la_luz LongOnda=new Teoria_ondulatoria_de_la_luz(1.2*(Math.pow(10, 13)));
        
        //Poner que determine infrarrojo y esas cosas
        System.out.println(LongOnda.LongOnda());
        
        
        
        
        //-----------------------
        
        Energia_cuantizada energia1=new Energia_cuantizada(3.25*(Math.pow(10, -7)));
        
        System.out.println("Energia: "+energia1.energia_por_longOnda());
        
        Energia_cuantizada longOnda1=new Energia_cuantizada(7.84*(Math.pow(10, -18)));
        
        System.out.println("Long onda: "+longOnda1.longOnda_por_energia());
        
        

//{
////Energia cuantizada
////E=hv
//
//    double h=6.626*(Math.pow(10, -34));
//    double e;
//    double v;
//
////E
//{
//    v=2.72*(Math.pow(10, 13));
//    
//    e=h*v;
//    
//    System.out.println("Energia: "+e);
//}
//
////v
//{
//    e=7.84*(Math.pow(10, -18));
//    
//    v=e/h;
//    
//    System.out.println("Frecuencia: "+v);
//}
//
//}
//        
//        
//
//
//
//
//
//
//
//
//
//{
//   Scanner leer = new Scanner(System.in);
// 
//    double RH =2.18*Math.pow(10,-18);
//    double nI,nF;
////   
//    System.out.println("Nivel inicial:");
//    nI = leer.nextInt();
//    
//    System.out.println("Nivel final:");
//     nF = leer.nextInt();
////     
//    double  E1 = (1/(nI*nI))-(1/(nF*nF));
//    double E2 = RH*E1;
////
//
//    System.out.println("La energia es de: " +E2+ " Joules");
//    
//     if (nI<nF){
//         System.out.println("Absorbe energía.");       
//     } else if (nI>nF){
//         System.out.println("Libera energía.");     
//     }
//   
// 
//}
//
//   
//    
//    
//   
    }
    
}
