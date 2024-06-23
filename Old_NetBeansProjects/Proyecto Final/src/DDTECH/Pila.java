package DDTECH;

public class Pila {
    public NodoPila Pila ;    
    public int cantNodo;
    
    public Pila() {
        Pila = null;
    }

    
    public void push(Datos dato){

        NodoPila nuevo = new  NodoPila();
         nuevo.setDato(dato);

        if(Pila == null){
            Pila = nuevo;
            
        }else{

            NodoPila aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }
       cantNodo++; 
    }
    
    public void Recorrer(){

        NodoPila aux = Pila;
        
        if(Pila == null){

        }else{
            
            while(aux != null){
    
                aux = aux.getAptsig();
            }
            
        }
        
    } 
    
    public NodoPila[] imprimirLista(){
        
        NodoPila aux = Pila;
        
        NodoPila datos[] = new NodoPila[cantNodo];
        
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
        
        NodoPila aux = Pila;
        
        if(Pila == null){
            
        }else{

            if(aux.getAptsig() == null){
                Pila = null;
                    
            }else{
                
                Pila = aux.getAptsig();
            }
          
        }cantNodo--;            
    }
            
            
                
        public void push(Productos Producto){

        NodoPila nuevo = new  NodoPila();
         nuevo.setProducto(Producto);

        if(Pila== null){
            Pila = nuevo;

        }else{

            NodoPila aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }

        cantNodo++;
    }
        
     
     
        public void push(Tarjetas Tarjeta){

        NodoPila nuevo = new  NodoPila();
         nuevo.setTarjeta(Tarjeta);

        if(Pila == null){
            Pila = nuevo;

        }else{

            NodoPila aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }
        cantNodo++;
    }



        public void push(Quejas Queja){

        NodoPila nuevo = new  NodoPila();
         nuevo.setQueja(Queja);

        if(Pila == null){
            Pila = nuevo;

        }else{

            NodoPila aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }
        cantNodo++;
    }

        public void push(Valoraciones Valoracione){

        NodoPila nuevo = new  NodoPila();
         nuevo.setValoracione(Valoracione);

        if(Pila == null){
            Pila = nuevo;

        }else{

            NodoPila aux = Pila;
            
           Pila = nuevo;
           
           nuevo.setAptsig(aux);
                   
        }
        cantNodo++;
    }
  

     
        public int getcn() {
        return cantNodo;
    }
        
}    