/*
usado para representar agrupamentos de objetos
com hierarquias em niveis ate objetos atomicos
*/

void stup()
{
	Composto composto = new Composto(-1);
	for (int i = 0; i < 3; ++i)
	{composto.addComponente(new Atomo(i));}

	for (Componente c : composto.componentes)
	{c.metodoComum();}
	
	for(int i = 0; i < 3 ; i++)
	{
		composto.componentes.get(i).metodoComum();
	}
}

void draw()
{
	
}