package caesar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaesarChiffrierButton implements ActionListener {

    private JButton chiffrierButton;
    private CaesarPanel caesarPanel;
    private boolean isIncreaseButton;

    public CaesarChiffrierButton (CaesarPanel panel, boolean isIncreaseButton){
        this.caesarPanel = panel;
        this.isIncreaseButton = isIncreaseButton;
        if(this.isIncreaseButton) {
            this.chiffrierButton = new JButton("+1");
            this.caesarPanel.add(this.chiffrierButton);
            this.chiffrierButton.setBounds(850, 300, 50, 50);
            this.chiffrierButton.addActionListener(this);
        }else {
            this.chiffrierButton = new JButton("-1");
            this.caesarPanel.add(this.chiffrierButton);
            this.chiffrierButton.setBounds(700, 300, 50, 50);
            this.chiffrierButton.addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == chiffrierButton){
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
            this.caesarPanel.SetLowerText(this.caesarPanel.chiffre.CaesarVerschluesselung(this.caesarPanel.aktuelleDechiffrierung, this.caesarPanel.chiffre.StringtoCharArray(this.caesarPanel.nachrichtOben)));
            this.caesarPanel.middleBox.setText(String.valueOf(this.caesarPanel.aktuelleDechiffrierung));

        }
    }
}
