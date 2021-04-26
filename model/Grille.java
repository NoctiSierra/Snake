/**
 * Classe de type model caractérisant la grille de jeu composé de Case veanant de la Classe Case
 */


public class Grille {

    // Tableau a 2 dimension de case pour la grille de jeu
    private Case[][] grille;

    // taille du tableau
    private int size;

    /**
     * Constructeur qui prend en argument une taille de grille
     * Elle créer chaque case de la grille et les rentre dans le tableau
     * surement a modifier dans le futur
     */

    public Grille (int taille) {
        this.size=taille;

        //première boucle qui parcours les lignes
        for(int line=0;line < this.size; line++){

            // deuxième boucle qui parcours les colonnes
            for(int column=0;column < this.size; column++){
                this.grille[line][column]=new Case(new Coor(line,column));
            }

        }
    }
}