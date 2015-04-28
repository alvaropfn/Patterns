public class Contexto
{
	Estrategia estrategia;
	public Contexto(Estrategia caso)
	{
		estrategia = caso;
	}

	public void executar()
	{
		estrategia.acao();
	}
}