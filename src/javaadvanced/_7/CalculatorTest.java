package javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class CalculatorTest {
    /**
     * 1:
     * ..
     * .
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * .
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * .
     * Verify that the methods return the correct result for each test case.
     * .
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        //SEMPRE richiamare prima la classe per i test!!
        Calculator calculator = new Calculator();

        //sistemato la funzione 'add' nella classe 'calculator' -
        //invece di essere 'a+b' era 'a-b' !
        Assertions.assertEquals(2, calculator.add(1,1));

        //Per i test bisogna iniziare con 'Assertions' e con ilk punto darà tutti i vari metodi che contiene
        //con questo metodo noi mettiamo il valore che ci aspettiamo che ci ritorni, dopo la virgola richiamiamo
        //l'istanza della classe con il metodo che vogliamo controllare -
        // in questo caso mettiamo noi i valori qua di quel metodo
        Assertions.assertEquals(0, calculator.subtract(1,1));

        //end
    }

    /**
     * 2:
     * .
     * .
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * .
     * Test the same kind of inputs as before as exercise 1
     * .
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here


        //SEMPRE richiamare PRIMA la classe!
        Calculator calculator = new Calculator();

        //in teoria così richiama la classe dell'eccezione che viene lanciata quando dividi un numero intero x zero
        //mi ricordo che il 'throw' si usa per 'lanciare' le eccezioni-
        // penso che questo test lanci appunto quell'eccezione
        // per il metodo 'divide' presente nella classe calculator
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0)); //<<-- qua tra parentesi mette i valori di 'a' e 'b'
                                                                                                // valori che porteranno all'eccezione!

        Assertions.assertEquals(4, calculator.multiply(2, 2) );
        Assertions.assertEquals(3, calculator.divide(9,3));

         // qua ho provato a lanciare un'eccezione seguendo la sintassi di sopra!
        //questo esercizio passa perché in effetti questa eccezione avviene se provo a dividere un int e una stringa!
        Assertions.assertThrows(NumberFormatException.class, () -> calculator.divide(10, Integer.parseInt("House")));


        //end

    }

    /**
     * 3:
     * .
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     * .
     * If there is an error you may have to change the code in Calculator to fix it!
     * .
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Calculator calculator = new Calculator();

        //se anche solo un di questi test fallisce allora tutto il test non va bene!

        Assertions.assertEquals(81, calculator.power(3,4));
        Assertions.assertEquals(3, calculator.power(3, 1));
        //Assertions.assertEquals(0, calculator.power(0, -1)); //<<-- tipo qua ho messo di aspettarmi 0 ma in realtà viene 'Infinity'






    }
}