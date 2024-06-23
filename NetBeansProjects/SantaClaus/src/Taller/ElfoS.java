package Taller;

import static java.lang.Thread.sleep;
import java.util.Random;

public class ElfoS extends Thread {

    private SantaClausS santas;
    private Random rnd;
    private int id;

    public boolean espera;

    public ElfoS(SantaClausS santas, int id) {
        this.santas = santas;
        rnd = new Random();
        espera = false;
        this.id = id;
    }

    int getid() {
        return this.id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int pause = rnd.nextInt(19001) + 1000;
                sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Elfo " + id + " necesita ayuda de Santa y Doky");
            santas.preguntar(this);
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
        }
    }

    @Override
    public String toString() {
        return "Elfo " + id;
    }
}