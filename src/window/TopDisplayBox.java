package window;

import festeVariablen.ScreenResolutions;

import javax.swing.*;
import java.awt.*;

public class TopDisplayBox extends JPanel {

    public Color topPanelColour = Color.CYAN;
    public JTextArea eingabeTextfeld;
    public Font f = new Font("serif", Font.PLAIN, 20);
    public JButton eigeneNachrichtEinstellButton;
    public ProjectWindow fenster;

    TopDisplayBox(ProjectWindow fenster){

        this.fenster = fenster;
        this.setLayout(null);
        this.setBackground(topPanelColour);
        this.setPreferredSize(ScreenResolutions.TOPPANEL.resolution);


    }


}
