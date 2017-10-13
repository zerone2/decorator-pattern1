package FootballerDecorator;

import Footballer.*;

public class RedCardDecorator extends FootballerDecorator {

    public RedCardDecorator(Footballer footballer) {
        super(footballer);
        System.out.println("Ops! Footballer got a red card!");
    }

    public int getStamina() { return footballer.getStamina(); }

    public int getAcceleration() { return footballer.getAcceleration(); }

    public int getStrength() { return footballer.getStrength(); }

    public boolean canPlay() { return false; }
}
