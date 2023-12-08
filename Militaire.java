import java.awt.Color;
import java.awt.Point;

public class Militaire extends Personne{

	public Militaire(String civilisation, Point p ,Color c) {
		super(civilisation, p, c);
	}
	
	public void attaquer(Personne p)
	{
		p.setVie(p.getVie()-5); 
	}
}