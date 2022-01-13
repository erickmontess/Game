
package proyectoultimo;

public class Jugador {
    private int aciertos;
    private int desaciertos;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
    
    
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    public void setDesaciertos(int desaciertos) {
        this.desaciertos = desaciertos;
    }

    public int getDesaciertos() {
        return desaciertos;
    }
    
    
    
    
    
    

    @Override
    public String toString() {
        return "Jugador: "+ nombre +  " Aciertos: "+aciertos+" desaciertos: "+this.desaciertos;
    }
    
}
