package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }


    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        // Write your code for 1a here
        for ( Integer sum : itemsA ){
          sumForA += sum; //così assume i valori di sum, che equivalgono a quelli di itemsA, e li somma tra di loro!!
        }                 //1* ciclo = assume il valore 1 - 2* c= somma uno al secondo valore, 56
                          //- 3* c= a 57 aggiunge il terzo e ultimo valore cioè 23, così otteniamo 80!!
        System.out.println(sumForA); //lo si fa fuori perchè se lo facciamo dentro da la somma di tutti e 3 i cicli, così da la somma finale

        //end


        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        // Write your code for 1b here
        for (Integer sum1 : itemsB){
            sumForB += sum1;   //stessa cosa qua! la stessa spiegazione di prima!!
        }
        System.out.println(sumForB);

        //end

        System.out.println("\nExercise 1c:");

        int sumForC = 0; //variabile a cui dobbiamo dare il risultato dell'addizione dei valori dell'array

        // Write your code for 1c here, refer back to the lesson to check the for i syntax

        for (int i = 0; i < itemsA.size(); i++){
            sumForC= sumForC + itemsA.get(i); //qua applichiamo a sumforC i valori di ItemsA(degli index!! per ciò quel "ItemsA.get(i)"!!)
                                 // invece di applicare quei valori a un oggetto prendiamo direttamente l'array!
                               //invece di fare quel "+=" facciamo "index ++" - visto che si tratta del ciclo for i!!
        }

        System.out.println(sumForC);
        //end

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
         minNumber = items.get(0); //qua gli assegnamo solo UN valore e lo confrontiamo dopo nell'if!
         maxNumber = items.get(0); // qua visto che dobbiamo trovare valori specifici e meglio assegnare fuori
                                  // un valore casuale e tramite l'if assegnargli quello che ci interessa

        for (Integer num1 : items){  //ANCHE QUA COME NEL PRIMO ESERCIZIO!! creaiamo un oggetto e gli assegnamo i valori dell'array!!
            if (minNumber > num1){
                minNumber = num1;     //così durante i cicli se il valore non è min allora lo cambia finchè non lo sarà
            } else if (maxNumber < num1){ //visto che qua num1 sarà maggiore allora maxnum dopo assumerà il medesimo valore!
                maxNumber = num1; //assumerà un valore di num1, quello maggiore!
            }
        }
        System.out.println(minNumber + " " + maxNumber );

        //end
    }

    /**
     * 3: Edit the for I loop below -so it only prints the first 2 names.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < 2 ; // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below -so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        for (
                int timesTableCurrentValue = 8; // <---- Edit this line
                timesTableCurrentValue <= 80; // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + 8// <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue);
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the for-i loop below, write another for-i loop to complete all
     * the multiplication tables between 1-10.
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        System.out.println("\nExercise 5:");

        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your for I loop here


            System.out.println("\n tab : 2");

            for (timesTableNumber = 2; timesTableNumber <=20 ; timesTableNumber+=2) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 3");

            for (timesTableNumber = 3; timesTableNumber <=30 ; timesTableNumber+=3) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 4");

            for (timesTableNumber = 4; timesTableNumber <=40 ; timesTableNumber+=4) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 5");

            for (timesTableNumber = 5; timesTableNumber <=50 ; timesTableNumber+=5) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 6");
            for (timesTableNumber = 6; timesTableNumber <=60 ; timesTableNumber+=6) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 7");

            for (timesTableNumber = 7; timesTableNumber <=70 ; timesTableNumber+=7) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 8");

            for (timesTableNumber = 8; timesTableNumber <=80 ; timesTableNumber+=8) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 9");

            for (timesTableNumber = 9; timesTableNumber <=90 ; timesTableNumber+=9) {
                System.out.println(timesTableNumber);
            }
            System.out.println("\n tab : 10");

            for (timesTableNumber = 10; timesTableNumber <=100 ; timesTableNumber+=10) {
                System.out.println(timesTableNumber);
            }
        }
    }
}