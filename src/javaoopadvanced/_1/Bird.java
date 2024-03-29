package javaoopadvanced._1;

public class Bird extends Animal {

    double wingSpan;

    Bird(double height, double weight, double wingSpan) {
        super(height, weight);

    }

    void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }


    double getWingSpan() {
        return wingSpan;
    }

    void printBird(){
        System.out.println("\n" + getWingSpan() + "\n peso: "
                + getWeight() + " - altezza: " + getHeight());
    }


    //metodo per l'esercizio 3!
    double flySpeedMetersPerSecond() {
        return getWingSpan() * 4;
    }
}
