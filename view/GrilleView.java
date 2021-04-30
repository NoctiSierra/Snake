package view;

import model.Grille;

import javax.swing.*;
import java.awt.*;

/**
 * Classe qui herite de JPanel et représente le graphique de 
 */
public class GrilleView extends JPanel {

    public GrilleView() {

        GridLayout gestion= new GridLayout(10,10);
        this.setLayout(gestion);

        //instanciation d'une nouvelle grille qui s'occupe des cases et des coordonnées
        Grille grille= new Grille(10,this);
    }
}