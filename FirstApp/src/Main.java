public class Main {

    public static void main(String[] args) {
        String word1 = "bonjour ";
        String word2 = "bonjour ";
        String word3 = "les couillons !!! ";

        // integer primitifs
        byte mini = 127;
        short big =32000;
        System.out.println(mini);


        // float primitif
        float decimal = (float) 3.3;
        float decimal2 = 3.3f;
        double dragon = 3.346765432467875443d;
        double dragon2 = 3.346765432467875443;
        // char primitif
        char letterX = 'x';
        char accentU = '\u00DA';
        char accentX = '\u00DB';
        System.out.println(accentU); // == Ú avec l'accent
        System.out.println(accentX); // == Û avec l'accent
        /* opé arythmétiques*/
        int calc1 = (3+4)*2;
        System.out.println(calc1);

        //compound assignement operators
        int value = 50;
        value -= 5;
        System.out.println(value);

        int compValue = 100;
        int val1 = 5;
        int val2 = 10;
        compValue /= val1 * val2;
        System.out.println(compValue);
        //type conversion
        float frog = (float) 12.9;
        int froggy = (int) frog;
        System.out.println(froggy);

        float floatVal = 1.6f;
        double doubleVal =4.0d;
        byte byteVal =7;
        short shortVal =7;
        long longVal =5;
        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float result3 = longVal - floatVal;
        System.out.println(result3);

        /**
         du coup c le meme que le block comment mais on peut faire de la doc et c tt vert !
          */
        String phrase = word1 + word2 + word3;
        System.out.println(phrase);
        System.out.println("Yo la team !"); // commentaire fin de ligne
        System.out.println("Yo les potos !");
        /* yo yo ça c'est un comm
        super mega long ou je peux
        raconter ma life
         */
        System.out.println("Yo la famille !");
        //les troous duc ne mettent pas de comm !
    }
}
