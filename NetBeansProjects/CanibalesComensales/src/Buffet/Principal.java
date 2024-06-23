package Buffet;

import java.util.Scanner;

public class Principal implements Runnable{
             
         private boolean cocina;
         private long num;
         private static int MaxCanibal =10;
         private static int carne = 0;
         private static int MaxCarne = 10;
         private static Object look = new Object();
         private static int veloCani = 1500;
         
         public Principal (boolean  cocina){
             this.cocina = cocina;
         }

    @Override
    public void run() {
         while(true){
             if(cocina){
                 canibal();
             }else{
                 cocinero();
             }
         }
    }
    
    private void canibal(){
         synchronized (look){
            if(carne > 0){
                carne--;
                num = (long)(Math.random()*MaxCanibal+1);
                System.out.println("Canibal "+num+" tomo 1 de carne");
                System.out.println("Quedan "+carne+" de carne\n");
            try{
                Thread.sleep(veloCani);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }else{               
            look.notifyAll();
                try{
                    look.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
             }
        }
    }
}
    
    private void cocinero() {
         synchronized(look){
             if(carne == 0){
                 carne = (int)(Math.random()*MaxCarne+1);
                 System.out.println("Cocinero despierta");
                 System.out.println("Se a rellenado "+carne+" de carne ");
                 look.notifyAll();
             }try{
                 System.out.println("Cocinero se duerme\n");
                 look.wait();
             }catch(Exception ex){
             }
         }
    }
    
    public static void main(String[] args){
         int numHilos = 11;
         
         Thread[] hilos = new Thread[numHilos];
         Scanner reader = new Scanner(System.in);
         
         System.out.print("Cantidad base: " +MaxCarne+ ", ingrese nueva cantidad maxima de carne que es posible ingresar: ");
         MaxCarne = reader.nextInt();
         System.out.print("Cantidad base: "+MaxCanibal+", ingrese nueva cantidad maxina de canibales invitados al buffet: ");
         MaxCanibal = reader.nextInt();         
         System.out.print("Velocidad base: "+veloCani+", ingrese nueva velocidad de canibales (en Milisegundos): ");
         veloCani = reader.nextInt();
         System.out.print("\n");
         
         for (int i=0; i<hilos.length; i++){
             Runnable runnable = null;
             
             if(i != 0){
                 runnable = new Principal(true);
             }else{
                 runnable = new Principal(false);
             }
             
             hilos[i] = new Thread(runnable);
             hilos[i].start();
         }
         
         for(int i=0; i<hilos.length; i++){
             try{
                 hilos[i].join();
             }catch(Exception ex){
                 
             }
         }
    }
}
