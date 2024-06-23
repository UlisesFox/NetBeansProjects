package Taller;

import java.util.Random;

public class Elfo extends Thread {

    private SantaClaus santa;
    private Random rnd;
    private int id;

    public boolean espera;

    public Elfo(SantaClaus santa, int id) {
        this.santa = santa;
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
            System.out.println("Elfo " + id + " necesita ayuda de Santa");
            santa.preguntar(this);
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
