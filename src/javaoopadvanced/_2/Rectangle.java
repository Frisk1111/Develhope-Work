package javaoopadvanced._2;


//esercizio 1-!
//keyword: extends! estende la classe stratta SHAPE!
//quindi anche i metodi in essa prensenti!
public class Rectangle extends Shape {

    private final double height;
    private final double width;

    //così gli do' i valori nel Main tramite l'istanza!
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //metodo presente nella classe astratta 'Shape'!
    //così li sto usando come un getter!
    @Override
    double height() {
        return this.height;
    }


    //metodo presente nella classe astratta 'Shape'!
    //così li sto usando come un getter!
    @Override
    double width() {
        return this.width;
    }

    double area() {
        return this.height * this.width;
    }
}
