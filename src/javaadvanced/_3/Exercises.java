package javaadvanced._3;

import java.util.*;



public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here



        //ALLORA - metto tra le parentesi 'list' così da passargli TUTTI i valori-
        // ovviamente essendo un set provvederà all'eliminazione dei DOPPIONI !!
        //-- scriverlo nelle parentesi o fare 'prova.addAll(list)' da lo stesso risultato!
        Set<String> prova = new HashSet<>(list);


        //COSì RESETTO l'array! ADESSO ha ZERO argomenti!
        list = new ArrayList<>();


        //IMPORTANTE FARE IL CICLO così gli riassegno tutti i valori contenuti nel Set
        //a sto' punto ci ritroveremo con SOLO VALORI UNICI!!
        for (String prova1 : prova){

            //così LI AGGIUNGO all'array!!
            list.add(prova1);
        }


        //Risultato:
        System.out.println("\n RISULTATO ESERCIZIO 1: " + list);



        //END

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");



        //creo due set dove richiamerò la funzione "toSet" per convertire 'list' e 'set'
        //Per fare ciò dovrò metterli nelle parentesi tonde ti 'toSet' - come parametri- !

     Set <String> lista = toSet(list);
     Set <String> set2 = toSet(set);


        System.out.println("\n" + lista);

        System.out.println("\n" + set2);

        //END



    }



    // Write your method for exercise 2 here

    //creo quindi una funzione privata e statica che sia un set di tipo stringa
    //e di nome 'toSet' - nelle parentesi richiamo 'collection' così che posso convertire
    // senza problemi sia la lista che il set iniziali
    //faccio poi il return richiamando il costruttore di 'HashSet' e tra le parentesi tonde ritorno il
    //parametro!
    private static Set <String> toSet(Collection <String> collezione){
        return new HashSet<>(collezione);
    }

    //END

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here

        //key e valore per la map!
        // 'if no previous value exists, use 0 as the previous value.'
        //wordCount.put("contatore", 0);


        //primo ciclo for each
        for (String word : words) {

            //così nel put metto i valori di word! ovvero li stessi di words!!
            //lo metto come key visto che word e una lista di tipo string e la map di 'wordCount'
            //ha la key di tipo string!!
            wordCount.put(word, 0);
        }
        System.out.println("3: " + wordCount);



        //altro ciclo for- creo 'word'  gli assegno i valori di 'words'
        for (String word : words) {

            //questo ciclo è per la map 'wordCout'!! assegno ad entry TUTTO ciò che ha 'wordCount'
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {

                //"se la key di entry equivale a 'word' allora
                if (entry.getKey().equals(word)) {
                    // il value di entry è 'uguale' al suo stesso valore +1"
                    entry.setValue(entry.getValue()+1); //messo tra le parentesi per RIASSEGNARE IL VALORE!!
                }
            }
        }
        System.out.println("\n ESERCIZIO 3: " + wordCount);





        }


        //END
    }

    /*
     * 4: Answer the following questions
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: list
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: map
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: TreeSet
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: map
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: list
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: set
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: map
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: map
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: map
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: map
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: map
     */



