import java.util.*;

public abstract class Observado
{
	public List<Observador> observadores;
	int assunto;

	public Observado()
	{
		observadores = new ArrayList();
		assunto =  new Random().nextInt();
	}

	public void addObservador(Observador o)
	{observadores.add(o);}

	public boolean delObservador(Observador o)
	{observadores.remove(o);}
}