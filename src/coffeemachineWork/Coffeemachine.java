package coffeemachineWork;

public class Coffeemachine {
    private int currentAmountOfWater;
    private final int MAX_AMOUNT_WATER = 1000;
    private double currentAmountOfCoffee;
    private final double MAX_AMOUNT_COFFEE = 500;
    private final double CONSUMPTION_STRONG_COFFEE = 40;
    private Coffee coffee;

    public String getCurrentAmountOfCoffee() {
        return "Кофе осталось " + currentAmountOfCoffee + " г";
    }

    public String getCurrentAmountOfWater() {
        return "Воды осталось " + currentAmountOfWater + " мл";
    }

    public String addWater(int amountOfWater) {
        currentAmountOfWater += amountOfWater;
        if (amountOfWater < (MAX_AMOUNT_WATER - currentAmountOfWater)) {
            return "Можно добавить еще " + (MAX_AMOUNT_WATER - currentAmountOfWater) + " мл воды";
        } else {
            return "Емкость для воды заполнена";
        }
    }

    public String addCoffee(double amountOfCoffee, Coffee coffee) {
        currentAmountOfCoffee += amountOfCoffee;
        this.coffee = coffee;
        if (amountOfCoffee < (MAX_AMOUNT_COFFEE - currentAmountOfCoffee)) {
            return "Можно добавить еще " + (MAX_AMOUNT_COFFEE - currentAmountOfCoffee) + " г кофе";
        } else {
            return "Емкость для кофе заполнена";
        }
    }

    public String makeCoffee(double coffeeStrength, int cup) {
        if (cup > currentAmountOfWater) {
            return "Долейте воды";
        }
        else if (currentAmountOfCoffee < CONSUMPTION_STRONG_COFFEE * coffeeStrength) {
            return "Досыпьте кофе";
        } else currentAmountOfWater -= cup;
        currentAmountOfCoffee -= CONSUMPTION_STRONG_COFFEE * coffeeStrength;
        return "Готовлю " + coffee.getCoffeeDescription() + " объемом " + cup + " крепость " + coffeeStrength;
    }
}





