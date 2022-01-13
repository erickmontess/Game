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
public enum TipoNivel {
    Nivel_1{
        @Override
        public String toString() {
            return "NIVEL 1";
        }
        
    },
    Nivel_2{
        @Override
    public String toString() {
        return "NIVEL 2";
    }
    },
    Nivel_3{
        @Override
    public String toString() {
        return "NIVEL 3";
    }
    },
    Todos_los_niveles{
        @Override
    public String toString() {
        return "TODOS LOS NIVELES";
    }
    };
}
