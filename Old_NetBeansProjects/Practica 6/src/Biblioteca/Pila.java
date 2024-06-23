package Biblioteca;

public class Pila {

    public Nodo Pila ;    
    public int cantNodo;
    
    public Pila() {
        Pila = null;
    }

    
    public void push(Alumnos alumno){

        Nodo nuevo = new  Nodo();
         nuevo.setAlumno(alumno);

        if(Pila == null){
            Pila = nuevo;
            
        }else{

            Nodo aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }
       cantNodo++; 
    }
    
    public void Recorrer(){

        Nodo aux = Pila;
        
        if(Pila == null){

        }else{
            
            while(aux != null){
    
                aux = aux.getAptsig();
            }
            
        }
        
    } 
    
    public Nodo[] imprimirLista(){
        
        Nodo aux = Pila;
        
        Nodo datos[] = new Nodo[cantNodo];
        
        int j=0;

        if(Pila == null){
            
        }else{
            
            while(aux != null){
                datos[j] = aux;
                aux = aux.getAptsig();
                j++;
            }
            
        }
        return datos;
    }
    
    public void eliminar(){
        
        Nodo aux = Pila;
        
        if(Pila == null){
            
        }else{
            
            if(aux.getAptsig() == null){
                Pila =null;

            }else{
                
                Pila = aux.getAptsig();
            }            
        }            
    }
            
            
                
        public void push(Préstamo prestamo){

        Nodo nuevo = new  Nodo();
         nuevo.setPrestamo(prestamo);

        if(Pila== null){
            Pila = nuevo;

        }else{

            Nodo aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }

        cantNodo++;
    }
        
     
     
        public void push(Libro libro){

        Nodo nuevo = new  Nodo();
         nuevo.setLibro(libro);

        if(Pila == null){
            Pila = nuevo;

        }else{

            Nodo aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }
        cantNodo++;
    }
        
        public int getcn() {
        return cantNodo;
    }
        
}    