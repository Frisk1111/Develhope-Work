package javaadvanced._2;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();

        // 1b. Add 3 elements to the map .put

        myFirstMap.put(30, "NY");
        myFirstMap.put(69, "Bangkok");  //a differenza delle array list e dei set
        myFirstMap.put(43, "Tokyo");   // per aggiungere elementi alla Map bisogna fare '.put'!!


        //end

        // 1c. Print the map
        System.out.println(myFirstMap); //così stampa TUTTI gli elementi della map!
        //end

        // 1d. Access an element in the map with .get

        System.out.println(myFirstMap.get(30)); //così stampa SOlO la value della key '30'!!

        //end

        // 1e. Remove an element from the map .remove

        myFirstMap.remove(30); //sia nel .remove che nel .get va messo la "key" -
        // qua eliminerà la key '30' e la value associata!

        //end

        // 1f. Print the map again to confirm the element was removed
        System.out.println(myFirstMap);
        //end
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        // Your code



        //do a entry tutti i valori della Map -quindi sia il valore della key che del value
        for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()){


            //nel .get va messo una key - che in questo caso equivale a una stringa - invece di mettere
            //una frase ci metto dentro il valore di 'mostExpensiveMenuItemName'

            if(mostExpensiveMenuItemName == null ||
                                      //messo tra le parentesi per RIASSEGNARE IL VALORE!!
                    entry.getValue() > menuCostsInEuro.get(mostExpensiveMenuItemName) ){

                   // ^
                //qua sarebbe come dire: "se la value di entry e maggiore di menuCosts
                // - a cui abbiamo messo tra le parentesi il valore di mostExpensive che equivale a null -
                // allora dai a mostExpensive il valore della key di entry!


                //così assume il valore della Key di entry - la key che ha il valore maggiore tra tutti
              mostExpensiveMenuItemName = entry.getKey();




            }


        }

        System.out.println("\n risultato esercizio 2a --> " + mostExpensiveMenuItemName);



        //end.

        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight

        // Your code

        for (Map.Entry<String, Integer> pesoFrutta : fruitWeights.entrySet()) {

            //assegno a 'totalWeight' i value di 'pesoFrutta' --gli stessi presenti nella map 'fruitWeights'
            // e l'operatore '+' prima dell'uguale farà in modo di sommare tra loro dentro il loop
            // tutti i value di 'pesoFrutta'!
            totalWeight += pesoFrutta.getValue();

        }

        System.out.println("\n Risultato esercizio 3 --> " + totalWeight);
        //end!

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
