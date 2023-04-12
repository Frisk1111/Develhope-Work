package javaoopadvanced._1;


public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * ..
     * .
     * Create a class called "Dog" that extends the Animal class.
     * .
     * Add a new field called "breed" to the Dog class.
     * .
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * .
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        String razza = "Golden Retriever";

        Dog dog1 = new Dog(63.0, 32.0, razza);

        //per stamparlo
        dog1.printDog();


        //end
    }


    /**
     * 2:
     * .
     * .
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * .
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * .
     * Also create constructors, getters and setters
     * .
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        double aperturaAlare = 85.0; //apertura alare del barbagianni messa in cm

        String specie = "Guppy";

        Fish guppy = new Fish(2.0, 0.75, specie);

        //per stamparlo
        guppy.printFish();

        //il peso è in kg- ho messo il peso del barbagianni
        Bird barbagianni = new Bird(33.0, 0.43, aperturaAlare);

        System.out.println("\n Barbagianni: ");
        barbagianni.printBird();


        //end
    }


    /**
     * 3:
     * .
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * .
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here


        Dog dog = new Dog(64.0, 33.0, "Coonhoud");

        Fish fish = new Fish(2.0, 1.9, "Sgombro");

        //dati approssimati del condor
        Bird bird = new Bird(130.0, 15.5, 300.0); //apertura alare in cm!

        //per vedere se il condor è più veloce
        double operation = bird.flySpeedMetersPerSecond() - fish.swimSpeedMetersPerSecond()
                - dog.runSpeedMetersPerSecond();

        //per vedere se il cane è più veloce
        double operation2 = dog.runSpeedMetersPerSecond() - fish.swimSpeedMetersPerSecond()
                - bird.flySpeedMetersPerSecond();

        //per vedere se il pesce è il più veloce
        double operation3 = fish.swimSpeedMetersPerSecond() - dog.runSpeedMetersPerSecond()
                - bird.flySpeedMetersPerSecond();


        if (operation > 0) {
            System.out.println("\nThe Condor has the fastest movement! ");
        } else if (operation2 > 0) {
            System.out.println("\n The dog has the fastest movement! ");
        } else if (operation3 > 0) {
            System.out.println("\n The fish has the fastest movement! ");
        }


        //end

    }
}
