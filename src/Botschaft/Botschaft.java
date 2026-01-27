package Botschaft;

import festeVariablen.FesteBotschaften;

public class Botschaft {

    public String klartextString;
    public char[] klartextCharArray;

    public String verschluesselterString;
    public char [] verschluesseltesCharArray;


    public Botschaft() {
        this.klartextString = RandomBotschaft();
        this.klartextCharArray = StringtoCharArray(klartextString);
    }

    public String RandomBotschaft() {
        return FesteBotschaften.TAGDEROFFENENTÜR.ZufälligeBotschaft();
    } //Zufällige Botschaft aus vorgefertigten auswählen

    public char[] StringtoCharArray(String botschaft) {
        char[] charArray = botschaft.toCharArray();
        return  charArray;
        //String der Botschaft in ein Array aus chars konvertieren
    }

    public String CharArrayToString(char[] botschaft) {
        String stringBotschaft = botschaft.toString();
        return stringBotschaft;
        //Chararray to string convertieren
    }

    public void SetBotschaft(String botschaft) {
        this.klartextString = botschaft;
        this.klartextCharArray = StringtoCharArray(botschaft);
        //Festlegen einer Botschaft
    }

    public void SetVerschluesselteBotschaft(char[] verschluesselteBotschaft){
        this.verschluesseltesCharArray = verschluesselteBotschaft;
        this.verschluesselterString = new String(verschluesselteBotschaft);
            //Da das VErschlüsseln einer Botschaft eine Array an Chars returned, wird erst hier wieder ein String daraus.
    }
}
