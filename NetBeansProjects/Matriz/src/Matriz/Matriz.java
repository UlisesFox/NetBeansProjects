package Matriz;

public class Matriz extends Hilo2{

    public static void main(String[] args) {
        
                  long a1, b1, c1, d1, f1, g1, h1, i1, j1;
                  long a2, b2, c2, d2, f2, g2, h2, i2, j2;
                  
                  a1 = (long)(Math.random()*20+1) ;a2 = (long)(Math.random()*20+1);
                  b1 = (long)(Math.random()*20+1) ;b2 = (long)(Math.random()*20+1);
                  c1 = (long)(Math.random()*20+1) ;c2 = (long)(Math.random()*20+1);
                  d1 = (long)(Math.random()*20+1) ;d2 = (long)(Math.random()*20+1);
                  f1 = (long)(Math.random()*20+1); f2 = (long)(Math.random()*20+1);
                  g1 = (long)(Math.random()*20+1) ;g2 = (long)(Math.random()*20+1);
                  h1 = (long)(Math.random()*20+1) ;h2 = (long)(Math.random()*20+1);
                  i1 = (long)(Math.random()*20+1); i2 = (long)(Math.random()*20+1);
                  j1 = (long)(Math.random()*20+1); j2 = (long)(Math.random()*20+1);

	double [][] m1 = new double[][] {{a1,b1,c1},{d1,f1,g1},{h1,i1,j1}};
	double [][] m2 = new double[][] {{a2,b2,c2},{d2,f2,g2},{h2,i2,j2}};

	double [][] resultado = new Matriz().operador(m1, m2);

	for (int i=0;i<resultado.length; i++)
	{
	for (int j=0;j<resultado[0].length;j++)
		System.out.print(resultado[i][j]+" ");
	System.out.println(" ");
        }
    }
}   