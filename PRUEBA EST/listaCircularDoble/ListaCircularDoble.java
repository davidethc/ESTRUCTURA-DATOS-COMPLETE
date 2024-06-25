package listaCircularDoble;

public class ListaCircularDoble {

    Nodo cabeza;

    public ListaCircularDoble() {
        cabeza = null;
    }

    public void insertarNodo(int d) {
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

    public void eliminarNodo(int d) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        do {
            if (actual.dato == d) {
                if (actual.next == actual) { // Solo hay un nodo en la lista
                    cabeza = null;
                } else {
                    Nodo anterior = actual.prev;
                    Nodo siguiente = actual.next;

                    anterior.next = siguiente;
                    siguiente.prev = anterior;

                    if (actual == cabeza) {
                        cabeza = siguiente;
                    }
                }
                return;
            }
            actual = actual.next;
        } while (actual != cabeza);

        System.out.println("Nodo a eliminar no encontrado");
    }

    public void mostrarNodo() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo actual = cabeza;

        do {
            System.out.print("<->[" + actual.dato + " ]<->");
            actual = actual.next;
        } while (actual != cabeza);
        System.out.println("");
    }
}
