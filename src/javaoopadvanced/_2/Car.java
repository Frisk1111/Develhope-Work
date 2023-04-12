package javaoopadvanced._2;


//esercizio 2-!
//keyword: implements!
//un interfaccia non può essere 'estesa' ma implementata nelle classi!
//possiamo estendere classi solo in altre classi!
public class Car implements Movable {

    //anche qua l'Override con i metodi dell'interfaccia!
    //come nelle classi astratte-
    //messi public perché senza mi dava errore - :(
    @Override
    public String moveForward() {
        //'prima'
        return """
                \s
                 --> 1*
                moving forward....""";

    }

    @Override
    public String moveBackward() {
        //'retromarcia'
        return """
                \s
                --> R
                moving backward....""";
    }
}
