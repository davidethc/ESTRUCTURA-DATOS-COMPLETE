package listaDoble;

public class listaDoblementeEnlazada {

    Nodo cabeza;
    Nodo cola; // Referencia al último nodo para facilitar las inserciones al final

    public listaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    public void insertarNodo(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.next = nuevoNodo;
            nuevoNodo.prev = cola;
            cola = nuevoNodo;
        }
    }

    public void eliminarNodo(int d) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // Caso 1: El nodo a eliminar es la cabeza
        if (cabeza.dato == d) {
            cabeza = cabeza.next;
            if (cabeza != null) {
                cabeza.prev = null;
            } else {
                cola = null; // Si la lista se queda vacía
            }
            return;
        }

        Nodo actual = cabeza;

        // Buscar el nodo a eliminar
        while (actual != null && actual.dato != d) {
            actual = actual.next;
        }

        // Si el nodo a eliminar no se encuentra
        if (actual == null) {
            System.out.println("Nodo a eliminar no encontrado");
            return;
        }

        // Caso 2: El nodo a eliminar está en alguna otra posición
        if (actual.next != null) {
            actual.next.prev = actual.prev;
        } else {
            cola = actual.prev; // Si el nodo a eliminar es la cola
        }

        if (actual.prev != null) {
            actual.prev.next = actual.next;
        }
    }

    public void mostrarNodo() {
        if (cabeza == null) {
            System.out.println("La lista esta vacía");
            return;
        }
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print("[" + actual.dato + " ]<->");
            actual = actual.next;
        }
        System.out.println("");
    }
}
