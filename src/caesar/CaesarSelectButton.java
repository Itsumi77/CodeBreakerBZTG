package caesar;

import festeVariablen.FesteBotschaften;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaesarSelectButton implements ActionListener {

        public CaesarPanel caesarPanel;
        public JButton slectButton;

        CaesarSelectButton(CaesarPanel caesarPanel) {
            this.caesarPanel = caesarPanel;
            this.slectButton = new JButton("Zufällige Nachricht");
            this.caesarPanel.add(this.slectButton);
            this.slectButton.setBounds(1200, 150, 100, 50);
            this.slectButton.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == slectButton) {
                int random_Chiffrierung = this.caesarPanel.chiffre.RadnomCaesarChiffre();
                char[] zufälligeBotschaft = this.caesarPanel.chiffre.StringtoCharArray(FesteBotschaften.TAGDEROFFENENTÜR.ZufälligeBotschaft());
                char[] zufälligVerschlüsselt = this.caesarPanel.chiffre.CaesarVerschluesselung(random_Chiffrierung, zufälligeBotschaft);
                String verschlüsselteBotschaft = this.caesarPanel.chiffre.CharArrayToString(zufälligVerschlüsselt);
                this.caesarPanel.nachrichtOben = verschlüsselteBotschaft;
                this.caesarPanel.SetUpperText(this.caesarPanel.nachrichtOben);
                this.caesarPanel.SetLowerText(this.caesarPanel.chiffre.CaesarVerschluesselung(this.caesarPanel.aktuelleDechiffrierung, this.caesarPanel.chiffre.StringtoCharArray(this.caesarPanel.nachrichtOben)));


            }
        }
    //1 BUtton zum generieren einer Zufälligen Botschaft.
    //1 BUtton zum übernehmen einer Custom Botschaft

}
