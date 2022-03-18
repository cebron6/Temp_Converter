import javax.swing.*;
import java.awt.*;

public class Gui {
    /*
    * This is a class to construct the GUI
    * And for the main method
    *
    * @author: Christopher C. Ebron
    */

    public Gui(){
        /*Set size variables*/
        int width = 1200;
        int height = 900;
        /* Frame set up */
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new Gui();
    }

}
