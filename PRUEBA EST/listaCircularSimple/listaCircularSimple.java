package listaCircularSimple;

public class listaCircularSimple {

    Nodo cabeza;

    public listaCircularSimple() {
        cabeza = null;
    }

    public void insertarNodo(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.next = cabeza; // El nuevo nodo apunta a sí mismo
        } else {
            Nodo temporal = cabeza;
            while (temporal.next != cabeza) {
                temporal = temporal.next;
            }
            temporal.next = nuevoNodo;
            nuevoNodo.next = cabeza; // El nuevo nodo apunta a la cabeza
        }
    }

    public void eliminarNodo(int d) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // Caso 1: El nodo a eliminar es la cabeza
        if (cabeza.dato == d) {
            if (cabeza.next == cabeza) { // Solo hay un nodo en la lista
                cabeza = null;
            } else {
                Nodo temporal = cabeza;
                while (temporal.next != cabeza) {
                    temporal = temporal.next;
                }
                cabeza = cabeza.next;
                temporal.next = cabeza;
            }
            return;
        }

        Nodo actual = cabeza;

        // Buscar el nodo a eliminar
        while (actual.next != cabeza && actual.next.dato != d) {
            actual = actual.next;
        }

        // Si el nodo a eliminar no se encuentra
        if (actual.next == cabeza) {
            System.out.println("Nodo a eliminar no encontrado");
            return;
        }

        // Caso 2: El nodo a eliminar está en alguna otra posición
        actual.next = actual.next.next;
    }

    public void mostrarNodo() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo actual = cabeza;

        do {
            System.out.print("<-[" + actual.dato + " ]->");
            actual = actual.next;
        } while (actual != cabeza);
        System.out.println("");
    }
}

