package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int number = 6;
        int numberPlus1= number + 1;
        System.out.println("My number plus 1: " + numberPlus1 );
        int numberMinus1= number - 1;
        System.out.println("My number minus 1: " +  numberMinus1);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        double number= 4.99;
        double numberTimes2 = number * 2;
        System.out.println("My number times 2: " + numberTimes2);
        double numberDividedBy2= number /2;
        System.out.println("My number divided by 2: " + numberDividedBy2);


    }

    /**
     * 3: We are going to convert the temperature from Celsius to Fahrenheit
     * <p>
     * Create a double variable called Celsius
     * <p>
     * Create a new variable called Fahrenheit
     * <p>
     * The variable Fahrenheit should be set as
     * Celsius times by 1.8 plus 32
     * <p>
     * Print out Celsius and Fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        double Celsius= 15.7;
        double Fahrenheit= Celsius * 1.8 + 32;
        System.out.println("temperature in Celsius: " + Celsius);
        System.out.println("temperature in  Fahrenheit: " + Fahrenheit);

    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        int age = 10;
        age++;
        age++;
        age++;
        age++;
        age++;
        System.out.println("My age now:" + age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        int age = 50;
        age -=50;
        System.out.println("My age now: " + age);
        int secondAge = 50;
        secondAge /= 5;
        secondAge /=2;
        secondAge -=5;
        System.out.println("My second age now:" + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 10;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}

