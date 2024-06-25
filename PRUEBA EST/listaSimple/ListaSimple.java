package listaSimple;

public class ListaSimple {

    Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void insertarNodo(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temporal = cabeza;
            while (temporal.next != null) {
                temporal = temporal.next;               
            }
            temporal.next = nuevoNodo;
        }
    }

    public void eliminarNodo(int d) {
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return;
        }

        // Caso 1: El nodo a eliminar es la cabeza
        if (cabeza.dato == d) {
            cabeza = cabeza.next;
            return;
        }

        // Caso 2: El nodo a eliminar está en alguna otra posición
        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null && actual.dato != d) {
            anterior = actual;
            actual = actual.next;
        }

        // Si el nodo a eliminar no se encuentra
        if (actual == null) {
            System.out.println("Nodo a eliminar no encontrado");
            return;
        }

        // Desconecta el nodo a eliminar
        anterior.next = actual.next;
    }

    public void mostrarNodo() {
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo actual = cabeza;

        do {
            System.out.print("[" + actual.dato + " ]->");
            actual = actual.next;
        } while (actual != null);
        System.out.println("");
    }
}
