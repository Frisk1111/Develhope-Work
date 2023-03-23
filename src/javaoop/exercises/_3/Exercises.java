package javaoop.exercises._3;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *    Then create getters and setters for each of these 5 fields.
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!

        //ma prima:
        String nomiStudenti = null;
        Integer etaStudenti = null;
        int massimoDistudenti = 25;

        String nomeCorso = "Biologia";

        Student informazioniClasse = new Student(); //<<--- così con questa variabile richiamerò i vari setter e getter!!


        List<String> studentNames = Arrays.asList("Josie", "Lisa", "Alex"); //<<--- così assegnerò questi valori al setter di Names!!
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        for (int i = 0; i < studentNames.size(); i++) { //<<--- ciclo for each perchè più corto

            nomiStudenti = studentNames.get(i); //<<-- così gli do gli INDICI degli arrya!!
            etaStudenti = studentAges.get(i);



            informazioniClasse.setNames(nomiStudenti); //<<-- IMPORTANTE settarlo dentro il for così li fa 'circolare' tutti!!

            informazioniClasse.setAge(etaStudenti);


            System.out.println(informazioniClasse.getNames()); //<<-- scritto nel ciclo così stampa tutti i valori degli array!!

            System.out.println(informazioniClasse.getAges());

        }



        informazioniClasse.setCourseName(nomeCorso); //<<-- così setto il nome del corso


        informazioniClasse.setMaxStudents(massimoDistudenti); //<<--- così setto il massimo numero di studenti

        informazioniClasse.setStudentsPresentNow(studentNames.size()) ; //<<--- così setto gli alunni presenti tramite la lunghezza dell'array che contine i loro nomi!

        System.out.println(informazioniClasse.getCourseName());

        System.out.println(informazioniClasse.getMaxStudents());

        System.out.println(informazioniClasse.getStudentPresentNow());





    }

    /**
     * 2: Create 3 setter constraints for the student class
     *    Think about what reasonably constraints are?
     *    Should a student be able to be a negative age?
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student prova = new Student();


        //contatore!!

        String nomeCorso = "Chimica";

        prova.setCourseName(nomeCorso); //così setto il nome del corso

        System.out.println(prova.getCourseName()); //così stampo il getter finché farà il return del valore settato prima!
        //ovviamente più lo stampo più incrementa il valore del contatore -- nel setter c'era il "contatore++"

        System.out.println(prova.getCourseName());

        System.out.println(prova.getCourseName());


        Student.getContatore(); //la richiamo con la CLASSE STUDENT --
         // le FUNZIONI static devono essere richiamate tramite la CLASSE


        //fine


        //constraints!
        System.out.println("\n constraints:");

        prova.setNames("Ant0nio"); //per vedere se rileva i numeri nel nome


        prova.setAge(-1); //per vedere se riconosce il num negativo



        prova.setCourseName("B1ol0gi4"); //per vedere se rileva i numeri nel nome



    }

}
