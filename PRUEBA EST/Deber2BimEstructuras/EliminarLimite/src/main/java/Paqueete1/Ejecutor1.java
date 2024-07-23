/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paqueete1;

/**
 *
 * @author monkyd
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LimiteMayor lista1 = new LimiteMayor();
        lista1.insertar(1);
        lista1.insertar(2);
        lista1.insertar(3);
        lista1.insertar(4);
        lista1.insertar(0);
        lista1.insertar(1);
        lista1.insertar(6);
      
        
lista1.eliminarMayoresQue(2);
lista1.imprimir();


        
        
        
        
    }
    
}
