package javaoopadvanced._2;

//esercizio 3-!
//posso implementare in una classe astratta un'interfaccia!
//in questo modo estendendo poi questa classe in altre classi
//estenderò anche I METODI PRESENTI NELL'INTERFACCIA!
public abstract class Instrument implements Playable {


    abstract String name();

    abstract String brand();

    //anche qua public altrimenti mi dava errore!
    abstract public String play();
}
