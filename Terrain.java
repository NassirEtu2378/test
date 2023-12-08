import java.awt.*;
public class Terrain extends Champ{
     
    private String nomTerrain;
    private Polygon form ;
    private Color couleurTerrain;

    public Color getCouleurTerrain() {
        return couleurTerrain;
    }

    public void setCouleurTerrain(Color couleurTerrain) {
        this.couleurTerrain = couleurTerrain;
    }

    public Polygon getForm() {
        return form;
    }

    public void setForm(Polygon form) {
        this.form = form;
    }

    public String getNomTerrain() {
        return nomTerrain;
    }

    public void setNomTerrain(String nomTerrain) {
        this.nomTerrain = nomTerrain;
    }

    //CONSTRUCTEUR
    public Terrain(String nom, Polygon forme, String nomTerrain , Color c) {
        super(nom, forme);
        this.nomTerrain = nomTerrain;
        this.couleurTerrain = c;
    }


    







}