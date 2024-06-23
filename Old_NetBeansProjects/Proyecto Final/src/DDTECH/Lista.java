package DDTECH;

public class Lista {

    private NodoLista  lista;
    public int cantNodo;

    public int getCantNodo() {
        return cantNodo;
    }

    public void setCantNodo(int cantNodo) {
        this.cantNodo = cantNodo;
    }

    Lista(){

        lista = null;
    }

    public void agregar(Quejas je){

        NodoLista nuevo = new NodoLista(je);
        if(lista == null){
            lista = nuevo;

        } else {

            NodoLista aux = lista;
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();

            }

            aux.setAptSiguiente(nuevo);
        }cantNodo++;
    }

    public void agregar2(Productos pro){

        NodoLista nuevo = new NodoLista(pro);
        if(lista == null){
            lista = nuevo;

        } else {

            NodoLista aux = lista;
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();

            }

            aux.setAptSiguiente(nuevo);
        }cantNodo++;
    }

    public NodoLista[] imprimirLista(){
        
        NodoLista aux = lista;
        
        NodoLista datos[] = new NodoLista[cantNodo];
        
        int j=0;

        if(lista == null){
            
        }else{
            
            while(aux != null){
                datos[j] = aux;
                aux = aux.getAptSiguiente();
                j++;
            }
            
        }
        return datos;
    }

public int Eliminar(String nombre){
        
        NodoLista aux = lista;
        
        NodoLista ant = null;
        
        if(lista == null){
            
        }else{
            while(aux != null){
                
                if(nombre.equals(aux.getQue().getDiaQ())){
                
                    if(ant != null ){
                        ant.setAptSiguiente(aux.getAptSiguiente());
                    }else{
                        lista = aux.getAptSiguiente();
                    }
                    cantNodo--;
                    return 1;
                    
            }
              
                ant = aux;
                aux = aux.getAptSiguiente();
            }
            
        }
        return 0;
        
    }

public int Eliminar2(String nom){
        
        NodoLista aux = lista;
        
        NodoLista ant = null;
        
        if(lista == null){
            
        }else{
            while(aux != null){
                
                if(nom.equals(aux.getPro().getCódigoP())){
                
                    if(ant != null ){
                        ant.setAptSiguiente(aux.getAptSiguiente());
                    }else{
                        lista = aux.getAptSiguiente();
                    }
                    cantNodo--;
                    return 1;
                    
            }
              
                ant = aux;
                aux = aux.getAptSiguiente();
            }
            
        }
        return 0;
        
    }
}