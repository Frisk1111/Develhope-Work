package javaoopadvanced._2;

//esercizio 3-!

//ECCO!
//qua ho esteso la classe 'Instrument' e facendo ciò
// mi richiedeva NON SOLO i field presenti in quella classe
// ma ANCHE quelli presenti nell'interfaccia!
// quindi anche il metodo 'play()'
public class Piano extends Instrument {


    Piano(String name, String brand) {
        super(name, brand);

    }


    @Override
    public String play() {
        return """
                \s
                \uD83C\uDFB6\s
                   \uD83C\uDFB6\s
                \uD83C\uDFB6\s
                      \uD83C\uDFB6\s
                                
                """;
    }
}
