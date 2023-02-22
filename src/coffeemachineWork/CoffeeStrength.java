package coffeemachineWork;

public enum CoffeeStrength {
    MILD(0.5),
    NORMAL(0.75),
    STRONG(1.0);

    double coffeeStrength;

    private CoffeeStrength(double coffeeStrength) {
        this.coffeeStrength = coffeeStrength;
    }

    public double getCoffeeStrength() {
        return coffeeStrength;
    }
}
