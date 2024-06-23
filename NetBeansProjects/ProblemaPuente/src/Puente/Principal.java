package Puente;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Principal {

    public static void main(String[] args) {
        Semaphore puente = new Semaphore(7);
        int VA = (int) Math.floor(Math.random() * (1 - 0 +1) + 0);
        Random TA = new Random(System.currentTimeMillis());
        int i = 0;
        while (true) {
                 if(VA == 0){
                 int AAC = (int) Math.floor(Math.random() * (8 - 1 + 1) + 1);
                 for(int j = 0; j < AAC; j++){
                     i++;
                     new Thread(new AutoIzquierda(puente, i)).start();
                     try{
                         Thread.sleep(200 + TA.nextInt((400 + 1) - 200));
                     }catch (InterruptedException e){
                         e.printStackTrace();
                     }
                 }
                 VA = 1;
                 }
                 try{
                     Thread.sleep(5000);
                 }catch (InterruptedException e){
                     e.printStackTrace();
                 }
                 if (VA == 1){
                     int AAC = (int) Math.floor(Math.random() * (8 - 1 + 1) + 1);
                 for (int j = 0; j < AAC; j++){
                     i++;
                     new Thread(new AutoDerecha(puente, i)).start();
                     try{
                         Thread.sleep(200 + TA.nextInt((400 + 1) - 200));
                     }catch (InterruptedException e){
                         e.printStackTrace();
                     }
                 }
                 VA = 0;
                 }
                 try {
                       Thread.sleep(5000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
             }
         }
    }
}
