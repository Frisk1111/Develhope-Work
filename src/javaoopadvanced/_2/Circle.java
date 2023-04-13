package javaoopadvanced._2;


//esercizio 1-!
//keyword: extends! estende la classe stratta SHAPE!
//quindi anche i metodi in essa prensenti!
public class Circle extends Shape {



    //così gli do' i valori nel Main tramite l'istanza!
    Circle(double height, double width) {
        super(height, width);//<-- ho già messo un costruttore nello "shape"!
    }



    double area() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
