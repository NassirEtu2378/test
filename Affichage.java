import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Affichage extends JPanel {
    private ArrayList<Civilisation> civilisation = new ArrayList<>(); 
    private ArrayList<Terrain> terrains = new ArrayList<>();
    private ArrayList<Personne> personne = new ArrayList<>();
    // private ArrayList<Personne> personne = new ArrayList<>();
    
    public Affichage() {
        civilisation.add(new Civilisation("C1") );
        civilisation.add(new Civilisation("C2") );
        civilisation.get(0).setPopulation(personne);        
        // civilisation.get(0).setPopulation()        
        civilisation.get(1).setPopulation(personne);

        Polygon terre = new Polygon();
        terre.addPoint(260, 139);
        terre.addPoint(200, 200);
        terre.addPoint(130, 114);
        terre.addPoint(234, 86);
        
        
        Polygon or = new Polygon();
        or.addPoint(500, 50);
        or.addPoint(600, 50);
        or.addPoint(600, 100);
        or.addPoint(548, 117);
        or.addPoint(500, 100);

        Polygon bois = new Polygon();
        bois.addPoint(178, 467);
        bois.addPoint(100, 429);
        bois.addPoint(159, 399);
        bois.addPoint(215, 423);
        // bois.addPoint(500, 100);
        
        terrains.add(new Terrain("Terre", terre, "Terre" , Color.gray));
        terrains.add(new Terrain("OR", or, "OR" , Color.YELLOW));
        terrains.add(new Terrain("bois", bois, "bois" , Color.GREEN));

        
        personne.add(new Personne("C1",new Point(50 , 50),Color.white));
        personne.add(new Personne("C1",new Point(110 , 50),Color.white));
        personne.add(new Personne("C1",new Point(200 , 50),Color.white));
        personne.add(new Militaire("C1",new Point(200 , 200),Color.BLUE));
        personne.add(new Militaire("C1",new Point(200 , 250),Color.BLUE));
        personne.add(new Militaire("C1",new Point(200 , 300),Color.BLUE));

        Listener personneC1 =  new Listener(this , personne);
        this.addMouseListener(personneC1);
        this.addKeyListener(personneC1);

        Listener personneC2 =  new Listener(this , personne);
        this.addMouseListener(personneC2);
        this.addKeyListener(personneC2);

        this.setFocusable(true);
        this.setBackground(Color.BLACK);
    }
    
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);

        for (Terrain terrain : terrains) 
        {
            g.setColor(terrain.getCouleurTerrain());
            g.fillPolygon(terrain.getForme());
        }

        for (Personne personne : personne) 
        {
            if (personne instanceof Personne) 
                {
                    int width = 20; 
                    int height = 20 ;
                    int centreX = (30 - width) / 2; //calcul du decalage pour centre le cercle dans l'anneau
                    int centreY = (30 - height) / 2;
                    g.setColor(personne.getCouleur());
                    g.fillOval(personne.getCoordonnees().x, personne.getCoordonnees().y, width, height);
                    g.setColor(Color.GREEN);
                    g.fillRect(personne.getCoordonnees().x,personne.getCoordonnees().y -10, personne.getVie() - 70, 5);
                } 
                if (personne instanceof Militaire)
                {
                    int width = 25; 
                    int height = 25 ;
                    int McentreX = (100 - width) / 2;
                    int McentreY = (100 - height ) / 2;
                    g.setColor(personne.getCouleur());
                    g.fillOval(personne.getCoordonnees().x, personne.getCoordonnees().y, width, height);
                    Graphics2D g2D = (Graphics2D) g;
                    g.setColor(Color.GREEN);
                    g.fillRect(personne.getCoordonnees().x,personne.getCoordonnees().y -10, personne.getVie() - 70, 5);
                    g2D.drawOval((personne.getCoordonnees().x - McentreX), (personne.getCoordonnees().y - McentreY), 100, 100);
                    g2D.setColor(Color.YELLOW);
                    g2D.setStroke(new BasicStroke(2));
                }
        }
        // Dessine les terrains sous forme de polygones
    }

    public Personne getPersonne()
    {
        if (!personne.isEmpty()) {
            return personne.get(0);
        }
        return null;
    }

    public void deplacerGauche() {
        Personne personne = getPersonne();
        if (personne != null) {
            personne.deplacerGauche();    
            this.repaint();
        }
    }

    public void deplacerDroite() {
        Personne personne = getPersonne();
        if (personne != null) {
            personne.deplacerDroite();    
            this.repaint();
        }
    }

    public void deplacerHaut() {
        Personne personne = getPersonne();
        if (personne != null) {
            personne.deplacerHaut();    
            this.repaint();
        }
    }

    public void deplacerBas() {
        Personne personne = getPersonne();
        if (personne != null) {
            personne.deplacerBas();    
            this.repaint();
        }
    }

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Jeu de Civilisation");
        Affichage affichage = new Affichage();
        frame.add(affichage);
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        
    }
}
