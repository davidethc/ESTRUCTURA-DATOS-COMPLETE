package ListaPila;

public class Ejecutor {
    public static void main(String[] args) {
        PilaCircularDoble pila = new PilaCircularDoble();

        pila.push(5);
        pila.mostrarNodo();
        System.out.println("----");
        
        pila.push(10);
        pila.mostrarNodo();
        System.out.println("----");
        
        pila.push(14);
        pila.mostrarNodo();
        System.out.println("----");
        
        pila.pop();
        pila.mostrarNodo();
    }
}

