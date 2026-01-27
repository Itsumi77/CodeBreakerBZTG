package festeVariablen;

// Hier wird eimal das Alphabet in einem Chararray angegeben, zur deutlich einfacheren Verarbeitung.

public enum CaesarSchablone {

    CAESARMITZAHLEN ( new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'});

    public final char[] vorlage;

    CaesarSchablone(char[] vorlage) {
        this.vorlage = vorlage;
    }

    public int GetPosition(char zeichen) {
        int position = 0;
        char c = Character.toLowerCase(zeichen);

        for(int i = 0; i<this.vorlage.length; i++) {
            if(this.vorlage[i] == c) {
                position = i;
                break;
            }
        }
        return position;
    }

    public char GetChar(int position) {
       return this.vorlage[position];

    }

}
