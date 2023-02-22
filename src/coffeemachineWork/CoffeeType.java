package coffeemachineWork;

public enum CoffeeType {
    GROUND("молотый"),
    BEANS("в зернах");

    String description;

    CoffeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
