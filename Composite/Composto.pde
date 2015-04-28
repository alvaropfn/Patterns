import java.util.*;

class Composto implements Componente
{
	List<Componente> componentes;
	public Composto()
	{
		componentes = new ArrayList();
	}

	public void metodoComum()
	{println(this.toString());}

	public void addComponente(Componente c)
	{componentes.add(c);}

	public void delComponente(Componente c)
	{componentes.remove(c);}
}