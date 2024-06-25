package ListaPila;

public class Nodo {
    int dato;
    Nodo next;
    Nodo prev; // Referencia al nodo anterior
    
    public Nodo(int d){
        dato = d;
        next = null;
        prev = null;
    }
}
