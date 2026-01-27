package caesar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaesarChiffrierButton implements ActionListener {

    private JButton button;
    private CaesarPanel caesarPanel;
    private boolean isIncreaseButton;

    public CaesarChiffrierButton (CaesarPanel panel, boolean isIncreaseButton){
        this.caesarPanel = panel;
        this.isIncreaseButton = isIncreaseButton;
        if(this.isIncreaseButton) {
            this.button = new JButton("+1");
            this.caesarPanel.add(this.button);
            this.button.setBounds(850, 300, 50, 50);
            this.button.addActionListener(this);
        }else {
            this.button = new JButton("-1");
            this.caesarPanel.add(this.button);
            this.button.setBounds(700, 300, 50, 50);
            this.button.addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            if(this.isIncreaseButton) {
                if(this.caesarPanel.aktuelleDechiffrierung < 35) {
                        this.caesarPanel.aktuelleDechiffrierung ++;
                }else {
                    this.caesarPanel.aktuelleDechiffrierung = 0;
                }
            } else {
                if(this.caesarPanel.aktuelleDechiffrierung > 0) {
                    this.caesarPanel.aktuelleDechiffrierung --;
                }else {
                    this.caesarPanel.aktuelleDechiffrierung = 35;
                }

            }
            this.caesarPanel.SetLowerText(this.caesarPanel.chiffre.CaesarVerschluesselung(this.caesarPanel.aktuelleDechiffrierung, this.caesarPanel.chiffre.botschaft.verschluesseltesCharArray));
            this.caesarPanel.middleBox.setText(String.valueOf(this.caesarPanel.aktuelleDechiffrierung));

        }
    }
}
