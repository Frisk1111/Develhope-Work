package javaoopadvanced._3;

public class Exercises {

    public static void main(String[] args) {
//        exercise1();
        exercise2();
    }
    /**
     * 1:
     *.
     *.
     * Create a class called "Person" with fields for name, age, and address.
     *.
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *.
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        Person persona = new Person("Nyx", 16, "Via delle Viole 12");

        //per vedere se va il toString!
        System.out.println(persona);
        //end
    }

    /**
     * 2:
     *.
     *.
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *.
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *.
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Person persona = new Person("Alice", 16, "Via ELizabeth II");
        Person persona2 = new Person("Tobias Erin Rogers", 17, "Via rossa 06");


        //RICHIAMO la funzione HASHCODE dalla classe 'Person' così mi ritorna
        // "l'operazione" fatta al suo interno!!
        System.out.println(persona.hashCode() + "\n "
                + persona2.hashCode());



        //end
    }

    /***-
     * 3:
     *.
     * BONUS: Read about the nuances of hashcodes here:
     *.
     * https://www.baeldung.com/java-hashcode
     *.
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *.
     */
}
