package javainproduction._2;

import java.util.ArrayList;
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


        //ALLLOOOOORA- con il '.stream' richiamo il metodo '.filter' dove definisco l'operazione
        ourNumbers.stream()

                //richiamo IL tipo della lista che è un integer e con la '->' indico ciò che deve fare-
                //cioè deve riportarmi i numeri pari, quindi con il resto uguale '==' a 0!
                .filter(integer -> integer % 2 == 0)

                //con il collect ridefinisco il tipo di collection che deve ritornare,
                //in questo caso deve ritornare un Set!
                .collect(Collectors.toSet())

                //e con il forEach stampo gli elementi all'interno del set!
                //se provo a scrivere nella stessa sintassi di Greg- cioè 'integer -> System.out.println(ourNumbers)'
                //mi stampa per 5 volte tutti i numeri-
                .forEach(System.out::println);


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

        ourNumbers.stream()
                //come prima! richiamo il '.filter' e definisco il tipo della lista (sempre un integer)
                //questa volta dopo il '%2' metto '!=0' visto che i numeri dispari restituiscono un resto diverso da zero!
                .filter(integer ->  integer %2 != 0)

                //qua dico il tipo di collection che deve ritornare
                .collect(Collectors.toSet())
                //e così stampo gli elementi al suo interno, in questo caso
                //stamperà solo i numeri dispari!
                //metodo sout suggerito dal programma-
                .forEach(System.out::println);
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
        alice.stream()

                //il metodo '.map' che restituirà
                // "un flusso costituito dai risultati dell'applicazione della funzione data agli elementi di questo flusso"
                //in questo caso ritornerà le stringhe contenute in 'alice' tutte in maiuscolo!!
                //questa volta ho scritto l'operazione con il lambda!
                .map(string -> string.toUpperCase())

                //con il '.collect' posso far ritornare la lista iniziale in altri tipi di Collection!
                //quindi in Set, in Maps o di nuovo in una List!
                .collect(Collectors.toSet())
                .forEach(System.out::println);

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

        ourNumbers.stream()
                //oook qua come l'esercizio num uno per quanto riguarda il filter
                //uso sempre il lambda per definire l'operazione!
                .filter(integer -> integer %2 == 0)
                //anche qua uso il lambda e lo uso per far moltiplicare per due i numeri selezionati nel filter!
                .map(integer ->  integer *2)
                //colleziono tutto in un set
                .collect(Collectors.toSet())
                //e con il for each stampa!
                .forEach(System.out::println);

        //end
    }
}
