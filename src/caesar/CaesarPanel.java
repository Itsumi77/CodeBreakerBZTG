package caesar;

import festeVariablen.ScreenResolutions;

import javax.swing.*;
import java.awt.*;

public class CaesarPanel extends JPanel {

    public CaesarChiffre chiffre;
    public Font f = new Font("serif", Font.PLAIN, 20);
    public JTextArea upperBox;
    public JTextArea lowerBox;
    public JTextArea middleBox;
    public CaesarChiffrierButton increaseButton;
    public CaesarChiffrierButton decreaseButton;

    public JTextArea eingabeTextfeld;

    public String nachrichtOben;

    public int aktuelleDechiffrierung;
    public char[] dechiffrierteBotschaft;

    CaesarPanel(CaesarChiffre chiffre) {

        this.chiffre = chiffre;
        this.setLayout(null);
        this.setPreferredSize(ScreenResolutions.CENTERPANEL.resolution);
        this.setFocusable(true); //makes it so, that keyboard inputs work

        this.eingabeTextfeld = new JTextArea();
        this.add(this.eingabeTextfeld);
        this.eingabeTextfeld.setBounds(500,50,600,50);
        this.eingabeTextfeld.setLineWrap(true);
        this.eingabeTextfeld.setFont(f);

        this.upperBox = new JTextArea();
        this.add(upperBox);
        this.upperBox.setBounds(500,150,600,50);
        this.upperBox.setLineWrap(true);
        this.upperBox.setFont(f);
        this.upperBox.setEditable(false);

        this.lowerBox = new JTextArea();
        this.add(lowerBox);
        this.lowerBox.setBounds(500,500,600,50);
        this.lowerBox.setLineWrap(true);
        this.lowerBox.setFont(f);
        this.lowerBox.setEditable(false);

        this.middleBox = new JTextArea();
        this.add(middleBox);
        this.middleBox.setBounds(785, 300, 50, 50);
        this.middleBox.setLineWrap(true);
        this.middleBox.setFont(f);
        this.middleBox.setEditable(false);

        this.increaseButton = new CaesarChiffrierButton(this,true);
        this.decreaseButton = new CaesarChiffrierButton(this,false);
        new CaesarSelectButton(this);
        InitializeEinstellButton();

    }
    public void SetUpperText(String botschaft) {
        this.upperBox.setText(botschaft);
    }
    public void InitializeEinstellButton() {
        new EigeneBotschaftEinstellButton(this);
    }
    public void SetLowerText(char[] botschaft) {
        this.lowerBox.setText(new String(botschaft));
    }

    public void SetNewBotschaft(String botschaft) {


    }
}
