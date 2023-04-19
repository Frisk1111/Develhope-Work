package javainproduction._3;

import org.junit.jupiter.api.Assertions;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
//        exercise2();
        exercise3();
    }

    /**
     * 1:
     * .
     * The following code is supposed to do a factorial of the number five, which looks like this: 5*4*3*2*1 = 120
     * .
     * Find and fix the error using the debugger
     * .
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);
    }

    private static int calculateFactorial(int number) {
        //Fix this code

        int result = 1;

        //reso 'i-=1'! così a ogni ciclo leva dalla variabile 'number' solo uno!
        //prima era 'i -=2' così però portava il risultato finale solo fino a 15
        //visto che a ogni ciclo levava due dalla variabile 'number'
        for (int i = number; i >= 1; i -= 1) {
            result = result * i;
        }
        return result;
    }

    /**
     * 2:
     * .
     * The following code is supposed to reverse a string
     * .
     * Find and fix the error using the debugger
     * .
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh", reversedString);
    }

    private static String reverseString(String input) {
        //Fix this code

        //reso uno string builder!
        StringBuilder reversed = new StringBuilder();
        //quindi: 'i uguale alla lunghezza dell'input - 1'
        //' i è maggiore e/o uguale a zero e per perciò a ogni ciclo fai i-1!'
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * 3:
     * .
     * The following code is supposed to check if a number is positive or negative
     * but there is a semantic error in the if statement.
     * .
     * Find and fix the error using the debugger
     * .
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Assertions.assertFalse(isPositive(-5));
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertFalse(isPositive(0));
        Assertions.assertTrue(isPositive(5));
        Assertions.assertTrue(isPositive(55));
        Assertions.assertTrue(isPositive(4567));
    }

    private static boolean isPositive(int num) {
        //Fix this code
        //così per i primi tre assertions darà false!
        return num > 0;
    }
}
