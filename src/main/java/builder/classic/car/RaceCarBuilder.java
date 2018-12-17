package builder.classic.car;

import builder.classic.car.entities.Engine;
import builder.classic.car.entities.Tires;

public class RaceCarBuilder implements CarBuilder {

    private Car car;

    public RaceCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        Engine engine = new Engine();
        engine.setType("v8");
        car.setEngine(engine);
    }

    @Override
    public void buildTires() {
        Tires tires = new Tires();
        tires.setDurability(50);
        tires.setType("Slicks");
        car.setTires(tires);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
