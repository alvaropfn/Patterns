

public class Adaptador
{
	Adaptado adaptado;

	public Adaptador()
	{
		adaptado = new Adaptado();
	}

	public void acaoAdaptada()
	{
		print("adaptei a ");
		adaptado.acao();
	}
}