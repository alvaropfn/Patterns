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

public class AdapterObject extends PApplet {



public void setup()
{
	Adaptador adaptador	 = new Adaptador();
	adaptador.acaoAdaptada();
}

public void draw()
{
	
}


public class Adaptado
{
	public Adaptado()
	{}

	public void acao()
	{println("execucao de uma acao");}
}


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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "AdapterObject" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
