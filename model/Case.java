/**
 * Classe représentant les cases de la grille de jeux.
 */

public class Case {

    // Est a 1 si il y a le serpent dans la case 0 sinon
    private boolean isSnake;

    // Est a 1 si il y a un fruit dans la case 0 sinon
    private boolean isFruit;

    // Coordonée de la case dans la grille
    private Coor position;

    //Constructeur qui prend en argument les coordonées de la case de la grille qu'elle représente
    public Case (Coor position){
        this.position = position;
    }

    // Setter pour isSnake
    public void setIsSnake(boolean isSnake) {
        this.isSnake=isSnake;
    }

    // Setter pour isFruit
    public void setIsFruit(boolean isFruit) {
        this.isFruit=isFruit;
    }

    // getter pour isSnake
    public boolean getIsSnake() {
        return this.isSnake;
    } 

    // getter pour isFruit
    public boolean getIsFruit() {
        return this.isFruit;
    }

}