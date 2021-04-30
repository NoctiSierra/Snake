package model;

import view.GrilleView;

import javax.swing.*;
import java.awt.*;

/**
 * Classe de type model caractérisant la grille de jeu composé de Case veanant de la Classe Case
 */


public class Grille {

    /**
     * Tableau a 2 dimension de case pour la grille de jeu
     */
    private Case[][] grille;

    /**
     * Référence a un visuel de grille
     */
    private GrilleView grilleview;

    /**
     * taille du tableau
     */
    private int size;

    /**
     * Constructeur qui prend en argument une taille de grille
     * Elle créer chaque case de la grille et les rentre dans le tableau
     * surement a modifier dans le futur
     * @param taille
     */

    public Grille (int taille, GrilleView grilleview) {
        this.size=taille;
        this.grilleview=grilleview;
        this.grille=new Case[this.size][this.size];

        //première boucle qui parcours les lignes
        for(int line=0;line < this.size; line++){

            // deuxième boucle qui parcours les colonnes
            for(int column=0;column < this.size; column++){
                JPanel visual=new JPanel();
                this.grille[line][column]=new Case(new Coor(line,column),visual);
                visual.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.BLACK));
                this.grilleview.add(visual);
            }

        }
    }
}