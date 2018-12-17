package builder.fluent.ship;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship.Builder()
                .length(100)
                .name("tadeusz")
                .numberOfMasts(4)
                .type("war")
                .build();

        System.out.println(ship);
    }


}
