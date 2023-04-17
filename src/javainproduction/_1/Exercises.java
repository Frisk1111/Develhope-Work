package javainproduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {

    //aggiunto 'main(String[] args)'
    public static void main(String[] args) {
        exercise1();

        exercise2();

        exercise3();
    }

    /**
     * 1:
     * .
     * .
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * .
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * .
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        //così gli faccio il casting a numero intero al risultato che verrà con l'operazione accanto!!
        //ovviamente il risultato cambierà di volta in volta!
        int x = (int) (Math.random() * 100);


        //operatore ternario!
        //sarebbe come a dire: 'x è maggiore e/o uguale a 50 ?
        // se si la stringa è "x is greater than or equal to 50" altrimenti (:)
        // la stringa sarà "x is less than 50" '
        String check = x >= 50 ? "x is greater than or equal to 50" : "x is less than 50";


        System.out.println(check);

        //end
    }

    /**
     * 2:
     * .
     * .
     * Create a record called "Person" with fields for name, age and address.
     * .
     * Add a toString method to Person to print out the data in a different format
     * .
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person persona = new Person("Jane", 19, "Nero");

        System.out.println(persona);

        //end
    }

    /**
     * 3:
     * .
     * .
     * In the main method, create a BigInteger variable with a large value.
     * .
     * Create a BigDecimal variable with a large value
     * .
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * .
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * .
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here


        //una classe che permette di usare numeri interi molto grandi!
        //Ovviamente come ogni classe ha delle funzioni per fare diverse operazioni!
        BigInteger numeroGrande = new BigInteger("10000000000000000000");

        //una classe che permette di usare numeri decimali molto grandi!
        //Ovviamente come ogni classe ha delle funzioni per fare diverse operazioni!
        BigDecimal numeroDecimaleGrande = new BigDecimal("0.00000000000000000000000069");

        //metto il divisore dentro un 'BigInteger'
        BigInteger divisoreTre = new BigInteger("3");

        //assegno a questa variabile sempre di tipo 'BigInteger' il valore sarà il risultato
        //della divisione tra 'numeroGrande' e tre!!
        BigInteger numeroGrandeDivisoPerTre = numeroGrande.divide(divisoreTre);

        //risultato!
        System.out.println(numeroGrandeDivisoPerTre);

        //anche qua metto il divisore dentro una variabile di tipo 'BigDecimal'!
        BigDecimal divisorePiGreco = new BigDecimal(Math.PI);


        //mi da 'ArithmeticException'!
        //"Non-terminating decimal expansion; no exact representable decimal result"
//        BigDecimal divisioneDiNumeroDecimaleGrande = numeroDecimaleGrande.divide(divisorePiGreco);

        //risultato!

//        System.out.println(divisioneDiNumeroDecimaleGrande);


        //end
    }

}
