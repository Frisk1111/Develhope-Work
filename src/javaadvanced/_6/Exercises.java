package javaadvanced._6;

public class Exercises {
    public static void main(String[] args) {


        exercise1();

        exercise2();

        exercise3();

        exercise4();

        exercise5();


    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * .
     * .
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * .
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here


        //assegno all'oggetto 'Days' chiamato 'giorni' i valori dell'enum 'Days'!
        //QUINDI tutti i giorni della settimana!
        for (Days giorni : Days.values()) {

            //così stampo il getter che farà il return
            // dei valori scritti tra le parentesi tonde vicino ai fields!
            System.out.println(giorni.getValues());
        }

        //end

    }

    //my enum
    private enum Days {

        //per gli enum la sintassi è questa!
        //non hanno bisogno di un'istanza e ci si possono
        //accedere richiamando il nome + i metodi a loro interno scritti!!
        MONDAY("monday"), //<<-- qua assegno il valore del costruttore!!
        TUESDAY("tuesday"), //<<-- qua assegno il valore del costruttore!!
        WEDNESDAY("wednesday"), //<<-- qua assegno il valore del costruttore!!
        THURSDAY("thursday"), //<<-- qua assegno il valore del costruttore!!
        FRIDAY("friday"), //<<-- qua assegno il valore del costruttore!!
        SATURDAY("saturday"), //<<-- qua assegno il valore del costruttore!!
        SUNDAY("sunday"); //<<-- qua assegno il valore del costruttore!!


        //string che userò nel costruttore!!
        private String values;

        //ecco qua! per rimettergli il valore semplicemente
        // lo scrivo tar le parentesi tonde nei fields sopra-!!
        Days(String values) {
            this.values = values;
        }

        //così ritorno i valori scritti tra le parentesi-!
        //potevo anche scrivere solo i fields con i nomi della settimana e richiamare il costruttore sopra
        // ma questo è per abituarmi a usare di più il getter-!!
        private String getValues() {
            return values;
        }


        //END

    }

