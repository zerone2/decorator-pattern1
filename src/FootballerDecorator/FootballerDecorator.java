package FootballerDecorator;

import Footballer.Footballer;

public abstract class FootballerDecorator implements Footballer {

    protected Footballer footballer;

    public FootballerDecorator(Footballer footballer) {
        this.footballer = footballer;
    }

    public int getStamina() { return footballer.getStamina(); }

    public int getAcceleration() { return footballer.getAcceleration(); }

    public int getStrength() { return footballer.getStrength(); }

    public boolean canPlay() { return footballer.canPlay(); }
}
