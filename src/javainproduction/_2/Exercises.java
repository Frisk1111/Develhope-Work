package javainproduction._2;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {

        //boh non l'ho capito
        exercise1();

        //boh non l'ho capito
        exercise2();

        //fatto!
        exercise3();

        //boh non l'ho capito
        exercise4();
    }


    /**
     * 1:
     * .
     * .
     * Use filter to select only even numbers from the list 'ourNumbers'
     * .
     * Use forEach to print the selected even numbers
     * .
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

        // Your code here

        //end
    }

    /**
     * 2:
     * .
     * .
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * .
     * Use the toSet() method to collect the selected odd numbers in a Set
     * .
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

        // Your code here

//        ourNumbers.stream().

        //end


    }


    /**
     * 3:
     * .
     * .
     * Use map to convert the strings to uppercase
     * .
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * .
     * Print the resulting Set
     * .
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // Your code here

        //ALLOOORA- con il metodo '.stream' posso accedere a ulteriori metodi!
        //come '.map' '.filter' '.collect' ecc..
        System.out.println(alice.stream()

                //il metodo '.map' che restituirà
                // "un flusso costituito dai risultati dell'applicazione della funzione data agli elementi di questo flusso"
                //in questo caso ritornerà le stringhe contenute in 'alice' tutte in maiuscolo!!
                .map(String::toUpperCase)

                //con il '.collect' posso far ritornare la lista iniziale in altri tipi di Collection!
                //quindi in Set, in Maps o di nuovo in una List!
                .collect(Collectors.toSet()));

        //end
    }

    /**
     * 4:
     * .
     * .
     * Use filter to select only even numbers from the list 'ourNumbers'
     * .
     * Use map to multiply the even numbers by 2
     * .
     * Use the toSet() method to collect the resulting numbers in a Set
     * .
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        //Your code here
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();


        //end
    }
}
