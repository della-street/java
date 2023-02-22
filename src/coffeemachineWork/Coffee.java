package coffeemachineWork;

public class Coffee {
    private CoffeeType coffeeType;
    private String name;

    public Coffee(String name, CoffeeType coffeeType) {
        this.name = name;
        this.coffeeType = coffeeType;
    }

    public String getCoffeeDescription() {
        return name + " " + coffeeType.getDescription();
    }
}

