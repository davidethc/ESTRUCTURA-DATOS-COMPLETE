
public class ListaCircular {
      Nodo head = null;
    Nodo tail = null;
        
        //Insertar un nodo a la lista
    public void insert(int data) {  
        //Crear un nuevo nodo 
        Nodo newNode = new Nodo(data);  
  
        //Si la lista está vacía
        if(head == null) {  
            //Head y tail apuntan o newNode  
            head = tail = newNode;  
            //previos de head apunta null  
            head.previous = tail;  
            //next de tail apunta a null, es el ultmo nodo de la  lista  
            tail.next = head;  
        }  
        else {  
            //el nuevo nodo debe ser añadido luego de tail,
            //el siguiente de tail pauntara alnewNode  
            tail.next = newNode;  
            //el previo de newNode a puntará a tail  
            newNode.previous = tail;  
            //newNode se convierte en tail  
            tail = newNode;  
            //como tail es el ultimo nodo ahora next de tail debe apuntar a null  
            tail.next = head;
            head.previous = tail; 
        }  
    } 
    
    //Imprimir
    public void print() {  
        //current apunta a head  
        Nodo current = head;  
        if(head == null) {  
            System.out.println("Lista está vacía");  
            return;  
        }  
        System.out.println("Nodes de doble linked: ");  
        while(current != null ) {  
            if (current.next!=head){
                System.out.print(current.data + " ");  
                current = current.next;  
            }
            else{
                System.out.print(current.data + " ");  
                return;}
        }  
        
         System.out.println("\n");
    }   
    // Imprimir en orden inverso
    public void printReversed() {
        // current apunta a tail
        Nodo current = tail;
        if (tail == null) {
            System.out.println("Lista está vacía");
            return;
        }
        System.out.println("Nodos de la lista doble circular en orden inverso: ");
        do {
            System.out.print(current.data + " ");
            current = current.previous;
        } while (current != tail);
        System.out.println("\n");
    }
    
    
    
   public static void main(String[] args) {
   ListaCircular lista1 = new ListaCircular ();
   lista1.insert(0);
   lista1.insert(2);
   lista1.insert(3);
   lista1.print();
   lista1.printReversed();
   }
     
}
