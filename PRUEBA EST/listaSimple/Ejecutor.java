package listaSimple;

public class Ejecutor {
    public static void main(String[] args) {
        ListaSimple listaSim = new ListaSimple();

        listaSim.insertarNodo(5);
        listaSim.mostrarNodo();
        System.out.println("----");
        
        listaSim.insertarNodo(10);
        listaSim.mostrarNodo();
        System.out.println("----");
        
        listaSim.insertarNodo(14);
        listaSim.mostrarNodo();
        System.out.println("----");
        
        listaSim.eliminarNodo(5);
        listaSim.mostrarNodo();
        
    }
    
    
}
