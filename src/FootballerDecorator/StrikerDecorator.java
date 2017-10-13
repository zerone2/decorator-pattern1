package FootballerDecorator;

import Footballer.*;

public class StrikerDecorator extends FootballerDecorator {

    public StrikerDecorator(Footballer footballer) {
        super(footballer);
        System.out.println("Real Striker has been achieved!");
        System.out.println("Stats of striker: [stamina=" + getStamina() + ", acceleration=" + getAcceleration() + ", strength=" + getStrength()+ "]");
    }

    public int getStamina() { return footballer.getStamina() + 30; }

    public int getAcceleration() { return footballer.getAcceleration() + 30; }

    public int getStrength() { return footballer.getStrength() + 20; }

    public boolean canPlay() { return true; }
}
