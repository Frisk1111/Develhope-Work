package javabasics._12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1 - String score:");
        exercise1("Java runs on over 2 billion devices", 15);
        exercise1("+31 2 58765446", 48);
        exercise1("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exercise2("sandwich", 2.5, 12.5);
        exercise2("soup", 10, 30);
        exercise2("soup", 1, 5);
    }

    /**
     * 1: We are going to 'score' strings, given a string you are to calculate its score based on the following factors.
     *    Start with a base score of the string's length, this is the starting score. Use .length() on a string
     *    The Maximum starting score is 20, if a score is over 20. Set it to 20.
     *    If the string contains the letter a, -5 from the score
     *    If the string is all lowercase, add 10 to the score.
     *   If the score is now over 20, times it by 2
     */
    public static double exercise1(String text, double expectedScore) {
        double yourScore = 0;

        // Start your code here
        yourScore = text.length(); //così il mio punteggio è uguale alla lunghezza del testo!!

        if (yourScore > 20){
            yourScore = 20; //se è mag di 20 allora lo rimetto a 20
        }
        if(text.contains("a")){
         yourScore -= 5; //se contiene la lettera "a" (il testo) allora sono -5 pt!
        }
        if (text == text.toLowerCase()){
            yourScore += 10; //se il testo è tutto in minuscolo allora sono +10 pT!!
        }
        if(yourScore > 20){
            yourScore *= 2; //se ora il mio punteggio è maggiore di 20 lo moltiplico x2!!
        }


        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println(" - Failed: Wrong score for '" + text +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourScore;
    }

    /**
     * 2: We are going to 'score' a meal, given a string of mealType you are to calculate its score based on the following factors.
     *    For the meal type sandwich calculate score like the following: 5 * weight
     *    For the meal type of soup calculate score like the following 3 * weight
     *    The minimum score should be 5, if a score is lower than this increase it to 5
     */
    public static double exercise2(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;
        // Start your code here

         if (mealType.contains("sandwich")){
             weight *=5; //peso sandwich moltiplicato x5!
         } else if (mealType.contains("soup") ){
             weight *= 3;   //peso zuppa moltiplicato x3!
             if(weight < 5){ //se il peso è min di 5 allora lo faccio diventare 5!
                 weight = 5;
             }
         }
         yourMealScore = weight; //così il mio punteggio è uguale al peso!
        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println(" - Failed: Wrong score for '" + mealType +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourMealScore;
    }
}

