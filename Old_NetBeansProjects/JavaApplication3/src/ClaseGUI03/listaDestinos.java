/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGUI03;
//Implementar operaciones de una lista enlazada con la clase Viaje
/**
 *
 * @author yazminurzuac
 */
public class listaDestinos {
    //Apuntador principal
    private Viaje destinos;
    
    public listaDestinos(){
        //Inicializar el apuntador principal
        destinos = null;
    }
    
    //Operacion para agragar al final de la lista, un nodo
    public void agregarDestinos(int n, String p, String c){
        
       //crear el nodo base con el valor a incorporar
       Viaje nuevo = new Viaje ();
       nuevo.setNumero(n);
       nuevo.setPais(p);
       nuevo.setCiudad(c);
       
       //Para agregar, primero se valida si hya más nodos o ningun (vacio)
       if(destinos == null){
         //Se agrega el primer nodo de la lista
         destinos = nuevo;
       }else { //Hay mas nodos y se agrega al final de la lista 
           //Genera un apuntador auxiliar para recorrer la lista
           Viaje aux = destinos;
           //Recorrer la lista, mediante el apuntador auxiliar
           while ( aux.getSiguiente() != null){
             aux = aux.getSiguiente(); //Avanza al siguiente nodo
           }//while
           
           //Referencia al nuevo al ultimo nodo
           aux.setSiguiente(nuevo);
       }//else
       
    }//agregar
    public String recorrerDestinos() {
        //Variable que almacene los datos
        String datos = null;        
        //Mostrar el contenido de la lista, siempre que no sea vacía
        //Genera un apuntador auxiliar para recorrer la lista
        Viaje aux = destinos;
        if (destinos == null) {
            datos = "La lista está vacía";
        } else {
            //Recorrer la lista, mediante el apuntador auxiliar
            while (aux != null) {
                datos += "Número: " + aux.getNumero() + "\n";
                datos += "Viaje: " + aux.getPais() + "-";
                datos += aux.getCiudad() + "\n";
                aux = aux.getSiguiente(); //avanza al siguiente nodo
            }//while
        }//else
        return datos;
    }//recorrerLista
//Método para saber si la lista esta vacia o no
    public boolean estaVacia(){
        if(destinos == null){
            return true;
        }else {
            return false;
        }
    }//estaVacia
}//class
