package caesar;

import festeVariablen.CaesarSchablone;
import window.ProjectWindow;

import java.util.Random;

public class CaesarChiffre {

    public ProjectWindow fenster;
    public CaesarPanel caesarPanel;
    

    public CaesarChiffre(ProjectWindow fenster) {

        this.fenster = fenster;
        this.caesarPanel = new CaesarPanel(this);
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

    public char[] StringtoCharArray(String botschaft) {
        char[] charArray = botschaft.toCharArray();
        return  charArray;
        //String der Botschaft in ein Array aus chars konvertieren
    }
    public String CharArrayToString(char[] botschaft) {
        String stringBotschaft = new String(botschaft);
        return stringBotschaft;
        //Chararray to string convertieren
    }

}
