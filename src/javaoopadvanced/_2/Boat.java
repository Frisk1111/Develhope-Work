package javaoopadvanced._2;


//esercizio 2-!
//anche qua! 'IMPLEMENTS'!
public class Boat implements Movable {

    //messi public perché senza mi dava errore - :(
    @Override
    public String moveForward() {
        return "\n moving forward..";
    }

    @Override
    public String moveBackward() {
        return "\n moving back ward..";
    }
}
