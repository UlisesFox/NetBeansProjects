package Puente;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class AutoIzquierda implements Runnable{
    
    private Integer hilo;
    private Semaphore semaphore;
    
    public AutoIzquierda(Semaphore semaphore, Integer hilo){
        super();
        this.hilo = hilo;
        this.semaphore = semaphore;
    }
    
    @Override
    public void run(){
        Random TA = new Random(System.currentTimeMillis());
        
        try{
            System.out.println("Auto " +hilo+" llego al lado Izquierdo..");
            semaphore.acquire();
            System.out.println("Auto " +hilo+" empezo a cruzar el punte del lado Izquierdo hacia el Derecho");
            //Thread.sleep(1000);
            Thread.sleep(3000 + TA.nextInt((5000 + 1) - 3000));
            System.out.println("Auto "+hilo+" termino de cruzar el puente");
            semaphore.release();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}