package javaadvanced._7;

// You can change any code in this class if you think there is a bug!
public class Calculator {
    public int add(int a, int b) {
        return a + b; //prima era 'a - b'! ho levato il meno e messo il +!
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * a;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double power(double base, double exponent) {

        //.pow serve per far ritornare i numeri alla corrispettiva potenza!
        //es: 3_ elevato a 4_  è 81 - per fa ritornare questo risultato
        //mettiamo tra le parentesi PRIMA la base e poi l'esponente (4)!
        return Math.pow(base,exponent ); //<<-- prima era invertito! era: '(exponent, base)'
    }
}

