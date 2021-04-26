package view;

import javax.swing.*;
import java.awt.*;

/**
 * Classe extend de JPanel
 * Cette ecran s'incorpore dans un cardlayout afin de gérer les différents affichage
 * 
 */

public class SnakeMenu extends JPanel {
    // declare a new container to get the content pain
    Container window = getContentPane();

    /* Set Program Components ===================================== */
     

    /* Constructors =============================================== */
    public SnakeMenu(String title, int width, int height) {
        // create the window frame

        GridBagLayout layout= new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        this.setLayout(layout);
        JButton b1 = new JButton("Jouer");


        // Réglage Bouton
        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = 1;
		gc.gridy = 1;
        this.add(b1, gc);

    }

    /* Methods ==================================================== */

    /* Listeners ================================================== */


}