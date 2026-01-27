package window;

import festeVariablen.ScreenResolutions;

import javax.swing.*;
import java.awt.*;

public class TopDisplayBox extends JPanel {

    public Color topPanelColour = Color.CYAN;

    TopDisplayBox(){

        this.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
        this.setBackground(topPanelColour);
        this.setPreferredSize(ScreenResolutions.TOPPANEL.resolution);
    }
}
