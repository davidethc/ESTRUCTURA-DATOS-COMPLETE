
package listaCircularDoble;

public class Ejecutor {
    public static void main(String[] args) {
        ListaCircularDoble listaCircularDoble = new ListaCircularDoble();

        listaCircularDoble.insertarNodo(5);
        listaCircularDoble.mostrarNodo();
        System.out.println("----");
        
        listaCircularDoble.insertarNodo(10);
        listaCircularDoble.mostrarNodo();
        System.out.println("----");
        
        listaCircularDoble.insertarNodo(14);
        listaCircularDoble.mostrarNodo();
        System.out.println("----");
        
        listaCircularDoble.eliminarNodo(5);
        listaCircularDoble.mostrarNodo();
    }
}
