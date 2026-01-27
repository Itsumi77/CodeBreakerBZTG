package window;

import javax.swing.*;
import java.awt.*;

public class ProjectFrame extends JFrame {

    ProjectFrame () {

        this.setTitle("Code Breaker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0, 0));
        this.setSize(new Dimension(1920, 1080));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //Zentrieren des Fensters im Bildschirm
        this.requestFocus();
        this.setVisible(true);

    }

}
