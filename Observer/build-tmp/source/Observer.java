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

public class Observer extends PApplet {


public void setup()
{

}

public void draw()
{
	
}


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
	{return observadores.remove(o);}
}
public interface Observador
{
	public void notificar();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Observer" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
