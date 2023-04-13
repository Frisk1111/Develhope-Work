package javaoopadvanced._2;


//esercizio 1-!
//keyword: extends! estende la classe stratta SHAPE!
//quindi anche i metodi in essa prensenti!
public class Rectangle extends Shape {



    //così gli do' i valori nel Main tramite l'istanza!
    Rectangle(double height, double width) {
        super(height, width); //<-- ho già messo un costruttore nello "shape"!
    }


    double area() {
        return this.height * this.width;
    }
}
