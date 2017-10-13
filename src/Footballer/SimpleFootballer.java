package Footballer;

public class SimpleFootballer implements Footballer {

    private int stamina;
    private int acceleration;
    private int strength;

    public SimpleFootballer(int stamina, int acacceleration, int strength) {
        this.stamina = stamina;
        this.acceleration = acacceleration;
        this.strength = strength;
        System.out.println("Footballer is ready!");
        System.out.println("Stats: [stamina=" + stamina + ", acceleration=" + acceleration + ", strength=" + strength+ "]");
    }

    public int getStamina() { return stamina; }

    public int getAcceleration() { return acceleration; }

    public int getStrength() { return strength; }

    public boolean canPlay() { return true; }
}
