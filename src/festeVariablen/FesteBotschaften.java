package festeVariablen;

import java.util.Random;

//Vorbereitung bestimmter Phrasen zum Verschlüsseln

public enum FesteBotschaften {

    TAGDEROFFENENTÜR (new String[]{
            "Heute ist Tag der offenen Tuer am BZTG",
            "Eine sehr wichtige geheime Botschaft",
            "24 Tage sind auf dem Adventskalender",
            "Roehrenfehrnseher dass waren noch die guten alten Zeiten",
            "Fanfiction ist ein komplett legitimes Kunstmedium",
            "Das word Admiral kommt aus dem arabischen und bedeutet so viel wie eine Person die über eine Anzahl anderer herrscht"});



    public final String[] botschaften;

    FesteBotschaften(String[] botschaften) {
        this.botschaften = botschaften;
    }


    //Auswählen einer Zufälligen Botschaft
    public String ZufälligeBotschaft () {
        Random random = new Random();
        String botschaft = botschaften[random.nextInt(this.botschaften.length)];
        return botschaft;
    }




}
