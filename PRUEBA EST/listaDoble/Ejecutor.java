package listaDoble;

public class Ejecutor {
    public static void main(String[] args) {
        listaDoblementeEnlazada listaDoble = new listaDoblementeEnlazada();

        listaDoble.insertarNodo(5);
        listaDoble.mostrarNodo();
        System.out.println("----");
        
        listaDoble.insertarNodo(10);
        listaDoble.mostrarNodo();
        System.out.println("----");
        
        listaDoble.insertarNodo(14);
        listaDoble.mostrarNodo();
        System.out.println("----");
        
        listaDoble.eliminarNodo(5);
        listaDoble.mostrarNodo();
    }
}