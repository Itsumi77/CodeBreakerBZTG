package caesar;

import Botschaft.Botschaft;
import festeVariablen.CaesarSchablone;
import window.ProjectWindow;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CaesarChiffre {

    public ProjectWindow fenster;
    public CaesarPanel caesarPanel;
    public Botschaft botschaft;

    CaesarChiffre(ProjectWindow fenster, Botschaft botschaft) {
        this.fenster = fenster;
        this.botschaft = botschaft;
        this.botschaft.SetVerschluesselteBotschaft(CaesarVerschluesselung(RadnomCaesarChiffre(),this.botschaft.klartextCharArray));

        this.caesarPanel = new CaesarPanel(this);
        this.caesarPanel.SetUpperText(this.botschaft.verschluesselterString);
        this.fenster.SwapCenterPanel(this.caesarPanel);

        this.caesarPanel.middleBox.setText(new String(String.valueOf(this.caesarPanel.aktuelleDechiffrierung)));
    }

    public int RadnomCaesarChiffre(){
        Random random = new Random();
        return random.nextInt(1,34);
    }

    public char[] CaesarVerschluesselung(int verschiebung, char[] botschaft) {
        char[] verschlüsselteBotschaft = new char[botschaft.length];
        for (int i = 0; i < botschaft.length; i++) {
            if(botschaft[i] != ' ') {
                int position = CaesarSchablone.CAESARMITZAHLEN.GetPosition(botschaft[i]);
                int verschlüsseltePosition = ((position + verschiebung) % 36);
                verschlüsselteBotschaft[i] = CaesarSchablone.CAESARMITZAHLEN.GetChar(verschlüsseltePosition);
            } else {
                verschlüsselteBotschaft[i] = ' ';
            }
        }
        return verschlüsselteBotschaft;
    }


}
