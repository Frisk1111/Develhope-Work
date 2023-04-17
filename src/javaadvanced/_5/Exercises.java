package javaadvanced._5;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {
    public static void main(String[] args) {


        exercise1();

//        exercise2();
//
//
//        exercise3();
//
//        // -->>cambiati i numeri ad int, con i double non andava nemmeno un catch :|
//        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints its stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here

        String avvisoProblema = "\n Errore! Qualcosa è andato storto! :( \n";

        try {

            Files.createFile(Path.of("Test.txt"));

        } catch (Exception exception) {

            System.err.println(avvisoProblema.toUpperCase());
            exception.printStackTrace();
            System.exit(0);
        }
        //end

    }

    /**
     * 2:
     * *.
     * Write a try-catch block that attempts to open a file
     * *.
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        //messo qua sopra altrimenti
        // non me l'avrebbe rilevato nel blocco try-catch!
        String userInputFileName = "test-file.txt";

        Path percorsoFile = Paths.get(userInputFileName);

        // Your code here

        String avviso = "\n Attenzione! File inesistente! \n";

        try {

            Files.readString(percorsoFile);


        } catch (Exception exception) {

            System.err.println(avviso.toUpperCase());
            exception.printStackTrace();
            System.exit(0);

        }

        //end


    }

    /**
     * 3:
     * .
     * Write a try-catch block that attempts to parse a string as an integer.
     * .
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here


        String avviso = "\n Attenzione! Input non valido :( \n sicuro che sia un numero intero? \n ";

        try {

            Integer.parseInt("house");

        } catch (Exception exception) {

            System.err.println(avviso.toUpperCase());
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 4:
     * .
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * .
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * .
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here


        //cambiato ad 'int' perché se con entrambi double mi stampava 'infinity' e non mi dava nemmeno uno dei due catch!
        int num1 = 10;
        String num2AsString = "0";

        String avvisoFormato = "\n Attenzione! Le due variabili devono avere lo stesso formato ! \n";

        String numeroDivisoPerZero = "\n Non puoi dividere un numero per zero! Cambia il valore di quella variabile!";


        try {

            System.out.println(num1 / Integer.parseInt(num2AsString));

            //Your catch blocks here
        } catch (NumberFormatException numberFormatException) {

            System.err.println(avvisoFormato.toUpperCase());
            numberFormatException.printStackTrace();

            //questo dovrebbe servire per le operazioni come quella di sopra!
        } catch (ArithmeticException divideByZeroException) {

            System.err.println(numeroDivisoPerZero.toUpperCase());
            divideByZeroException.printStackTrace();
            System.exit(0);

        }


    }
}
