import Footballer.*;
import FootballerDecorator.*;

public class MakePlayer {
    public static void main(String[] args) {

        Footballer Hargreaves = new InjuryDecorator(new SimpleFootballer(30, 80, 30));
        System.out.println("Is footballer able to play? " + Hargreaves.canPlay());
        System.out.println();

        Footballer suarez = new RedCardDecorator(new SimpleFootballer(80, 80, 80));
        System.out.println("Is footballer able to play? " + suarez.canPlay());
        System.out.println();

        Footballer messi = new StrikerDecorator(new SimpleFootballer(80,90,70));
        System.out.println("Is footballer able to play? " + messi.canPlay());

    }
}
