import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main(String[] args) {
        boolean colorswap;
        colorswap=false;

        JFrame frame=new JFrame("grille");
        GridLayout gestion= new GridLayout(10,10);
        frame.setLayout(gestion);

        for(int i=0;i < 10; i++){

            for(int y=0;y < 10; y++) {
                JPanel dalle= new JPanel();
                if((i+y)%2 != 0) {
                    System.out.printf("%d%n", i+y);
                    dalle.setBackground(Color.black);
                    frame.add(dalle);
                }else{
                    frame.add(dalle);
                }
            }
        }


        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}