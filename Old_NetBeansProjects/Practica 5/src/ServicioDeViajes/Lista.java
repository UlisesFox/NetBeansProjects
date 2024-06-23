package ServicioDeViajes;

public class Lista {

    private Cotización destinos;
    
    public Lista(){

        destinos = null;
    }
    

    public void agregarDestinos(int n, String p, String c){
        

       Cotización nuevo = new Cotización ();
       nuevo.setDias(n);
       nuevo.setDestino(p);
       nuevo.setHabitacion(c);

       if(destinos == null){

         destinos = nuevo;
       }else { 

           Cotización aux = destinos;

           while ( aux.getSiguiente() != null){
             aux = aux.getSiguiente();
           }
           

           aux.setSiguiente(nuevo);
       }
       
    }
    public String recorrerDestinos() {

        String datos = null;        

        Cotización aux = destinos;
        if (destinos == null) {
            datos = "La lista está vacía";
        } else {

            while (aux != null) {
                datos += "Número: " + aux.getDias()+ "\n";
                datos += "Viaje: " + aux.getDestino()+ "-";
                datos += aux.getHabitacion()+ "\n";
                aux = aux.getSiguiente();
            }
        }
        return datos;
    }

    public boolean estaVacia(){
        if(destinos == null){
            return true;
        }else {
            return false;
        }
    }
}

