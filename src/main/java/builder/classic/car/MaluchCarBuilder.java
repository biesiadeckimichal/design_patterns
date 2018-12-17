package builder.classic.car;

import builder.classic.car.entities.Engine;
import builder.classic.car.entities.Tires;

public class MaluchCarBuilder implements CarBuilder {
    private Car car;

    public MaluchCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        Engine engine = new Engine();
        engine.setType("v6");
        car.setEngine(engine);

    }

    @Override
    public void buildTires() {
        Tires tires = new Tires();
        tires.setDurability(30);
        tires.setType("Standard");
        car.setTires(tires);

    }

    @Override
    public Car getCar() {
        return car;
    }


}
