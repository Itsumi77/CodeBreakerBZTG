package caesar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EigeneBotschaftEinstellButton implements ActionListener {

    public JButton eigeneNachrichtEinstellButton;
    public CaesarPanel displayBox;

    EigeneBotschaftEinstellButton(CaesarPanel displayBox){

        this.displayBox = displayBox;
        this.eigeneNachrichtEinstellButton = new JButton("Nachricht übernehmen");
        this.displayBox.add(this.eigeneNachrichtEinstellButton);
        this.eigeneNachrichtEinstellButton.setBounds(1200, 50, 100, 50);
        this.eigeneNachrichtEinstellButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == eigeneNachrichtEinstellButton){
            this.displayBox.nachrichtOben = this.displayBox.eingabeTextfeld.getText();
            this.displayBox.SetUpperText(this.displayBox.nachrichtOben);
            this.displayBox.SetLowerText(this.displayBox.chiffre.CaesarVerschluesselung(this.displayBox.aktuelleDechiffrierung, this.displayBox.chiffre.StringtoCharArray(this.displayBox.nachrichtOben)));

        }
    }

}
