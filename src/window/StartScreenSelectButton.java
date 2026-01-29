package window;

import caesar.CaesarChiffre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreenSelectButton implements ActionListener {

    private JButton button;
    private ProjectWindow fenster;

    public StartScreenSelectButton(ProjectWindow fenster){
        this.fenster = fenster;
        this.button = new JButton("Caesar Chiffre");
        this.button.addActionListener(this);
        fenster.startScreen.add(button);
        this.button.setSize(200, 50);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            new CaesarChiffre(this.fenster);

        }
    }
}
