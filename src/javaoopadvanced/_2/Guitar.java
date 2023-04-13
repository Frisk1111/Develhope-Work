package javaoopadvanced._2;


//esercizio 3-!
public class Guitar extends Instrument {

    public Guitar(String name, String brand) {
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
