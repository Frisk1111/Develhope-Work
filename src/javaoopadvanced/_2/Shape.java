package javaoopadvanced._2;


//esercizio 1-!
//hey word: abstract- usato anche per i metodi!
public abstract class Shape {

    //si possono definire variabili nelle classi astratte- anche i costruttori!
    double height;

    double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
