package javaoopadvanced._2;

//esercizio 3-!
//posso implementare in una classe astratta un'interfaccia!
//in questo modo estendendo poi questa classe in altre classi
//estenderò anche I METODI PRESENTI NELL'INTERFACCIA!
public abstract class Instrument implements Playable {


    String name;

    String brand;

    //il costruttore può essere implementato nelle classi astratte!
    Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }


    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    //anche qua public altrimenti mi dava errore!
    abstract public String play();
}
