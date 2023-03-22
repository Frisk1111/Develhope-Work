package javaoop.exercises._2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }


    /**
     * 1: Create a constructor inside Student that takes 'name' and 'age'
     * make sure to set the fields too using the 'this' keyword
     * Add a print statement to the constructor at the start saying "Constructing!"
     * Add a print statement to the constructor at the end* saying "Constructed!"
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentAges.size(); i++) {
            // Write create students
            Student valoriStudenti = new Student(studentNames.get(i), studentAges.get(i)); //creo una variabile di tipo STUDENT e dentro le parentesi
            // 'setto' i valori degli array così da metterli nel costruttore fatto nella CLASSE STUDENT

            students.add(valoriStudenti); //aggiungo il 'costruttore valoriStudenti' all'array students-
            // così in quegli array si ritrovano gli stessi valori del ciclo for i!!

        }

        System.out.println("tutti i valori negli array: " + students); //così qua stampo solo l'array 'students' che si
        // ritroverà anche i System.out presenti nel costruttore scritto nella classe STUDENT
    }


    /**
     * 2: Add 3 more constructors to student, remember you need to change the parameters
     * a constructor accepts in order to allow multiple.
     * a Constructor that takes only a student's age
     * a Constructor that takes only a student's name
     * a Constructor that does not take any parameters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        // Once you've added the correct constructors uncomment the code below, there should be errors!
        List<Student> students = Arrays.asList( //<<-- apertura array
                new Student("Alice", 33), //<<-- così richiama il costruttore IL PRIMO CSOTRUTTORE usato nell'esercizio 1!!

                new Student("Bob"), //<<-- così richiama il costruttore chestampa SOLO il nome

                new Student(33),  //<<--così richiama il costruttore che stampa SOLO l'età

                new Student() //<<-- così richiama il costruttore che ha 0 parametri!!
        ); //<<-- chisura array!
    }
}
