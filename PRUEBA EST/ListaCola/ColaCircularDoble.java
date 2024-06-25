package ListaCola;

public class ColaCircularDoble {

    Nodo cabeza;

    public ColaCircularDoble() {
        cabeza = null;
    }

    public void enqueue(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.next = nuevoNodo;
            nuevoNodo.prev = nuevoNodo;
        } else {
            Nodo ultimo = cabeza.prev;
            ultimo.next = nuevoNodo;
            nuevoNodo.prev = ultimo;
            nuevoNodo.next = cabeza;
            cabeza.prev = nuevoNodo;
        }
    }

    public void dequeue() {
        if (cabeza == null) {
            System.out.println("La cola está vacía");
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
            System.out.println("La cola está vacía");
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

