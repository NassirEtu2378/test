import java.awt.event.*;
import java.util.ArrayList;
public class Listener  implements MouseListener ,KeyListener {
    private Affichage affichage ;
    private ArrayList<Personne> personne;
    Personne personneSelectionne;
    
    // CONSTRUCTEUR;
    public Listener(Affichage affichage , ArrayList<Personne> personne) {
        this.affichage = affichage;
        this.personne = personne ;
    }

    //GETTERS ET SETTERS 
    public ArrayList<Personne> getPersonne() {
        return personne;
    }

    public void setPersonne(ArrayList<Personne> personne) {
        this.personne = personne;
    }

    public Affichage getAffichage() {
        return affichage;
    }

    public void setAffichage(Affichage affichage) {
        this.affichage = affichage;
    }

    
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        
        System.out.println("x :" + x);
        System.out.println("Y :" + y);

        personneSelectionne = estSelectionne(x ,y ,personne);
        if (personneSelectionne != null) {
            System.out.println("PERSONNE SELECTIONNE :" + personneSelectionne);
        }

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

    @Override
    public void mousePressed(MouseEvent e) {
        }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();;
        if (personneSelectionne != null) {
                if (key == KeyEvent.VK_LEFT) {
                    personneSelectionne.deplacerGauche();
                    affichage.repaint();
                    System.out.println("X de p = " + personneSelectionne.getCoordonnees().x);
                    System.out.println("Y de p = " + personneSelectionne.getCoordonnees().y);
        
                }
                else if (key == KeyEvent.VK_RIGHT) {
                    personneSelectionne.deplacerDroite();
                    affichage.repaint();
                    System.out.println("X de p = " + personneSelectionne.getCoordonnees().x);
                    System.out.println("Y de p = " + personneSelectionne.getCoordonnees().y);
                }
                else if (key == KeyEvent.VK_UP) {
                    personneSelectionne.deplacerHaut();
                    affichage.repaint();
                    System.out.println("X de p = " + personneSelectionne.getCoordonnees().x);
                    System.out.println("Y de p = " + personneSelectionne.getCoordonnees().y);
                }
                else if (key == KeyEvent.VK_DOWN) {
                    personneSelectionne.deplacerBas();
                    affichage.repaint();
                    System.out.println("X de p = " + personneSelectionne.getCoordonnees().x);
                    System.out.println("Y de p = " + personneSelectionne.getCoordonnees().y);
                }
        
        }
        else{
            System.out.println("Tsy nety");
            // System.out.println("mombamomba" + personneSelectionne.getCoordonnees().x);

        }
}

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
        
