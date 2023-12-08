import java.awt.Polygon;

public class Champ {
    private String nom ;
    private Polygon forme ;

    //SETTERS ET GETTERS
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Polygon getForme() {
        return forme;
    }
    public void setForme(Polygon forme) {
        this.forme = forme;
    }

    //CONSTRUCTEUR
    public Champ(String nom, Polygon forme) {
        this.nom = nom;
        this.forme = forme;
    }

    

    
}
