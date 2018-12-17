package builder.fluent.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .color("red")
                .build();
        System.out.println(car);
    }
}
