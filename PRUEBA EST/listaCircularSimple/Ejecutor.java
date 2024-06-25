package listaCircularSimple;

public class Ejecutor {
    public static void main(String[] args) {
        listaCircularSimple listaCircular = new listaCircularSimple();

        listaCircular.insertarNodo(5);
        listaCircular.mostrarNodo();
        System.out.println("----");
        
        listaCircular.insertarNodo(10);
        listaCircular.mostrarNodo();
        System.out.println("----");
        
        listaCircular.insertarNodo(14);
        listaCircular.mostrarNodo();
        System.out.println("----");
        
        listaCircular.eliminarNodo(5);
        listaCircular.mostrarNodo();
    }
}
