/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueete1;

/**
 *
 * @author monkyd
 */
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int obtenerDato() {
        return dato;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public void enlazarSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}