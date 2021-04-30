package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe extend de JPanel
 * Cette ecran s'incorpore dans un cardlayout afin de gérer les différents affichage
 * 
 */

public class SnakeMenu extends JPanel {
    // declare a new container to get the content pain

    /* Set Program Components ===================================== */
     

    /* Constructors =============================================== */
    public SnakeMenu(String title, int width, int height) {
        // create the window frame

        GridBagLayout layout= new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        this.setLayout(layout);
        JButton b1 = new JButton("Jouer");

        //classe anonyme pour le controle du bouton
        ActionListener l=new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                App.getInstance().changeDisplay(1);
                System.out.println("test");
           }
        };
        b1.addActionListener(l);


        // Réglage Bouton
        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = 1;
		gc.gridy = 1;
        this.add(b1, gc);

    }

    /* Methods ==================================================== */

    /* Listeners ================================================== */

}