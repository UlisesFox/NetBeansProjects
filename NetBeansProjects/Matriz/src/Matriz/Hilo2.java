package Matriz;

import java.util.LinkedList;

public class Hilo2 {

	public double[][] operador (double [][] m1, double [][] m2)
	{

		assert m1!=null;
		assert m2!=null;
		assert m1.length > 0;
		assert m1[0].length > 0;
		assert m2.length > 0;
		assert m2[0].length > 0;
		assert m1.length==m2[0].length;
		
		int filas = m1.length;
		int columnas = m2[0].length;
		double [][] resultado = new double[filas][columnas];

		LinkedList<Thread> hilos = new LinkedList<Thread>();

		for (int fila=0; fila<filas; fila++)
			for (int columna=0; columna<columnas; columna++)
			{
				Thread hilo = new Thread(
					new Hilo1(m1,m2,resultado,fila,columna));
				hilos.add(hilo);
				hilo.start();
			}

		for (Thread hilo: hilos)
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
		return resultado;
	}

}
