/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaeliminamayor;

/**
 *
 * @author monkyd
 */
public class ListaEnlazada {
    Nodo cabeza ;
    
public void insertar (int dato){
    Nodo nuevo1 = new Nodo ( dato);
    nuevo1.siguiente= null;
    if ( cabeza== null){
        cabeza=nuevo1;
    }else{
        Nodo ultimo ;
        ultimo = cabeza;
        while (ultimo.siguiente!=null){
            ultimo=ultimo.siguiente;
        }
        ultimo.siguiente= nuevo1;
    }
}
public void eliminaMayor (){
    if (cabeza == null) {
            return; // Lista vacía, nada que eliminar
        }
    Nodo mayor=cabeza ;
    Nodo actual=cabeza ;
    Nodo anteriorMayor= null ;
    Nodo anterior = null ;
    while(actual!= null){
        if(actual.dato>mayor.dato){
            mayor=actual;
            anteriorMayor=anterior;
        }
        anterior=actual;
        actual=actual.siguiente;
    }
    if(mayor == cabeza){
        cabeza = cabeza.siguiente;
    }else{
        anteriorMayor.siguiente=mayor.siguiente;
        
    }
    
    
    
    
}
 public void imprimir() {
        Nodo tem = cabeza;
        while (tem != null) {
            System.out.println("El dato es " + tem.dato);
            tem = tem.siguiente;
        }
    }


 public static void main(String[] args) {
     
      ListaEnlazada list = new ListaEnlazada();
        list.insertar(7);
        list.insertar(3);
        list.insertar(4);
        list.insertar(9);
        list.insertar(0);
        list.insertar(1);

        System.out.println("Lista antes de eliminar el mayor:");
        list.imprimir();

        list.eliminaMayor();
        System.out.println("Lista después de eliminar el mayor:");
        list.imprimir();
     
     
 }
       
    
}
