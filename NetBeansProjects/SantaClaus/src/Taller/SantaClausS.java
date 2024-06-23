package Taller;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.Vector;

public class SantaClausS extends Thread {
    
    private static final int NUM_ELFOS = 3;
    private static final int NUM_RENOS = 9;
	
    private Random rnd;
    private Vector<ElfoS> ListaElfosEspera;
    private Vector<RenoS> ListaRenosEspera;

    public SantaClausS() {
        rnd = new Random();
        ListaElfosEspera = new Vector<ElfoS>();
        ListaRenosEspera = new Vector<RenoS>();
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
                System.out.println("Santa y Doky se despertaron para entregar lo regalo");
		entregaregalos();
		System.out.println("Santa y Doky an regresado de entregar los regalos y se fueron a dormir");
	    } else if (ListaElfosEspera.size() >= NUM_ELFOS) {
                System.out.println("Santa y Doky se despertaron para ayudar a los elfos");
		asesorar();
                System.out.println("Santa y Doky an atendio a los elfos y se fueron a dormir");
            }
        }
    }

    public void preguntar(ElfoS elfos) {
        this.ListaElfosEspera.add(elfos);
	synchronized (this) {
            this.notify();
        }
    }

    public void entraestablo(RenoS renos) {
        this.ListaRenosEspera.add(renos);
                synchronized (this) {
            this.notify();
        }
    }

    private void asesorar() {
        for (int i = 0; i < ListaElfosEspera.size();) {
	    ElfoS elfos = ListaElfosEspera.get(0);
	    synchronized (elfos) {
                  try {
                    sleep(1000);
	} catch (InterruptedException e) {
                    e.printStackTrace();
		}
                System.out.println("Elfo " + elfos.getid() + " fue ayudado");
	        elfos.espera = false;
                          elfos.notify();
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
	    RenoS renos = ListaRenosEspera.get(0);
	    synchronized (renos) {
		renos.espera = false;
	        renos.notify();
	    }
            ListaRenosEspera.remove(0);
        }
    }
}
