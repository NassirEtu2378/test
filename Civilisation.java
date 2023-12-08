import java.awt.Polygon;
import java.util.*;

public class Civilisation {
    private String nom ;
    private ArrayList<Personne> population;
    private ArrayList<Enseignant> enseignant;
    private ArrayList<Militaire> militaire ;
    private double vola;
    private Polygon form ;

    
    
    
    //Constructeur
    public Civilisation(String nom  ) {
        this.setNom(nom);
        this.setPopulation(new ArrayList<>());
        this.setEnseignant(new ArrayList<>());
        this.setMilitaire(new ArrayList<>());
        this.setVola(200);
    }
    
    public Polygon getForm() {
        return form;
    }


    public void setForm(Polygon form) {
        this.form = form;
    }

    public double getVola() {
        return vola;
    }


    public void setVola(double vola) {
        this.vola = vola;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public ArrayList<Enseignant> getEnseignant() {
        return enseignant;
    }


    public void setEnseignant(ArrayList<Enseignant> enseignant) {
        this.enseignant = enseignant;
    }


    public ArrayList<Militaire> getMilitaire() {
        return militaire;
    }


    public void setMilitaire(ArrayList<Militaire> militaire) {
        this.militaire = militaire;
    }


    public ArrayList<Personne> getPopulation() {
        return population;
    }


    public void setPopulation(ArrayList<Personne> population) {
        this.population = population;
    }

    // public void recruter(Personne personne)
    // {
    //     personne.add(personne);
    // }

    public void vola()
    {
        
    } 
 }