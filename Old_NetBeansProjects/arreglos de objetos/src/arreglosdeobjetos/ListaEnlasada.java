package arreglosdeobjetos;

public class ListaEnlasada {

private Nodo lista;

public ListaEnlasada(){
    lista = null;

    }

public void agregar(int v){
    Nodo nuevo = new Nodo(v);

        if(lista == null){

        lista = nuevo;

        }else{

        Nodo aux = lista;

        while(aux.getAptSiguiente()!= null){
            aux = aux.getAptSiguiente();

        }

        aux.setAptSiguiente(nuevo);

        }

    }

public void recorrerLista(){

        Nodo aux = lista;

            if(lista == null){
                System.out.println("La lista esta vacia");

            }else{

            while(aux != null){
                System.out.println("Valor " + aux.getValor());
                aux = aux.getAptSiguiente();

            }

        }

    }

public void buscarValor(int v){

        Nodo aux = lista;

        int pos = 1;
        boolean encontrado = false;

            if(lista == null){
                System.out.println("La lista esta vacia");

            }else{

            while(aux != null){

                if(v == aux.getValor()){
                    System.out.println("El valor "+v+" esta en la lista.");
                    System.out.println("Le corresponde la posicion: "+pos);
                    encontrado = true;                    
                    break;

                }

                pos++;
                aux = aux.getAptSiguiente();

            }

            if(!encontrado){
                System.out.println("Valor no encontrado en la lista.");
            }

        }

    }

public void borrarNodo(int v){

        Nodo aux = lista;
        Nodo ant = null;
        boolean encontrado = false;

            if(lista == null){
                System.out.println("La lista esta vacia");

            }else{

            while(aux != null){

                if(v == aux.getValor()){
                    if(ant != null){

                        ant.setAptSiguiente(aux.getAptSiguiente());

                    }else{

                    lista = aux.getAptSiguiente();

                    }
                    encontrado = true;    
                    System.out.println("El valor a sido eliminado correctamente.");
                    break;

                }

                ant = aux;

                aux = aux.getAptSiguiente();

            }

            if(!encontrado){
                System.out.println("Valor no encontrado en la lista.");
            }

        }

    }

}
