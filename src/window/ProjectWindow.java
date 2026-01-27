package window;

import festeVariablen.ScreenResolutions;

import javax.swing.*;
import java.awt.*;

public class ProjectWindow {

    public JFrame frame;
    public JPanel topPanel;
    public JPanel centerPanel;
    private JPanel rightBorder;
    private JPanel leftBorder;
    private Color sidePanelColour = Color.lightGray;

    public StartCenterDisplayBox startScreen;

    public

    ProjectWindow() {
        this.frame = new ProjectFrame();
        this.topPanel = new TopDisplayBox();
        this.frame.add(this.topPanel, BorderLayout.NORTH);
        this.startScreen = new StartCenterDisplayBox(this);
        this.centerPanel = this.startScreen;
        this.startScreen.InitializeButton();
        this.frame.add(this.centerPanel, BorderLayout.CENTER);
        InitializeBorderPanels();
        this.frame.pack();
    }

    private void InitializeBorderPanels() {
        this.leftBorder = new JPanel();
        this.leftBorder.setPreferredSize(ScreenResolutions.BORDERPANELS.resolution);
        this.frame.add(this.leftBorder, BorderLayout.WEST);
        this.leftBorder.setBackground(sidePanelColour);
        this.rightBorder = new JPanel();
        this.rightBorder.setPreferredSize(ScreenResolutions.BORDERPANELS.resolution);
        this.frame.add(this.rightBorder, BorderLayout.EAST);
        this.rightBorder.setBackground(sidePanelColour);
    }

    public void SwapCenterPanel(JPanel panel) {
        this.frame.remove(this.centerPanel);
        this.centerPanel = panel;
        this.frame.add(this.centerPanel, BorderLayout.CENTER);
        this.frame.pack();


    }
}
