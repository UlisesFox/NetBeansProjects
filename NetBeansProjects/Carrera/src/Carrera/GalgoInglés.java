package Carrera;

public class GalgoInglés implements Runnable{
    public void run(){
        long ms=0;
        System.out.println("Comienza la Galgo ingles");
        while(ms <= 700){
            try {
                ms = (long)(70+ms);
                Thread.sleep(1000);
                System.out.println("Galgo ingles a "+ms+"  m/s");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("A termina el Galgo ingles");
    }
}
