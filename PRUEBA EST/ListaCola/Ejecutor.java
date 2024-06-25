package ListaCola;

public class Ejecutor {
    public static void main(String[] args) {
        ColaCircularDoble cola = new ColaCircularDoble();

        cola.enqueue(5);
        cola.mostrarNodo();
        System.out.println("----");
        
        cola.enqueue(10);
        cola.mostrarNodo();
        System.out.println("----");
        
        cola.enqueue(14);
        cola.mostrarNodo();
        System.out.println("----");
        
        cola.dequeue();
        cola.mostrarNodo();
    }
}
