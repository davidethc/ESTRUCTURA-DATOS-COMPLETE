/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaPila;

public class PilaCircularDoble {

    Nodo cabeza;

    public PilaCircularDoble() {
        cabeza = null;
    }

    public void push(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.next = nuevoNodo;
            nuevoNodo.prev = nuevoNodo;
        } else {
            Nodo ultimo = cabeza.prev;
            nuevoNodo.next = cabeza;
            nuevoNodo.prev = ultimo;
            cabeza.prev = nuevoNodo;
            ultimo.next = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    public void pop() {
        if (cabeza == null) {
            System.out.println("La pila está vacía");
            return;
        }

        if (cabeza.next == cabeza) { // Solo hay un nodo en la lista
            cabeza = null;
        } else {
            Nodo ultimo = cabeza.prev;
            cabeza = cabeza.next;
            cabeza.prev = ultimo;
            ultimo.next = cabeza;
        }
    }

    public void mostrarNodo() {
        if (cabeza == null) {
            System.out.println("La pila está vacía");
            return;
        }
        Nodo actual = cabeza;

        do {
            System.out.print("[" + actual.dato + " ]->");
            actual = actual.next;
        } while (actual != cabeza);
        System.out.println("");
    }
}

