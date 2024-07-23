/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerotope;

/**
 *
 * @author monkyd
 */
public class NumeroTope {

    public static void main(String[] args) {
   Lista arbol = new Lista();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Árbol en orden:");
        arbol.imprimirEnOrden();

        System.out.println("\nEl mayor valor en el árbol es: " + arbol.encontrarMayor());
        System.out.println("El menor valor en el árbol es: " + arbol.encontrarMenor());
    }
}
