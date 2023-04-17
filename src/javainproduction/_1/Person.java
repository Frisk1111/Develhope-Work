package javainproduction._1;


//il record permette di scrivere in una semplice riga di codice
// i fields di una classe dentro a delle parentesi tonde,
// in questo modo non c'è per niente bisogno di creare a mano un costruttore
// con i fields visto che lo crea in automatico!
//INOLTRE crea già in automatico dei getter!!
public record Person (String name, int age, String favouriteColor){

    public String toString(){
        return "\n" + name + " - età: " + age
                + " || colore preferito: " + favouriteColor;
    }
}
