package builder.fluent.burger;

public class Main {
    public static void main(String[] args) {
        // zadeklrowalismy w metodzie builder ze ma zwrocic obiekt typu
        // builder czyli burger.builder
        Burger.Builder burgerBuilder = Burger.builder();
        Burger myBurger = burgerBuilder
                .bread(BreadType.WHEAT)
                .cheese("masdamer")
                .meat("beef")
                .salad("bio lettuce")
                .sauce("cesar")
                .withBacon(true).build();
        System.out.println(myBurger);
        // ctr alt v tworzy nam zmienna jesli nie mamy przypisanej czyli jak mamy
        // sam burgerBuilder, bez Burger myBurger = burgerBuilder

        // mozliwosc po kropkach jest przez to ze wszystkie metody buildera
        // zwracaja this
    }
}
