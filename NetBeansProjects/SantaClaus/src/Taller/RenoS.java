package Taller;

import static java.lang.Thread.sleep;
import java.util.Random;

public class RenoS extends Thread {

    private SantaClausS santas;
    private Random rnd;
    public boolean espera;
    private String name;

    public RenoS(SantaClausS santas, String name) {
        this.santas = santas;
        rnd = new Random();
        espera = false;
        this.name = name;
    }

    String getname() {
        return this.name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int pause = rnd.nextInt(20001) + 5000;
                sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Reno " + getname() + " a regresado al establo");
            santas.entraestablo(this);
            espera = true;
            synchronized (this) {
                while (espera) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Reno " + getname() + " se fue de vacaciones despues de un largo viaje");
            descanso();
        }
    }

    public void descanso() {
        try {
            int pause = rnd.nextInt(30001) + 10000;
            sleep(pause);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Reno " + name;
    }
}