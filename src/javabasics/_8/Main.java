package javabasics._8;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";
        //Write your code here

        //lo convertiamo in un num intero e aggiungiamo 2
        int ourNumberAsAInt = Integer.valueOf(ourNumberStr) + 2;
        //lo riconvertiamo in stringa
        String resultAsAString = String.valueOf(ourNumberAsAInt);

        System.out.println(resultAsAString); //risultato
    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';

        //conversione di ourchar in una stringa!
        String ourCharString = String.valueOf(ourChar);
        ourCharString = ourCharString.toUpperCase(); //qua la rendiamo maiuscola!
       System.out.println(ourCharString);


        //  `charAt()` method stampa la singola lettera della stringa, lo 0 indica l'iniziale della stringa!!
        System.out.println(ourCharString.charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // cambiando qua con un num sotto stamperà la lettera che equivale al num (la posizione
        // in questo caso la 6° posizione, che è la "w")
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "42"; // num. intero
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = "false"; // boolean
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "6.6"; // double (decimale)
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5";
        // Write your code here
        //lo convertiamo in un num. intero
        int startStrAsAInt = Integer.valueOf(startStr);

        startStrAsAInt *= 2; //lo moltiplichiamo x2

        String resultAsAStr = String.valueOf(startStrAsAInt);  //convertiamo il risultato in una stringa

        resultAsAStr+=10; //aggiungiamo alla stringa 10

        double resultAsADouble = Double.valueOf(resultAsAStr); //trasfromiamo la stringa di prima in un decimale

        resultAsADouble /= 3.5; //dividiamo x 3.5

        double finalResult = Math.floor(resultAsADouble); //risultato finale

        System.out.println(finalResult);
    }
}