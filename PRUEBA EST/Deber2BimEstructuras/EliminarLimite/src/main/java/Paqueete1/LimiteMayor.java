/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueete1;

import Paqueete1.Nodo;

/**
 *
 * @author monkyd
 */
public class LimiteMayor {

    Nodo cabeza = null;

    public LimiteMayor() {
        cabeza = null;
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        Nodo tem = cabeza;

        if (tem == null) {
            cabeza = nuevoNodo;
        } else {
            while (tem.obtenerSiguiente() != null) {
                tem = tem.obtenerSiguiente();
            }
            tem.enlazarSiguiente(nuevoNodo); 
        }
    }

    public void eliminarMayoresQue(int limite) {
        while (cabeza != null && cabeza.obtenerDato() > limite) {
            cabeza = cabeza.obtenerSiguiente();
        }

        Nodo actual = cabeza;
        while (actual != null && actual.obtenerSiguiente() != null) {
            if (actual.obtenerSiguiente().obtenerDato() > limite) {
                actual.enlazarSiguiente(actual.obtenerSiguiente().obtenerSiguiente()); 
            } else {
                actual = actual.obtenerSiguiente();
            }
        }
    }

    public void imprimir() {
        Nodo tem = cabeza;
        if (tem == null) {
            System.out.println("No hay lista.");
        } else {
            while (tem != null) {
                System.out.println("El dato es " + tem.obtenerDato());
                tem = tem.obtenerSiguiente();
            }
        }
    
    }
}