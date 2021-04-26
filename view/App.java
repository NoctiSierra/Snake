import javax.swing.*;
import java.awt.*;

/**
 * Classe qui rassemble tout les affichages du jeu dans un cardLayout 
 */

public class App extends JFrame {
    // declare a new container to get the content pain*

    CardLayout c = new CardLayout();
    SnakeMenu menu=new SnakeMenu();
    GrilleView grille;

    /**
     * Constructeur pour la classe App
     */

    public App(String title, int width, int height) {
        // create the window frame
        createWindow(title, width, height);
        this.setLayout(c);

        this.add(menu,"Menu");
        this.add(grille,"jeu");
        // add components to the window
        this.show(c,"Menu");
        
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
}