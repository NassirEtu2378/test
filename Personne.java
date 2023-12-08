import java.awt.*;
import java.util.ArrayList;

public class Personne {
    private int vie = 100;
    private String civilisation;
    private Point coordonnees;
    private Color couleur;

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    // Getter pour vie
    public int getVie() {
        return vie;
    }

    // Setter pour vie
    public void setVie(int vie) {
        this.vie = vie;
    }

    // Getter pour civilisation
    public String getCivilisation() {
        return civilisation;
    }

    // Setter pour civilisation
    public void setCivilisation(String civilisation) {
        this.civilisation = civilisation;
    }

    // Getter pour coordonnees
    public Point getCoordonnees() {
        return coordonnees;
    }

    // Setter pour coordonnees
    public void setCoordonnees(Point coordonnees) {
        this.coordonnees = coordonnees;
    }
    
    //Constructeur
    public Personne(String civilisation , Point p ,Color c )
    {
        this.vie = 100 ;
        this.civilisation= civilisation;
        this.coordonnees =  p;
        this.couleur = c;
    }

    public void deplacer (int x , int y)
    {
        Point newCoord = new Point(coordonnees.x, coordonnees.y);
        setCoordonnees(newCoord);
    }

    public Personne estSelectionne (int x , int y,ArrayList<Personne> personne )
    {
        for(Personne p : personne )
        {
            if (p.estSelectionne(x, y)) {
                return p;
            }
        }
        return null;
    }

    public boolean estSelectionne(int x , int y)
    {
        // Ellipse2D personne = new Ellipse2D.Double(coordonnees.x ,coordonnees.y , 50 , 50);
        // return personne.contains(x, y);
        int rayon = 25 ;
        int coinSupX = coordonnees.x;
        int coinSupY = coordonnees.y;
        int coinInfX = coordonnees.x + 2 * rayon ;
        int coinInfY = coordonnees.y + 2 * rayon ;
        if (x >= coinSupX && x <= coinInfX && y >= coinSupY &&  y <= coinInfY) 
            {
                return true ;
            } 
        else
        {
            return false;
        }
            
    }

    public void deplacerGauche() {
        coordonnees.x -= 10 ;
        // repaint();
    }

    public void deplacerDroite() {
        coordonnees.x += 10;
        // repaint();
    }

    public void deplacerHaut() {
        coordonnees.y -= 10 ;
        // repaint();
    }

    public void deplacerBas() {
        coordonnees.y += 10 ;
        // repaint();
    }
}

    public boolean akaiky(Personne p )
    {
        int x = this.getCoordonnees().x;
        int y = this.getCoordonnees().y;
        int pX = p.getCoordonnees().x;
        int pY = p.getCoordonnees().y;
        int distX = 20;
        int distY = 20;
        if (pX >= x - distX && pX <= x + distX && pY >= y -distY && pY <= y +distY) {
            return true;
        }
        else{
            return false;
        }
    }