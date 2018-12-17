package builder.fluent.house;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder().color("red").build();
        System.out.println(house);

    }
}
