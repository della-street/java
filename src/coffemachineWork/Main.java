package coffemachineWork;

public class Main {
    public static void main(String[] args) {

        Coffee jacobs = new Coffee("Jacobs");
        Coffeemachine supermachine = new Coffeemachine();


        System.out.println(supermachine.makeCoffee(0.5, 800));

        supermachine.addWater(900);

        supermachine.makeCoffee(0.5, 200);

        System.out.println(supermachine.makeCoffee(0.5, 200));

        supermachine.addCoffee(100.0, jacobs);

        System.out.println(supermachine.makeCoffee(0.5, 300));

        System.out.println(supermachine.getCurrentAmountOfWater());

        System.out.println(supermachine.getCurrentAmountOfCoffee());


    }
}