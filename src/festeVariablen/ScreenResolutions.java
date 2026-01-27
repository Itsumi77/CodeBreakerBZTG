package festeVariablen;

import java.awt.*;

public enum ScreenResolutions {
        //Zentraler Speicherort für Screen Resolutions.
    TOPPANEL  (1920, 100),
    CENTERPANEL (1520, 880),
    BORDERPANELS (200, 880);

    public final Dimension resolution;

    ScreenResolutions(int width, int heigth) {
        this.resolution = new Dimension(width,heigth);
    }

}
