/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoultimo;

/**
 *
 * @author Erick Montes Pineda
 */
public enum TipoMano {
    IZQUIERDA{
        @Override
    public String toString() {
        return "IZQUIERDA";
    }
    },
    DERECHA{
        @Override
    public String toString() {
        return "DERECHA";
    }
    },
    AMBAS{
        @Override
    public String toString() {
        return "AMBAS";
    }
    };
}
