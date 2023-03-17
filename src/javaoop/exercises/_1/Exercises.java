package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();

    }

    /*
     * 1: Create a new Class in this package
     *    Call this class 'Course'
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        // Use a for i loop


        for( int i= 0; i < studentNames.size(); i++ ) { //basta farlo SOLO UNA VOLTA così da assegnare la i anche a ages

            System.out.println(createNewStudent(studentNames.get(i), studentAges.get(i))); //richiamo la funzione 'createNewStudent'
            // e nella parentesi gli assegno gli INDICI di studentNames e studentAges!!
        }

    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();

        // Write your code here
        student.name = name ; //COSì RICHIAMO i valori di name DALLA CLASSE STUDENT!!
        student.age = age;  //STESSA COSA QUA!!



        return student;//il return perchè NON è void!!


    }











    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // Write your code here
        List<Student>  students = new ArrayList<>();
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);


        for(int i= 0; i < studentNames.size(); i++){
            Student student = createNewStudent(studentNames.get(i), studentAges.get(i)); //creiamo una nuova variabile di tipo STUDENT
              // e dentro richiamiamo la funzione di prima per poi di nuovo assegnargli gli INDICI di studentNames e Ages
            students.add(student); //con add lo aggiungiamo all'array 'students' la variabile di prima
        }
        System.out.println(students);


      int mediaEta = 0;

        for(Integer mediaEta1 : studentAges){
            mediaEta += mediaEta1;  //prendo la variabile definita nello scope globale
                  // e gli assegno i valori dell'oggetto con il '+=' così non solo gli vengono assegnati ma li somma tra loro come nel _14!!
        }
        double mediaEtaComeDouble = Double.valueOf(mediaEta); //lo trasformiamo in un double!
        mediaEtaComeDouble /= studentAges.size();

        System.out.println(mediaEtaComeDouble);



    }
}
