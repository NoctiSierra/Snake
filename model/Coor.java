package model;

/**
 * Classe de type model caractérisant les coordonnées X et Y pour un tableau plus particulièrement pour la grille de jeu
 */


public class Coor {

    // coordonnée X
    private int coorX;

    // coordonnée Y
    private int coorY;

    // Constructeur qui prend des coordonnées en argument
    public Coor(int coorX, int coorY) {
        this.coorX=coorX;
        this.coorY=coorY;
    }

    // Setter pour la coordonnée X
    public void setCoorX(int coorX) {
        this.coorX=coorX;     
    }

    // setter pour la coordonnée Y
    public void setCoory(int coory) {
        this.coorY=coorY;      
    }
    
    // getter pour la coordonée X
    public int getCoorX() {
        return this.coorX;   
    }

    // getter pour la coordonnée Y
    public int getCoorY() {
        return this.coorY;      
    }
}