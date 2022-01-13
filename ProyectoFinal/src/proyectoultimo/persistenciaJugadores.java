
package proyectoultimo;

import java.util.ArrayList;

public class persistenciaJugadores {
    private static ArrayList<Jugador> arrayJugador=new ArrayList();
    
    public static void agregarJugador(Jugador jugador){
        arrayJugador.add(jugador);
    }

    public static String listaJugadores(){
        String h="";
        
        for (Jugador jugador : arrayJugador) {
            h+=jugador.toString()+"\n";
        }
        return h;
    }
}
//    
//    public static String ordenar(){
//       
//        String hilera="";
//        for (int i = 0; i < arrayJugador.size(); i++) {
//            hacer or
//             
//    
//            
//            
//            
//            
//        
//        int contador=0;
//        for (Jugador jugador : arrayJugador) {
//            contador++;
//            while(contador<5){
//            hilera+=jugador.getNombre()+"\n";
//            }
//        }
//        
//        }  
//        return hilera;
//    
//}
//}