    /**
     * 2:
     * .
     * .
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * .
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here


        for (Season Mesi : Season.values()) {

            //meglio uno switch per questo esercizio!
            //così x ogni caso mi stampa i valori a loro assegnati!
            switch (Mesi) {
                case SPRING -> System.out.println("Spring: " + Mesi.getValues());
                case SUMMER -> System.out.println("Summer: " + Mesi.getValues());
                case FALL -> System.out.println("Fall: " + Mesi.getValues());
                case WINTER -> System.out.println("Winter: " + Mesi.getValues());

            }
        }


    }

    //MY ENUM!!
    private enum Season {
        SPRING("March", "April", "May"), //<<-- qua assegno il valore del costruttore!!
        SUMMER("June", "July", "August"), //<<-- qua assegno il valore del costruttore!!
        FALL("September", "October", "November"), //<<-- qua assegno il valore del costruttore!!
        WINTER("December", "January", "February"); //<<-- qua assegno il valore del costruttore!!

        private String values;

        //così posso mettere più valori tra le parentesi!
        Season(String mese1, String mese2, String mese3) {
            this.values = mese1 + " " + mese2 + " " + mese3; //<-- immagazzino questi più parametri dentro a 'this.values'
        }

        //x ritornare i valori
        private String getValues() {
            return values; //<-- così mi ritornano i mesi con gli spazi!
        }

        //END OF MY CODE!
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here


        for (TrafficLight color : TrafficLight.values()) {


            //ok? ho dato come input_ il colore di uno delle luci del semaforo
            if (color.colorOfTheLight.equals("YELLOW")) {

                //con questo passa direttamente agli altri..
                continue;

            }
            //qua mi stampa solo due infatti e non tutti e tre-
            //quei due che mi stampa dipende da
            // cosa metto nella condizione di sopra tra le virgolette
            System.out.println(color.getColorOfTheLight());

        }

        //end

    }


    //my enum

    private enum TrafficLight {
        FIRST_LIGHT("GREEN"),
        SECOND_LIGHT("YELLOW"),
        THRID_LIGHT("RED");

        String colorOfTheLight;

        TrafficLight(String colorOfTheLight) {
            this.colorOfTheLight = colorOfTheLight;
        }

        private String getColorOfTheLight() {
            return colorOfTheLight;
        }

    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        //ciclo for each a cui assegno i valori di 'Day' all'oggetto 'giorni'
        for (Day giorni : Day.values()) {


            if (!giorni.getIsWeekend()) {
                //COSì STAMPA PRIMA I VALORI FALSI!!! -
                //con quel '.name' richiamo i NOMI DEI VALORI!
                System.out.println("\n" + giorni.name() + " <- is weekend? " + giorni.getIsWeekend() + "\n...oh :((");
            } else {
                //QUA mi stampa i valori VERI MESSI Nell'enum 'Day'!!
                System.out.println("\n" + giorni.name() + " <- is weekend? " + giorni.getIsWeekend() + "\n YAAYY :DD");
            }

        }


        //end
    }

    //my enum


    //è stato meglio crearne uno nuovo di enum con solo i valori booleani!
    private enum Day {

        MONDAY(false), //<<-- qua assegno il valore del costruttore!!
        TUESDAY(false), //<<-- qua assegno il valore del costruttore!!
        WEDNESDAY(false), //<<-- qua assegno il valore del costruttore!!
        THURSDAY(false), //<<-- qua assegno il valore del costruttore!!
        FRIDAY(false), //<<-- qua assegno il valore del costruttore!!
        SATURDAY(true), //<<-- qua assegno il valore del costruttore!!
        SUNDAY(true); //<<-- qua assegno il valore del costruttore!!


        //IMPORTANTE definire PRIMA la variabile NON INIZIALIZZATA!
        private Boolean isWeekend;


        //costruttore per il valore boolean 'isweekend'
        Day(Boolean isWeekend) {
            this.isWeekend = isWeekend;
        }

        //getter così mi ritornano i valori messi prima tra le parentesi!
        private Boolean getIsWeekend() {
            return isWeekend;
        }
        //end

    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        //VALORI DA METTERE COME PARAMETRI D'INGRESSO!
        int num1 = 5;
        int num2 = 2;


        System.out.println("\nRISULTATO ADDIZIONE : " + Operator.ADD(num1, num2));             //<<-- metto i numeri di prima come parametri - così li riassegno nelle funzioni di sotto
        System.out.println("\nRISULTATO SOTTRAZIONE : " + Operator.SUBTRACT(num1, num2));     //e le funzioni provvederanno a fare le operazioni corrispondenti ai loro nomi
        System.out.println("\nRISULTATO MOLTIPLICAZIONE : " + Operator.MULTIPLY(num1, num2)); // e alla fine ritornerà il risultato!
        System.out.println("\nRISULTATO DIVISIONE : " + Operator.DIVIDE(num1, num2));


        //end
    }


    //my enum!
    private enum Operator {

        //ALLORA - ALLORA - ALLORA
        //definisco prima qua sopra i field!
        //SEMPRE definirli e dopo gli riassegno i valori facendo delle funzioni!
        ADD(),
        SUBTRACT(),
        MULTIPLY(),
        DIVIDE();



        //DEFINISCO questi metodi che chiamo come i field sopra e metto il tipo 'Integer'
        //metto come parametri due int e dentro faccio l'operazione corrispondente al nome della funzione!
        //faccio poi il return dell'operazione!!

        static Integer ADD(int num1, int num2) { //<<-- static così richiamo il metodo con il NOME DELLA CLASSE DELL'ENUM!

           int operazione = num1 +num2;
            return operazione; //<<-- così ritorna il risultato
        }

        static Integer SUBTRACT(int num1, int num2){ //<<-- static così richiamo il metodo con il NOME DELLA CLASSE DELL'ENUM!

            int operazione = num1 - num2;
            return operazione; //<<-- così ritorna il risultato
        }

        static Integer MULTIPLY(int num1, int num2){ //<<-- static così richiamo il metodo con il NOME DELLA CLASSE DELL'ENUM!

            int operazione = num1 * num2;
            return operazione; //<<-- così ritorna il risultato
        }

        static Integer DIVIDE(int num1, int num2){ //<<-- static così richiamo il metodo con il NOME DELLA CLASSE DELL'ENUM!

            int operazione= num1 / num2;
            return operazione; //<<-- così ritorna il risultato
        }
    }

    //END enum


}



