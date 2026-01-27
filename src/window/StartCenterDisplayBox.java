package window;

import javax.swing.*;
import java.awt.*;
import caesar.CaesarSelectButton;
import festeVariablen.ScreenResolutions;

public class StartCenterDisplayBox extends JPanel {

    public ProjectWindow window;

    public StartCenterDisplayBox(ProjectWindow window) {

        this.window = window;
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        this.setPreferredSize(ScreenResolutions.CENTERPANEL.resolution);
        this.setFocusable(true);

    }
    public void InitializeButton(){
        new CaesarSelectButton(this.window);
    }

}
