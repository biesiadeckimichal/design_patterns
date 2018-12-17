package builder.classic.car;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new RaceCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.makeCar();
        Car car = carDirector.getCar();
        System.out.println(car);


    }
}
