import java.util.*;

class Composto extends Componente
{
	public List<Componente> componentes;
	public Composto(int i)
	{
		super(i);
		componentes = new ArrayList();
	}

	public void addComponente(Componente c)
	{componentes.add(c);}

	public void delComponente(Componente c)
	{componentes.remove(c);}
}