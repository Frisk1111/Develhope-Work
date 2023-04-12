package javaoopadvanced._2;


//esercizio 3-!
public class Guitar extends Instrument {

    private final String name;
    private final String brand;

    public Guitar(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    @Override
    String name() {
        return this.name;
    }

    @Override
    String brand() {
        return this.brand;
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
