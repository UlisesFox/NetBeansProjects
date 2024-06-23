package Medicas;

public class NodoCola {
    
        int Registro;
	NodoCola siguiente;

	public NodoCola(int x) 
	{
		Registro = x;
		siguiente = null;
	}
}

class ColaLista 
{
	protected NodoCola frente;
	protected NodoCola fin;

	
	public ColaLista() 
	{
		frente = fin = null;
	}

	
	public void insertar(int elemento) 
	{
		NodoCola a;
		a = new NodoCola(elemento);
		if (colaVacia()) {
			frente = a;
		}else{
			fin.siguiente = a;
		}
		fin = a;
	}

	
	public int quitar() 
	{
		int aux;
		if (!colaVacia()) 
		{
			aux = frente.Registro;
			frente = frente.siguiente;

		}else{
			return 0;
		}
		return aux;
	}

	
	public void borrarCola() 
	{
		while ( frente != null) {
			frente = frente.siguiente;
		}
		
	}

	
	public boolean colaVacia() 
	{
		if(frente==null)
		{
			return true;			
		}else{
			return false;
		}
	}
}
