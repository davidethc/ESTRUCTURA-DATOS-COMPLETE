/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numerotope;

/**
 *
 * @author monkyd
 */
public class Lista {

   Nodo raiz;

    public Lista() {
        raiz = null;
    }

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return raiz;
        }
        if (dato < raiz.dato) {
            raiz.izquierda = insertarRec(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = insertarRec(raiz.derecha, dato);
        }
        return raiz;
    }

    public int encontrarMayor() {
        return encontrarMayorRec(raiz);
    }

    private int encontrarMayorRec(Nodo raiz) {
        if (raiz == null) {
            throw new RuntimeException("El árbol está vacío");
        }
        while (raiz.derecha != null) {
            raiz = raiz.derecha;
        }
        return raiz.dato;
    }

    public int encontrarMenor() {
        return encontrarMenorRec(raiz);
    }

    private int encontrarMenorRec(Nodo raiz) {
        if (raiz == null) {
            throw new RuntimeException("El árbol está vacío");
        }
        while (raiz.izquierda != null) {
            raiz = raiz.izquierda;
        }
        return raiz.dato;
    }

    public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
    }

    private void imprimirEnOrdenRec(Nodo raiz) {
        if (raiz != null) {
            imprimirEnOrdenRec(raiz.izquierda);
            System.out.print(raiz.dato + " ");
            imprimirEnOrdenRec(raiz.derecha);
        }
    }
}