/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author rmreategui
 */
public class MainABB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
       ABB bt = new ABB();
               bt.add(3);
        bt.add(7);
          bt.add(5);
            bt.add(9);
         bt.add(8);
      
        bt.add(8);

    
     
bt.delete(9);
        
 
       
      
        
    
 
        System.out.println(" "); 
       bt.traverseInOrder(bt.root);
       
      
    }
}
