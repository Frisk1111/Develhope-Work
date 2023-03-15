package javabasics._15;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000; //soldi da investire
        double averageReturnFromStockMarketIndexPercentage = 8; //percentuale degli interessi
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0; //anni passati
        double interestGainedThisYearEuros = 0; //interessi annuali

        while (yearsPast <=5 || currentInvestmentValueEuros <= 15000) { //così si ferma dopo 5 anni o quando raggiunge 15k €!
            //1a: (currentInvestmentValueEuros <= 100000) !!

            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);

            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *   On days where it sells, it can only sell 1000 pounds for euros.
     *   Write a while loop
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *    to recalculate our rate every day (once per loop)
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2); //per dare la rata che l'addizione di una moltiplicazione con un num casuale e 2!
        int daysToSell = 0;  //giorni
        int remainingPoundsToSell = 10_000; //soldi rimanenti del bot!
        int maxPoundsToSellPerDay = 1_000; //OGNI GIORNO possiamo vendere MASSIMO 1000 pounds, NON DI PIù!!

        // Write your while loop here

        while(remainingPoundsToSell > 0){
            daysToSell++;  //così il numero di giorni incrementa!!

                    if(poundToEuroExchangeRate > 1.15){  //così vende SOLO se la rata è maggiore 1.15 !!

                        remainingPoundsToSell -= maxPoundsToSellPerDay;  //così ogni giorno toglierà 1k da 10k!!!

                        System.out.println("Day " +  daysToSell + " it reamains " + remainingPoundsToSell + "£");
                    } else {
                        System.out.println("Day " + daysToSell + "the exchange rate is: " + poundToEuroExchangeRate + " it's too low! So  i didn't sell the money! ");
                    }
            poundToEuroExchangeRate = 1 + (Math.random() * 0.2); //lo riscriviamo così nel ciclo lo ricalcola più volte con un altro num casuale!!
            //visto che stando fuori fa l'operazione solo UNA volta mentre a noi sevre che lo faccia PIù VOLTE!!

        }


        //end


        System.out.println("It took " + daysToSell + " to exit that cursed economy");
    }

    /*
     * 3: Write answers below for the following 4 situations, should we use a while, do while, for i or for each loop?
     *    Which would work best? Why?
     * Q Example: Print out the numbers 1 to 10
     * A Example: for i
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1:
     * Q2: We have a list of 1000 users to send emails to
     * A2: for each
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3:
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: while
     */

}