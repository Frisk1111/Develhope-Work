package javabasics._16;

import java.util.Arrays;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        /*double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;;
        String conversionDescription ="celsius + " Celsius is " + fahrenheit + " fahrenheit";";*/
        // End
        converisonCelsiusToFahr();

    }
    //My function:
    static void converisonCelsiusToFahr() {
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        System.out.println(conversionDescription);

    }




    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) { //<<-- tipico ciclo for each! dove va messo un nuovo oggetto a cui vengono applicati i valori dell'array "names"

            // Call your function

            System.out.println(formattingTheArray(name)); //<<-- richiamo "name" (l'oggetto creato prima con il ciclo for)
             //^                                         // dentro la funzione così assume i ""valori"" dati a format!
            // così stampiamo una funzione static normale // quindi con l'uppercase,il trim e la condizione dell'if!
        }
    }
    static String formattingTheArray(String format){ //<<--creiamo una variabile dentro le rotonde, la facciamo "ritornare" (return) dove possiamo
                                                     //applicare altri metodi e/o operazioni

        if (format.matches(".*\\d.*")) { //.matches(".*\\d.*") vede se ci sono dei numeri all'interno!!
            System.out.println("Invalid !");
        }
        return format.toUpperCase().trim(); //così verrà in maiuscolo e senza spazi!!
    }



    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");


        // Call your function
        printing(); // <<--così viene richiamata una funzione void!
                  //non c'e bisogno del system visto che l'abbiamo già messo nella funzione void!

    }
    static void printing(){ //<<-- una funzione void non ha bisogno di fare il return!!!

        double myLunchPrice = 5.99; //<<-- definiamo poi le varie variabili
        String lunchType = "sandwich ";
        String description = " Nice big sandwich";
        int weightInGrams = 500;
        System.out.println(lunchType + myLunchPrice + "\n" + description + "\n" + weightInGrams);

    }

}