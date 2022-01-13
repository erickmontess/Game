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
public class AmbasManos {
    
     private  String nivel1 = "qwertQWERTYUIOPyuiop"; 
     private  String nivel2 = "ASDFGasdfghjklñHJKLÑ";
     private  String nivel3 = "zxcvbZXCVBNM,./nm";
     private  String todosLosNiveles = "QWERTASDFGZXCVBqwertasdfgzxcvbyuiophjklñnm,./YUIOPHJKLÑNM";
     
     
     
     public AmbasManos(){
         
         
         
         
     }
     
     
     
       public char teclasNivel1(){
        
        char letraNivel1;
        
        Random random = new Random();
       
        letraNivel1 = this.nivel1.charAt(random.nextInt(this.nivel1.length()));
       
        return letraNivel1;
       
    }
       
         public char teclasNivel2(){
        
        char letraNivel2;
        
        Random random = new Random();
       
        letraNivel2 = this.nivel2.charAt(random.nextInt(this.nivel2.length()));
       
        return letraNivel2;
       
    }
     
         
           public char teclasNivel3(){
        
        char letraNivel3;
        
        Random random = new Random();
       
        letraNivel3 = this.nivel3.charAt(random.nextInt(this.nivel3.length()));
       
        return letraNivel3;
       
    }
           
             public char teclasTodosLosNiveles(){
        
        char letraTodosLosNiveles;
        
        Random random = new Random();
       
        letraTodosLosNiveles = this.todosLosNiveles.charAt(random.nextInt(this.todosLosNiveles.length()));
       
        return letraTodosLosNiveles;
       
    }
     
}

