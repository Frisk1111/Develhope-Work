package javabasics._17;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000L;

        //Add the questionable funds to your bank balance and print it out!
        long totalEuro = myBankBalanceEuro + questionableFundsEuro;

        System.out.println("My bank account now has:" + totalEuro);
    }

    /*
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age -- byte
     *    2b: The age of a baby in months -- byte
     *    2c: Money in a hedgefund in euros -- float
     *    2d: Price of a good in euros on amazon.com -- short
     *    2e: The exact weight of an apple measured by scientific equipment -- short
     *    2f: The number of kilometers from any 2 places in the world -- float
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        LocalDate localDate = LocalDate.of(2023, Month.AUGUST, 15); //<<--- così "creiamo" altri giorni
        LocalDate localDate3 = LocalDate.of(2022, Month.JULY, 4);

        System.out.println(localDate.getDayOfMonth()); //<<--- prende il giorno della settimana

        System.out.println(localDate.getDayOfWeek());//<<--- dice il nome della settimana

        System.out.println(localDate.getDayOfYear());//<<--- prende il giorno dell'anno

        System.out.println(localDate.getMonthValue()); //<<--- prende il valore del mese

        System.out.println(localDate3.getMonth()); // <<--- prende il valore del mese, in questo caso luglio

        System.out.println(localDate3.isBefore(localDate)); //<<--- vede se "localdate3" è PRIMA di "localDate" e stampa il valore in boolean!

        System.out.println(localDate.isAfter(localDate3)); //<<--- vede se "localdate" è DOPO "localDate3" e stampa il valore in boolean!



    }




}
