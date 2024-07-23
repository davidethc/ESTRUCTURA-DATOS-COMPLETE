/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numerotope;

/**
 *
 * @author monkyd
 */
class Nodo {
    int dato;
    Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        izquierda = derecha = null;
    }
}