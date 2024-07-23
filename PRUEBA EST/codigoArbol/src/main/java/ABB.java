/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
public class ABB {
    Node root;
    
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

      return current; //importante para devolver la raiz
    }
        
    public void add(int value) {
       root = addRecursive(root, value);
       //System.out.println("root es: "+root);
    }
    
   
      
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.value) {
            //when the node is a leaf node
            if (current.left == null && current.right == null) {
                return null;
            }
            //the case when the node has one child:
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
               //Usaremos el nodo más pequeño del subárbol derecho del nodo que pronto se eliminará:
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
      } 
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
   }
    
    //El operador ternario tiene la misión de devolver un valor, dependiendo del valor de una condición booleana. La sintaxis es:
   // ((condición)?valor1:valor2)
         
    
    private int findSmallestValue(Node root) {
            return root.left == null ? root.value : findSmallestValue(root.left);
    }
    
    public void delete(int value) {
         root = deleteRecursive(root, value);
     }
   
   
   
  
    public void traversePreOrder(Node node) {
       if (node != null) {
           System.out.print(" " + node.value);
           traversePreOrder(node.left);
           traversePreOrder(node.right);
       }
    }
      
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
  
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
        
    
}
    
    
    
    
