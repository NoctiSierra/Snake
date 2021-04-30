package view;

import javax.swing.*;
import java.awt.*;

/**
 * Classe qui herite de JPanel et représente le graphique de 
 */
public class GrilleView extends JPanel {


        boolean colorswap=false;

    public GrilleView() {

        GridLayout gestion= new GridLayout(10,10);
        this.setLayout(gestion);
        int i;
        for(i=0;i < 10; i++) {

            for(int y=0;y < 10; y++) {
                JPanel dalle= new JPanel();
                if((i+y)%2 != 0) {
                    System.out.printf("%d%n", i+y);
                    dalle.setBackground(Color.black);
                    this.add(dalle);
                }else{
                    this.add(dalle);
                }
            }
        }
    }
}