package javaadvancedoop._1;

public class Fish extends Animal {

    String species;

    Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }


    void setSpecies(String species) {
        this.species = species;
    }

    String getSpecies() {
        return species;
    }

    //metodo per l'esercizio 3!
    double swimSpeedMetersPerSecond() {
        return getWeight() * 2;
    }

}
