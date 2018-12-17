package builder.classic.car;

import builder.classic.car.entities.Engine;
import builder.classic.car.entities.Tires;

public class Car {
    private Tires tires;
    private Engine engine;

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
