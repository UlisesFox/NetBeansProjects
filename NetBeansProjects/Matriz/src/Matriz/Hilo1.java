package Matriz;

public class Hilo1 implements Runnable{
	private double[][] m1;
	private double[][] m2;
	private double[][] resultado;
	private int fila;
	private int columna;
	
	public Hilo1 (double[][] m1, double[][]m2, double[][]resultado, int fila, int columna)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.resultado = resultado;
		this.fila = fila;
		this.columna = columna;
	}

	public void run()
	{
		resultado[fila][columna]=0;
		for (int i=0;i<m2.length;i++)
			resultado[fila][columna] = m1[i][fila]*m2[i][columna];
	}
}