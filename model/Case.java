package model;

import javax.swing.*;

/**
 * Classe représentant les cases de la grille de jeux.
 */

public class Case {

    /**
     * Est a 1 si il y a le serpent dans la case 0 sinon
     */
    private boolean isSnake;

    /**
     * Est a 1 si il y a un fruit dans la case 0 sinon
     */
    private boolean isFruit;

    /**
     * Est a 1 si il y a un fruit dans la case 0 sinon
     */
    private Coor position;

    /**
     * JPanel représenter dans la grille visuel
     */
    private JPanel visual;

    /**
     * Constructeur qui prend en argument les coordonées de la case de la grille qu'elle représente
     * @param position Coordonnée de la case qu'elle représente
     */
    public Case (Coor position, JPanel visual){
        this.position = position;
        this.visual = visual;
    }

    /**
     * Setter pour isSnake
     * @param isSnake statut de la case sur la présence du serpent
     */
    public void setIsSnake(boolean isSnake) {
        this.isSnake=isSnake;
    }

    /**
     * Setter pour isFruit
     * @param isFruit statut de la case sur la présence d'un fruit
     */
    public void setIsFruit(boolean isFruit) {
        this.isFruit=isFruit;
    }

    /**
     * getter pour isSnake
     * @return le statut de la case sur la présence du serpent
     */
    public boolean getIsSnake() {
        return this.isSnake;
    }

    /**
     * getter pour isFruit
     * @return le statut de la case sur la présence du fruit
     */
    public boolean getIsFruit() {
        return this.isFruit;
    }

}