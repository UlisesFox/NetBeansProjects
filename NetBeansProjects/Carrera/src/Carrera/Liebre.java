package Carrera;

public class Liebre extends Thread {
    public void run(){
        long ms=0;
        System.out.println("Comienza la Liebre");
        while(ms <= 700){
            try {
                ms = (long)(60+ms);
                Thread.sleep(1000);
                System.out.println("Liebre a "+ms+" m/s");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("A termina la Liebre");
    }
}
