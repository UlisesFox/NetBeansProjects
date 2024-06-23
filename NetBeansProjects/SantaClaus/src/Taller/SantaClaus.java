package Taller;

import java.util.Random;
import java.util.Vector;

public class SantaClaus extends Thread {
    
    private static final int NUM_ELFOS = 3;
    private static final int NUM_RENOS = 9;
	
    private Random rnd;
    private Vector<Elfo> ListaElfosEspera;
    private Vector<Reno> ListaRenosEspera;

    public SantaClaus() {
        rnd = new Random();
        ListaElfosEspera = new Vector<Elfo>();
        ListaRenosEspera = new Vector<Reno>();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                while (ListaElfosEspera.size() < NUM_ELFOS && ListaRenosEspera.size() < NUM_RENOS) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                               }
                           }
	    }
	    if (ListaRenosEspera.size() >= NUM_RENOS) {
                System.out.println("Santa desperto para entregar lo regalo");
		entregaregalos();
		System.out.println("Santa regreso de entregar los regalos y se fue a dormir");
	    } else if (ListaElfosEspera.size() >= NUM_ELFOS) {
                System.out.println("Santa desperto para ayudar a los elfos");
		asesorar();
                System.out.println("Santa atendio a los elfos y se fue a dormir");
            }
        }
    }

    public void preguntar(Elfo elfo) {
        this.ListaElfosEspera.add(elfo);
	synchronized (this) {
            this.notify();
        }
    }

    public void entraestablo(Reno reno) {
        this.ListaRenosEspera.add(reno);
                synchronized (this) {
            this.notify();
        }
    }

    private void asesorar() {
        for (int i = 0; i < ListaElfosEspera.size();) {
	    Elfo elfo = ListaElfosEspera.get(0);
	    synchronized (elfo) {
                  try {
                    sleep(1000);
	} catch (InterruptedException e) {
                    e.printStackTrace();
		}
                System.out.println("Elfo " + elfo.getid() + " fue ayudado");
	        elfo.espera = false;
                          elfo.notify();
	    }
            ListaElfosEspera.remove(0);
        }
    }

    private void entregaregalos() {
	try {
	    int pause = rnd.nextInt(8001) + 7000; // 7 - 15 s
	    sleep(pause);
	} catch (InterruptedException e) {
            e.printStackTrace();
	}
	for (int i = 0; i < NUM_RENOS; i++) {
	    Reno reno = ListaRenosEspera.get(0);
	    synchronized (reno) {
		reno.espera = false;
	        reno.notify();
	    }
            ListaRenosEspera.remove(0);
        }
    }
}
