package Carrera;

public class Guepardo extends Thread{
    public void run(){
        long ms=0;
        System.out.println("Comienza la Guepardo");
        while(ms <= 700){
            try {
                ms = (long)(130+ms);
                Thread.sleep(1000);
                System.out.println("Guepardo a "+ms+" m/s");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("A termina el Guepardo");
    }
}
