package FootballerDecorator;

import Footballer.*;

public class InjuryDecorator extends FootballerDecorator {

    public InjuryDecorator(Footballer footballer) {
        super(footballer);
        System.out.println("Ops! Footballer received a injury!");
        System.out.println("Stats after injury: [stamina=" + getStamina() + ", acceleration=" + getAcceleration() + ", strength=" + getStrength()+ "]");
    }

    public int getStamina() { return footballer.getStamina() - 20; }

    public int getAcceleration() { return footballer.getAcceleration() - 30; }

    public int getStrength() { return footballer.getStrength() - 15; }

    public boolean canPlay() { return false; }
}
