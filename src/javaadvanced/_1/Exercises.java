package javaadvanced._1;

import java.util.*;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();

        //i Set provvedono a levare i 'doppioni' e a tenere valori "unici"
        //gli HashSet sono un tipo di Set - in generale i Set 'scambiano' le posizioni dei vari elementi


        // Add some numbers using the add method
        // Your code

        ourSet.add(1); //aggiunti numeri al set che provvederà a rimuovere i 'doppioni'
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);


        //END

        if (ourSet.containsAll(Set.of(1, 5, 2))) { // erano presenti troppi '1' nella condizione!
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }

        System.out.println(ourSet);

        // Remove the element '1'
        // Your code
        ourSet.remove(1); //per rimuovere vari elementi

        //end

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");

        fruitsSet.addAll(fruitsSet); //qua prova a rimetterli solo che essendo un set i rimuove!

        //2a. What will this output? [ banana, orange, apple, kiwi, mango ]
        System.out.println(fruitsSet);

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output? [ banana, orange , apple, kiwi. grapes, pear, mango ]
        System.out.println(fruitsSet);
    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // Your code


        //così abbiamo i valori in ordine! i TreeSet hanno SEMPRE i numeri in ordine
        Set<Integer> numero = new TreeSet<>();

        numero.addAll(numbers); //aggiungiamo TUTTI i valori di 'numbers' a 'numero'

        //così number avrà gli stessi valori di numbers!
        for (Integer number : numbers) {

            //altro ciclo each per assegnare a un oggetto i valori di 'numero'
            for (Integer numeri2 : numero) {

                if (numeri2 > number) {
                    max = numeri2; //avvolte mi dà il 10 altre volte no- penso perché essendo un Set
                    // continua a ogni loop a cambiare la posizione dei numeri! però il mio ragionamento va!
                }


                // qua faccio la comparazione tra i due oggetti metto prima 'numeri2'
                // visto che mostra i numeri in ordine!
                if (numeri2 < number) {

                    // assegno a min il valore di numeri2 che sarà per forza di cose IL PIù PICCOLO
                    min = numeri2;

                    break;
                }

            }






            System.out.println(max + " " + min); //fatto per vede' che cacchio succede dentro il loop


        }
        System.out.println("\n RISULTATO FINALE: "+max + " " + min);
       //END


        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }

        // 3b. Find which items from set-a are also in set-b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();

        // Your code

        for (Integer numeri : setA){ //for nested!! - assegno all'oggetto 'numeri' i valori del Set 'setA'
             //tramite il ciclo for- creo poi un altro loop dove farò una comparazione tra i valori di 'setA'
            //e 'setB'


            for (Integer numeri2: setB) { //anche qua prima creo un oggetto a cui assegno i valori di 'setB'

                if(numeri.equals(numeri2)){ //ciclo if in cui faccio la comparazione
                    itemsContainedInBothSets.add(numeri); //così assegna i valori che stanno
                    // sia in 'setA' che in 'setB' nel Set 'itemsContainedInBothSets'
                }

            }

        }

        //END

        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");


        } else {
            System.out.println("\n 3b. Correct number of items in itemsContainedInBothSets");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        int min = Integer.MAX_VALUE;
        // Your code

        for (Integer numeri : orderedNumbers){ //ciclo for each - assegniamo all'oggetto 'numeri'
                                              //i valori di 'orderedNumbers'

            if(min > numeri){ //se min è maggiore di numeri - cioè sempre! -
                min = numeri; //ALLORA assegna a min il valore di 'numeri' che sarà quello PIù PICCOLO tra tutti!!
            }


        }

        System.out.println("\n risultato esercizio 4.a : " +min); //prova x vedere il risultato finale -
        // fatto fuori dal loop così vediamo il RISULTATO FINALE!

        //END

        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
}
