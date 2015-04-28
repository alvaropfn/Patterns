import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Composite extends PApplet {

/*
usado para representar agrupamentos de objetos
com hierarquias em niveis ate objetos atomicos
*/

public void stup()
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

public void draw()
{
	
}
class Atomo extends Componente
{
	public Atomo(int i){super(i);}
}
class Componente
{
	int index;

	public Componente(int i){this.index = i;}
	
	public void metodoComum()
	{println("componente " + index);}
}


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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Composite" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
