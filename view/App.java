package view;

import view.GrilleView;
import view.SnakeMenu;

import javax.swing.*;
import java.awt.*;

/**
 * Classe qui rassemble tout les affichages du jeu dans un cardLayout 
 */

public class App extends JFrame {

    //CONSTANTE
    final static String MENU = "Menu";
    final static String GAME = "Jeu";

    //référence pour le reste du code
    private static App instance;

    /**
     * gestionnaire pour l'affichage
     */
    private CardLayout c = new CardLayout();
    private JPanel screen =new JPanel();

    private SnakeMenu menu=new SnakeMenu("Snake",800,800);
    private GrilleView grille=new GrilleView();

    /**
     * Constructeur pour la classe App
     */

    public App(String title, int width, int height) {

        //Vérification
        if (instance == null) {
            this.instance = this;
        }

        // create the window frame
        createWindow(title, width, height);

        //ajout du JPanel sur lequel agit le gestionnaire
        this.add(this.screen);
        this.screen.setLayout(c);

        //ajout des élément au gestionnaire
        this.screen.add(menu,MENU);
        this.screen.add(grille,GAME);
        c.show(this.screen,"Menu");
        
    }



    /**
     * Methode qui établie les procédure par défaut pour la fenêtre
     */
    public void createWindow(String title, int width, int height) {
        // set title, visibility, size and default close operation
        setTitle(title);
        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static App getInstance() {
        return instance;
    }

    /**
     * méthode qui permet de changer le card afficher par le CardLayout
     * @param screen ecran a afficher
     */
    public void changeDisplay(int screen ) {
        switch (screen){
            case 0:this.c.show(this.screen,MENU);
            break;

            case 1: this.c.show(this.screen,GAME);
            break;

            default:break;
        }
    }


}