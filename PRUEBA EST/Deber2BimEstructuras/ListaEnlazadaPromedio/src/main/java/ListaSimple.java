
public class ListaSimple {

    Nodo cabeza;

    public ListaSimple() {
        cabeza = null;

    }

   public void insertar (double nota){
       Nodo nuevo1 = new Nodo (nota);
       if (cabeza==null){
           cabeza= nuevo1;
       }else {
           Nodo ultimo = cabeza;
           while (ultimo.siguiente != null){
               ultimo = ultimo.siguiente;
           }
           ultimo.siguiente = nuevo1;
       }
   }
    
public  void imprimirLista (){
    Nodo actual;
    actual=cabeza;
    System.out.println("Lista enlaza simple ");
    while(actual !=null){
        System.out.println("Nota : "+actual.nota+" ");
        actual=actual.siguiente;
        
    }
    System.out.println("");
    
    

            
         
}
    
    public void promedioNotas(){
        int contador;
        double re;
        re=0;
        contador=0;
        Nodo recorre;
        
        recorre = cabeza;
        double fin;
        while(recorre != null){
            contador=contador+1;
            re = re+recorre.nota;
            recorre=recorre.siguiente;
        }
        fin = re/contador;
        System.out.println("el promedio es "+fin);
    }
      public static void main(String[] args) {
          
          ListaSimple lis = new ListaSimple();
          lis.insertar(10);
          lis.insertar(5);
          lis.imprimirLista();
          lis.promedioNotas();
          
      }
      

}
