import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Strategy extends PApplet {



public void setup()
{
	
}

public void draw()
{
	
}
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
public interface Estrategia
{
	public void acao();
}
public class Estrategia1 implements Estrategia
{
	public Estrategia1(){}

	public void acao()
	{println("a\u00e7\u00e3o 1");}
}
public class Estrategia2 implements Estrategia
{
	public Estrategia2(){}

	public void acao()
	{println("a\u00e7\u00e3o 2");}
}
public class EstrategiaDefault implements Estrategia
{
	public EstrategiaDefault(){}

	public void acao()
	{println("a\u00e7\u00e3o default");}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Strategy" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
