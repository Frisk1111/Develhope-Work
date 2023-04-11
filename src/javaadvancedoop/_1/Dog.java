package javaadvancedoop._1;

//con questo 'extends' vado a 'estendere' la classe 'Animal'!
//in questo modo in questa classe posso usufruire di tutte le variabili
// e metodi già presenti in 'Animal'

public class Dog extends Animal {

    //posso comunque aggiungere altri metodi e/o variabili c

    //'razza'
    String breed;


    // se é presente un costruttore con i parametri
    // nella classe 'Animal' allora dovrò farlo pure qua altrimenti darà una serie di errori
    Dog(double height, double weight, String breed) {
        //'super' richiama le variabili definiti nella classe 'animal'-
        //richiamerà anche i medesimi setter e getter
        super(height, weight);

        //visto che 'razza' l'ho definita qua in QUESTA classe
        // devo richiamarlo con il this e sotto devo mettere i suoi getter e setter
        this.breed = breed;

    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }


    //metodo per l'esercizio 3!
    double runSpeedMetersPerSecond() {
        return getHeight() * 2;
    }
}
