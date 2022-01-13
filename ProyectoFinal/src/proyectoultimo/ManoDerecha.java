/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoultimo;

import java.util.Random;

/**
 *
 * @author Erick Montes Pineda
 */
public class ManoDerecha {
 
   private   String nivel1 = "qwertQWERT";
   private   String nivel2 = "ASDFGasdfg";
   private   String nivel3 = "zxcvbZXCVB";
   private   String todosLosNiveles = "QWERTASDFGZXCVBqwertasdfgzxcvb";
    
   public ManoDerecha(){
       
       
   }
   
   
   public char teclasNivel1(){
       
       char letraNivel1;
       
       Random random = new Random();
       
       letraNivel1 = nivel1.charAt(random.nextInt(nivel1.length()));
       
       return letraNivel1;
   }
   
   
   
     public char teclasNivel2(){
       
       char letraNivel2;
       
       Random random = new Random();
       
       letraNivel2 = nivel2.charAt(random.nextInt(nivel2.length()));
       
       return letraNivel2;
   }
     
     
       public char teclasNivel3(){
       
       char letraNivel3;
       
       Random random = new Random();
       
       letraNivel3 = nivel3.charAt(random.nextInt(nivel3.length()));
       
       return letraNivel3;
   }
       
       
       
        public char teclasTodosLosNiveles(){
       
       char letraTodosLosNiveles;
       
       Random random = new Random();
       
       letraTodosLosNiveles = todosLosNiveles.charAt(random.nextInt(todosLosNiveles.length()));
       
       return letraTodosLosNiveles;
   }
        
        
}
    
