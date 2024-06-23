package Carrera;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Comienza la carrera");
        
        Liebre HLiebre = new Liebre();
        GalgoInglés HGI= new GalgoInglés();
        Thread Hgi = new Thread(HGI);
        Guepardo HGuepardo = new Guepardo();
        
        HLiebre.start();
        Hgi.start();
        HGuepardo.start();
        
         System.out.println("");
        
    }
    
}
