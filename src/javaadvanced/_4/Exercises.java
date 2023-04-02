package javaadvanced._4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {


    //creato field privato e statico che crea un percorso per prendere il file 'file.txt'
    private static final Path MY_PATH = Paths.get("file.txt");

    //qua richiama il percorso della cartella in cui si trova il file! -
    //così richiamando questo field accedo alla cartella dove è presente il file
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */


    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            //così richiamo il field "MY_PATH" - per da crearlo!
            Files.createFile(MY_PATH);

            // Your code here


            //richiamo il PATH --percorso-- del file creato dentro il field "MY_PATH"!
            //in questo metodo bisogna prima scrivere il PATH
            // e dopo ciò che vogliamo aggiungere nel file
            //in questo caso aggiungiamo le frase scritte nel 'myString'
            //si possono usare string, string builder + il metodo 'toString'
            //oppure scriviamo direttamente tra le virgolette la frase che vogliamo inserire!
            Files.writeString(MY_PATH, myString);


            //end
        } catch (Exception exception) {

            //'.err' per far apparire la frase dentro le parentesi rosso - come un errore nel
            //caso in cui il try non andasse bene!
            System.err.println("There was an error!");

            //'Stampa lo stack delle funzioni che hanno portato all'eccezione' !
            //'serve in fase di debugging per capire dove
            //e perché si é verificato il problema' !
            exception.printStackTrace();

            //questo serve per arrestare il programma!
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here

            //così stampo ciò che c'è scritto in quel file! -
            //file che richiamo sempre con il field "MY_PATH"
            // dov'è praticamente 'salvato' il percorso
            System.out.println(Files.readString(MY_PATH));


            //end
        } catch (Exception exception) {

            //come prima- questo è ciò che mi stamperebbe se nel try ci fosse un errore!
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            // Your code here

            int contatore = 0;

            //così salvo il contenuto in questa string
            String contenutoFile = Files.readString(MY_PATH);


            //così ha tutti i contenuti della stringa sopra divisi tramite il metodo split!
            //in questo modo divido il contenuto per righe!
            String[] convertitoreArray = contenutoFile.split("\n");


            //ciclo for each e passo all'oggetto 'convertitore' i valori di 'convertitoreArray'
            //quindi anche lo split di 'contenutoFile' !
            for (String convertitore : convertitoreArray) {

                //'se convertitore è diverso da null'
                if (convertitore != null) {

                    //'fai contatore +1' ! -
                    //così conta le righe nel file!
                    contatore++;
                }

            }

            System.out.println(("RISULTATO: \n " + contatore));


            //end
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            // Your code here

            //come sopra - salvo i contenuti di 'MY_PATH' in questa stringa
            String contenutoFile = Files.readString(MY_PATH);

            int contatoreParole = 0;


            //ciclo for i che prende come riferimento la lunghezza della stringa 'contenutoFile'!
            for (int i = 0; i < contenutoFile.length(); i++) {

                //ogni volta che farà il controllo il valore del contatore aumenterà!
                contatoreParole++;
            }

            System.out.println("RISULTATO : \n " + contatoreParole);


            //per eliminare files!!
            Files.delete(MY_PATH);


            //end
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code


            //metodo per creare cartelle!
            //nelle parentesi richiamo 'myDirectoryPath' dove c'è scritto il nome della cartella!
            Files.createDirectories(myDirectoryPath);

            //end

            //così scrive dentro a quella cartella la frase che c'è accanto!
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");

            //prova
            System.out.println(Files.readString(PATH_IN_A_FOLDER));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
